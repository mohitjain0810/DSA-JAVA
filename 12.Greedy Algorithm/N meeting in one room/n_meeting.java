import java.util.Arrays;
import java.util.Comparator;

public class n_meeting {
   // Function to find the maximum number of meetings that can
   // be performed in a meeting room.
   public static int maxMeetings(int start[], int end[], int n) {
      // Create an array to store the meetings as objects with start and end times
      Meeting[] meetings = new Meeting[n];
      for (int i = 0; i < n; i++) {
         meetings[i] = new Meeting(start[i], end[i]);
      }

      // Sort the meetings based on their end times
      Arrays.sort(meetings, Comparator.comparingInt(o -> o.end));

      // Variable to store the maximum number of meetings
      int maxMeetings = 0;
      // Variable to store the end time of the last selected meeting
      int lastEnd = -1;

      // Loop through the sorted meetings
      for (Meeting meeting : meetings) {
         // Check if the start time of the current meeting is greater than the
         // end time of the last selected meeting, indicating no overlap
         if (meeting.start > lastEnd) {
            // Select the current meeting
            maxMeetings++;
            // Update lastEnd to the end time of the current meeting
            lastEnd = meeting.end;
         }
      }

      // Return the maximum number of meetings
      return maxMeetings;
   }

   // Inner class representing a meeting with start and end times
   static class Meeting {
      int start, end;

      public Meeting(int start, int end) {
         this.start = start;
         this.end = end;
      }
   }

   // Main method for demonstration
   public static void main(String[] args) {
      int start[] = { 1, 3, 0, 5, 8, 5 };
      int end[] = { 2, 4, 6, 7, 9, 9 };
      int n = start.length;

      int meetings = maxMeetings(start, end, n);
      System.out.println("Maximum number of meetings: " + meetings);
   }
}