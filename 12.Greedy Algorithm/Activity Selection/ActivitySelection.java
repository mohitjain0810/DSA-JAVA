import java.util.*;

public class ActivitySelection {
   public static void main(String[] args) {
      // Arrays representing the start and end times of activities
      int start[] = { 1, 2, 0, 5, 8, 5 };
      int end[] = { 2, 4, 6, 7, 9, 9 };

      // Sorting activities based on their end times
      int maxAct = 0; // Variable to store the maximum number of activities
      ArrayList<Integer> ans = new ArrayList<>(); // ArrayList to store the selected activity indices

      // Select the first activity
      maxAct = 1;
      ans.add(0);
      // Variable to store the end time of the last selected activity
      int lastEnd = end[0];

      // Loop through the activities starting from the second one
      for (int i = 1; i < end.length; i++) {
         // Check if the start time of the current activity is greater or equal to the
         // end time of the last selected activity, indicating no overlap
         if (start[i] >= lastEnd) {
            // Select the current activity
            maxAct++;
            ans.add(i);
            // Update lastEnd to the end time of the current activity
            lastEnd = end[i];
         }
      }

      // Print the results
      System.out.println("Maximum Activities = " + maxAct);
      System.out.print("Selected Activities: ");
      for (int i = 0; i < ans.size(); i++) {
         System.out.print("A" + ans.get(i) + " ");
      }
   }
}