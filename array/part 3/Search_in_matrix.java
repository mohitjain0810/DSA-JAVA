public class Search_in_matrix {
   // Main method to search for a target value in a 2D matrix
   public static boolean searchMatrix(int[][] matrix, int target) {
      //O(M+N) tc and O(1) sc
      // Starting from the top-right corner
      int row = 0;
      int col = matrix[0].length - 1;

      // Iterate until we go out of bounds
      while (row < matrix.length && col >= 0) {
         // Check the current element
         if (matrix[row][col] == target) {
            return true; // Target found
         } else if (matrix[row][col] > target) {
            col--; // Move left in the current row
         } else if (matrix[row][col] < target) {
            row++; // Move down to the next row
         }
      }

      // Target not found in the matrix
      return false;
   }

   // Main method to test the searchMatrix function
   public static void main(String[] args) {

      // Example usage
      int[][] matrix = {
            { 1, 4, 7, 11 },
            { 2, 5, 8, 12 },
            { 3, 6, 9, 16 },
            { 10, 13, 14, 17 }
      };

      int target = 2;
      boolean result = searchMatrix(matrix, target);

      // Print the result
      System.out.println("Target " + (result ? "found" : "not found") + " in the matrix.");
   }
}
