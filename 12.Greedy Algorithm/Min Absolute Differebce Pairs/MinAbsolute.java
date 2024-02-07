import java.util.*;

public class MinAbsolute {
   public static void main(String[] args) {
      int A[] = { 4, 1, 8, 7 };
      int B[] = { 2, 3, 6, 5 };

      Arrays.sort(A);
      Arrays.sort(B);

      int minDiff = 0;
      // Calculate the sum of absolute differences for each pair of elements
      for (int i = 0; i < A.length; i++) {
         minDiff += Math.abs(A[i] - B[i]);
         System.out.println("Differences = " + minDiff);

      }
      System.out.println("Minimum Absolute Differences of Pairs = " + minDiff);
   }
}
