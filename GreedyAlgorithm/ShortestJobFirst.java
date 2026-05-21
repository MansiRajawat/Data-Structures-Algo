package GreedyAlgorithm;

import java.util.Arrays;

public class ShortestJobFirst {
    public static void main(String[] args) {
    /* The shortest job first (SJF) or shortest job next, is a scheduling policy that selects the waiting process with the smallest
    execution time to execute next. Given an array of integers bt[] of size n. Array bt[] denotes the burst time of each process.
    Calculate the average waiting time of all the processes and return the nearest integer which is smaller or equal to the output.
    Note: Consider all process are available at time 0. */

        int[] arr = {4,3,7,1,2};

        int result = shortestJobFirst(arr);
        System.out.println(result);


        }

    private static int shortestJobFirst(int[] arr) {

        Arrays.sort(arr);
        int time =0, waitTime =0;

        for(int i=0; i < arr.length; i++){
            waitTime = waitTime + time;

            time = time + arr[i];
        }

        return waitTime/arr.length;
    }
}



