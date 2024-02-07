import java.util.*;

public class lexicographicalString {
   public static void main(String[] args) {
      String[] fruits = { "papaya", "apple", "watermelon", "kiwi", "mango" };
      sortfruits(fruits);
      for (String val : fruits) {
         System.out.print(val + " ");
      }
   }

   public static void sortfruits(String[] fruits) {
      int n = fruits.length;

      for (int i = 0; i < n - 1; i++) {
         int min_index = i;
         for (int j = i + 1; j < n; j++) {
            if (fruits[j].compareTo(fruits[min_index]) < 0) {
               min_index = j;
            }
         }
         // swap fruits[min_index], fruits[i]
         String temp = fruits[i];
         fruits[i] = fruits[min_index];
         fruits[min_index] = temp;
      }
   }
}
