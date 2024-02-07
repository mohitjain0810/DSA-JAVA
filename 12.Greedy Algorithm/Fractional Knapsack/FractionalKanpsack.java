import java.util.Arrays;
import java.util.Comparator;

public class FractionalKanpsack {

   public static void main(String[] args) {
      // Values of items
      int val[] = { 60, 100, 120 };

      // Weights of items
      int weight[] = { 10, 20, 30 };

      // Maximum weight that the knapsack can hold
      int w = 50;

      // Create a 2D array to store the index and ratio of value to weight for each
      // item
      double ratio[][] = new double[val.length][2];
      // 0th column => idx; 1st column => ratio

      // Calculate the ratio of value to weight for each item and store it in the 2D
      // array
      for (int i = 0; i < val.length; i++) {
         ratio[i][0] = i;
         ratio[i][1] = val[i] / (double) weight[i];
      }

      // Sort the items based on their ratios in ascending order
      Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

      // Initialize variables for remaining capacity and final value
      int capacity = w;
      int finalVal = 0;

      // Iterate through the sorted items and add them to the knapsack
      for (int i = ratio.length - 1; i >= 0; i--) {
         int idx = (int) ratio[i][0];

         // Check if the item can fully fit into the knapsack
         if (capacity >= weight[idx]) {
            finalVal += val[idx];
            capacity -= weight[idx];
         } else {
            // If the item cannot fully fit, add a fraction of it to maximize value
            finalVal += (ratio[i][1] * capacity);
            capacity = 0;
            break;
         }
      }

      // Print the final value obtained from the knapsack
      System.out.println("Final value = " + finalVal);
   }
}
