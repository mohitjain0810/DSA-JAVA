public class Set_matrix_Zeros {
   // Method to set zeroes in the matrix based on markers in the first row and
   // column
   public static void setZeroes(int[][] matrix) {
      boolean firstRowHasZero = false;
      boolean firstColHasZero = false;

      // Set markers in the first row and first column
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == 0) {
               if (i == 0)
                  firstRowHasZero = true;
               if (j == 0)
                  firstColHasZero = true;
               matrix[i][0] = 0;
               matrix[0][j] = 0;
            }
         }
      }

      // Replace inner matrix based on markers
      for (int i = 1; i < matrix.length; i++) {
         for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
               matrix[i][j] = 0;
            }
         }
      }

      // Set zeroes in the first row if the marker was set
      if (firstRowHasZero) {
         for (int j = 0; j < matrix[0].length; j++) {
            matrix[0][j] = 0;
         }
      }

      // Set zeroes in the first column if the marker was set
      if (firstColHasZero) {
         for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = 0;
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

   // Main method to test the setZeroes functionality
   public static void main(String[] args) {

      // Test input matrix
      int[][] matrix = {
            { 0, 1, 2, 0 }, 
            { 3, 4, 5, 2 },
            { 1, 3, 1, 5 }
      };

      // Set zeroes in the matrix
      setZeroes(matrix);

      // Print the updated matrix
      printMatrix(matrix);
   }
}
