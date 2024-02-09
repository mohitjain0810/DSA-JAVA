import java.util.Arrays;

public class MinPlatforms {
   // Function to find the minimum number of platforms required at the
   // railway station such that no train waits.
   static int findPlatform(int arr[], int dep[], int n) {
      Arrays.sort(arr);
      Arrays.sort(dep);
      int count = 0;
      int max = 0;
      int i = 0, j = 0;
      while (i < n && j < n) {
         if (arr[i] <= dep[j]) {
            count++;
            max = Math.max(max, count);
            i++;
         } else if (arr[i] > dep[j]) {
            count--;
            j++;
         }
      }
      return max;
   }

   // Main method for demonstration
   public static void main(String[] args) {
      int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
      int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
      int n = arr.length;

      int platforms = findPlatform(arr, dep, n);
      System.out.println("Minimum number of platforms required: " + platforms);
   }
}
