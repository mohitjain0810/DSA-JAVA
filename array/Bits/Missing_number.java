public class Missing_number {
   public static void main(String[] args) {
      // Test case: Find the missing number in an array
      int[] inputArray = { 3, 0, 1, 4, 5 };
      int missingNumber = missingNumber(inputArray);

      // Display the result
      System.out.println("The missing number is: " + missingNumber);
      // Expected output: The missing number is: 2
   }

   public static int missingNumber(int[] arr) {
      // Variable to store the XOR of all numbers from 0 to n
      int allXOR = 0;

      // Calculate the XOR of all numbers from 0 to n
      int n = arr.length;
      for (int i = 0; i <= n; i++) {
         allXOR = allXOR ^ i;
      }

      // XOR the result with each element in the array
      for (int num : arr) {
         allXOR = allXOR ^ num;
      }

      // The remaining value is the missing number
      return allXOR;
   }
}
