import java.util.*;

public class Second_smallest_element_in_array {
   public static void main(String[] args) {

      // unsorte array
      int nums[] = { 1, 9, 5, 55, 8, 3, 55 };

      int n = nums.length;
      int min = Integer.MAX_VALUE;
      int s_min = Integer.MAX_VALUE;

      for (int i = 0; i < n; i++) {
         if (nums[i] < min) {
            s_min = min;
            min = nums[i];
         } else if (nums[i] < s_min)
            s_min = nums[i];
      }
      System.out.println("Second Smallest : " + s_min);
   }
}
