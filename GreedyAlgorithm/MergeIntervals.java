package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        //Given an array of intervals where intervals[i] = [starti, endi],
        // merge all overlapping intervals, and return an array of the non-overlapping intervals
        // that cover all the intervals in the input.

        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};


        // we need to check below steps

        // if the start 1 time is less than ending 2 time -> that means it is overlapping
        // if the start 1 time is greater than ending 2 time -> it is not overlapping
        // we need to create a list to store the values
        // if the array is not sorted then sort the array to get the inital start time that will be the base condition
        // store the values after sort, or if the values are already sorted in the question , just store the start index
        // in the list. start the loop from 1 index , then have 2 variables - start and last -> last will the last index of list
        // if the start 1 time is less than ending 2 time -> get the max of the end 1 and end 2

        //sort if needed based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));


        List<int[]> merged = new ArrayList<>();

        merged.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] start = intervals[i];

            int[] last = merged.get(merged.size() - 1);

            if ( start[0] <= last[1] ) {
                last[1] = Math.max(start[1], last[1]);

            } else {
                merged.add(start);
            }

        }

        merged.toArray(new int[merged.size()][]);

        for (int[] i : merged) {
            for (int val : i) {
                System.out.print(val + " ");
            }
            System.out.println();
        }


    }


}
