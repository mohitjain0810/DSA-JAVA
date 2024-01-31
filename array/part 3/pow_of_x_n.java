public class pow_of_x_n {
   public static double myPow(double x, int n) {
      double ans = 1.0;
      long newn = n; // Use long to avoid overflow
      if (newn < 0) {
         newn = -newn;
         x = 1 / x; // Take the reciprocal for negative power
      }
      while (newn > 0) {
         if (newn % 2 == 1) {
            ans *= x;
            newn--;
         } else {
            x *= x;
            newn /= 2;
         }
      }
      return ans;
   }

   /**
    * Main method for testing the myPow function with sample inputs.
    */
   public static void main(String[] args) {

      // Test cases
      System.out.println(myPow(2.0, 10)); // Expected output: 1024.0
      System.out.println(myPow(2.1, 3)); // Expected output: 9.261
      System.out.println(myPow(2.0, -2)); // Expected output: 0.25
   }
}