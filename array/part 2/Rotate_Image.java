public class Rotate_Image {
   // Method to rotate a square matrix 90 degrees clockwise
   public static void rotate(int[][] matrix) {
      int n = matrix.length;

      // Transpose the matrix
      for (int i = 0; i < n; i++) {
         for (int j = i; j < n; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
         }
      }

      // Reverse each column
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n / 2; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n - 1 - j];
            matrix[i][n - 1 - j] = temp;
         }
      }
   }

   // Method to print a matrix
   public static void printMatrix(int[][] matrix) {
      for (int[] row : matrix) {
         for (int num : row) {
            System.out.print(num + " ");
         }
         System.out.println();
      }
   }

   // Simple main method to test the rotate functionality
   public static void main(String[] args) {
      // Test input matrix
      int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
      };

      // Rotate the matrix
      rotate(matrix);

      // Print the rotated matrix
      printMatrix(matrix);
   }

}