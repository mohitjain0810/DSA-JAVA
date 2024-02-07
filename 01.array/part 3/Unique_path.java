public class Unique_path {

   public static int uniquePaths(int m, int n) {

      int[][] dp = new int[m][n];

      // Initialize the first row with 1, as there is only one way to reach any cell
      // in the first row
      for (int i = 0; i < dp[0].length; i++) {
         dp[0][i] = 1;
      }

      // Initialize the first column with 1, as there is only one way to reach any
      // cell in the first column
      for (int i = 0; i < dp.length; i++) {
         dp[i][0] = 1;
      }

      // Calculate unique paths for each cell based on the sum of paths from the cell
      // above and the cell to the left
      for (int i = 1; i < dp.length; i++) {
         for (int j = 1; j < dp[0].length; j++) {
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
         }
      }

      // bottom-right cell
      return dp[m - 1][n - 1];
   }

   public static void main(String[] args) {

      // Test case 1
      int m1 = 3;
      int n1 = 7;
      System.out.println("Unique Paths for " + m1 + " x " + n1 + ": " + uniquePaths(m1, n1));

      // Test case 2
      int m2 = 4;
      int n2 = 5;
      System.out.println("Unique Paths for " + m2 + " x " + n2 + ": " + uniquePaths(m2, n2));
   }
}