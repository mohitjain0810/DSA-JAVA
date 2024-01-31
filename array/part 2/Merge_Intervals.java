import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals {

   public static int[][] merge(int[][] intervals) {
      // Check if there are 1 or fewer intervals, no merging needed
      if (intervals.length <= 1)
         return intervals;

      // Sort intervals based on the start of each interval
      Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

      // List to store the merged intervals
      List<int[]> result = new ArrayList<>();

      // Initialize the newInterval with the first interval
      int[] newInterval = intervals[0];
      result.add(newInterval);

      // Iterate through the sorted intervals and merge overlapping ones
      for (int[] interval : intervals) {
         if (interval[0] <= newInterval[1]) {
            // Merge overlapping intervals
            newInterval[1] = Math.max(interval[1], newInterval[1]);
         } else {
            // Add non-overlapping interval to the result
            newInterval = interval;
            result.add(newInterval);
         }
      }

      // Convert the List to a 2D array and return the result
      return result.toArray(new int[result.size()][]);
   }

   // Main method to test the merge function
   public static void main(String[] args) {

      // Example usage
      int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
      int[][] mergedIntervals = merge(intervals);

      // Print the result
      for (int[] interval : mergedIntervals) {
         System.out.println(Arrays.toString(interval));
      }
   }
}
