import java.util.HashSet;
import java.util.Set;

public class longest_substring_without_repating_character {
   // Method to find the length of the longest substring without repeating
   // characters
   public static int lengthOfLongestSubstring(String s) {
      // Initialize pointers and variables
      int left = 0; // Left pointer
      int right = 0; // Right pointer
      Set<Character> seen = new HashSet<>(); // Set to keep track of seen characters
      int max = 0; // Maximum length of substring without repeating characters

      // Iterate through the string
      while (right < s.length()) {
         char c = s.charAt(right);

         // If the character is not in the set, add it and update the maximum length
         if (seen.add(c)) {
            max = Math.max(max, right - left + 1);
            right++;
         } else {
            // If the character is already in the set, move the left pointer until the
            // repeated character is removed
            while (s.charAt(left) != c) {
               seen.remove(s.charAt(left));
               left++;
            }
            seen.remove(c);
            left++;
         }
      }

      // Return the maximum length of substring without repeating characters
      return max;
   }

   // Main method for testing
   public static void main(String[] args) {
      String input = "abcabcbb";
      int result = lengthOfLongestSubstring(input);
      System.out.println("Length of the longest substring without repeating characters: " + result);
   }
}
