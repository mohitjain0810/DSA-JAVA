public class Palindrome_String {
   public static void main(String[] args) {
      String str = "racecar";
      System.out.println(isPalindrome(str));
   }

   public static boolean isPalindrome(String str) {
      for (int i = 0; i < str.length() / 2; i++) {
         int n = str.length();
         if (str.charAt(i) != str.charAt(n - 1 - i)) {
            return false;
         }
      }
      return true;
   }
}
