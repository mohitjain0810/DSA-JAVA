import java.util.ArrayList;
import java.util.Collections;

public class JobSequence {

   static class Job {
      int deadline;
      int profit;
      int id; // Unique identifier for the job (0 for A, 1 for B, 2 for C, 3 for D, and so on)

      // Constructor to initialize a Job object
      public Job(int id, int deadline, int profit) {
         this.id = id;
         this.deadline = deadline;
         this.profit = profit;
      }
   }

   public static void main(String[] args) {
      // Job information: {deadline, profit}
      int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

      // Create a list to store Job objects
      ArrayList<Job> jobList = new ArrayList<>();

      // Populate the jobList with Job objects
      for (int jobId = 0; jobId < jobsInfo.length; jobId++) {
         jobList.add(new Job(jobId, jobsInfo[jobId][0], jobsInfo[jobId][1]));
      }

      // Lambda function to sort jobs based on profit in descending order
      Collections.sort(jobList, (job1, job2) -> job2.profit - job1.profit);

      // List to store the sequence of jobs with respect to deadlines
      ArrayList<Integer> jobSequence = new ArrayList<>();

      // Iterate through the sorted jobs and add to the sequence if the deadline is
      // met
      int currentTime = 0;
      for (int i = 0; i < jobList.size(); i++) {
         Job currentJob = jobList.get(i);
         if (currentJob.deadline > currentTime) {
            jobSequence.add(currentJob.id);
            currentTime++;
         }
      }
      // Print the sequence
      System.out.println("Max jobs = " + jobSequence.size());
      System.out.print("Job Sequence: ");
      for (int i = 0; i < jobSequence.size(); i++) {
         System.out.print((char) ('A' + jobSequence.get(i)) + " "); // Convert job id to corresponding letter
      }
      System.out.println();
   }
}
