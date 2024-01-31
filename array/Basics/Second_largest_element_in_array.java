import java.util.*;

public class Second_largest_element_in_array {
   // TC-(n)
   public static void main(String[] args) {

      // unsorte array
      int nums[] = { 1, 9, 5, 55, 8, -1, 3, 55 };

      int n = nums.length;

      int highest = Integer.MIN_VALUE;
      int secondHigest = Integer.MIN_VALUE;

      // Traveesing an array
      for (int i = 0; i < n; i++) {

         if (nums[i] > highest) {
            secondHigest = highest;
            highest = nums[i];
         }
         if (nums[i] < highest && nums[i] > secondHigest) {
            secondHigest = nums[i];
         }
      }
      System.out.println("Second higest number " + secondHigest);
   }
}
