public class Sum_Of_two_integer {
   public static void main(String[] args) {
      // Test cases
      int result1 = getSum(3, 5);
      int result2 = getSum(-7, 2);

      // Display results
      System.out.println("Result 1: " + result1); // Expected output: 8
      System.out.println("Result 2: " + result2); // Expected output: -5
   }

   // Method to calculate the sum of two integers without using the '+' operator
   public static int getSum(int a, int b) {
      // If b is positive, increment 'a' by b times
      if (b > 0) {
         for (int i = 0; i < b; i++) {
            a++;
         }
      }
      // If b is negative, decrement 'a' by |b| times
      else if (b < 0) {
         for (int i = 0; i > b; i--) {
            a--;
         }
      }
      // Return the result
      return a;
   }
}
