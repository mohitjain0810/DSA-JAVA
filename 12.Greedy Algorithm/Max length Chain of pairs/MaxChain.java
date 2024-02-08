import java.util.Arrays;
import java.util.Comparator;

public class MaxChain {
   public static void main(String[] args) { // O(nlogn)
      int pairs[][] = { { 5, 20 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

      Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

      int chainLen = 1;
      int chainEnd = pairs[0][1]; // Last selected pair end // chain end

      for (int i = 1; i < pairs.length; i++) {
         if (pairs[i][0] > chainEnd) {
            chainLen++;
            chainEnd = pairs[i][1];
         }
      }
      System.out.println("Maximum Length of Chains = " + chainLen);
   }
}
