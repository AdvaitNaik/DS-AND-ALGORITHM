package GREEDYALGORITHM;

import java.io.*;
import java.lang.*;
import java.util.*;

// Time Complexity -> O(N log N) + O(N*M).
//         O(N log N ) for sorting the jobs in decreasing order of profit. 
//         O(N*M) since we are iterating through all N jobs and for every job we are checking from the last deadline, 
//         say M deadlines in the worst case.

// Space Complexity -> O(M) for an array that keeps track on which day which job is performed 
//                     if M is the maximum deadline available.

// approach-
// 1) Sort the jobs in descending order of profit. 
// 2) If the maximum deadline is x, make an array of size x .Each array index is set to -1 initially as no jobs have been performed yet.
// 3) For every job check if it can be performed on its last day.
// 4) If possible mark that index with the job id and add the profit to our answer. 
// 5) If not possible, loop through the previous indexes until an empty slot is found.

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z) {
       this.id = x;
       this.deadline = y;
       this.profit = z;
    }
}

public class Job_Sequencing {
    int[] JobScheduling(Job arr[], int n) {
        Arrays.sort(arr, (a,b) -> (b.profit - a.profit));

        int max = 0;
        int countJobs = 0, 
        jobProfit = 0;


        for (int i = 0; i < n; i++){
            if (arr[i].deadline > max)
            max = arr[i].deadline;
        }

        int result[] = new int[max+1];
        for (int i = 1; i <= max; i++){
            result[i] = -1;
        }

        for (int i = 0; i < n; i++){
            for (int j = arr[i].deadline; j>0; j--){
                if (result[j] == -1){
                    result[j] = i;
                    countJobs++;
                    jobProfit += arr[i].profit;
                    break;
                }
            }
        }

        int ans[] = new int[2];
        ans[0] = countJobs;
        ans[1] = jobProfit;
        return ans;
        
    }
}


class Main {
    public static void main(String[] args) throws IOException {
 
       //size of array
       Job[] arr = new Job[4];
       arr[0] = new Job(1, 4, 20);
       arr[1] = new Job(2, 1, 10);
       arr[2] = new Job(3, 2, 40);
       arr[3] = new Job(4, 2, 30);
 
       Job_Sequencing js = new Job_Sequencing();
 
       //function call
       int[] res = js.JobScheduling(arr, 4);
       System.out.println(res[0] + " " + res[1]);
 
    }
 }