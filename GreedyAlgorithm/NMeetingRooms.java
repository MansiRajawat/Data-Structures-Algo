package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NMeetingRooms {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end =   {2, 4, 6, 7, 9, 9};

        //the questions here is to get the maximum number of meetings that can be conducted in a single meeting room .


        //the logic is to get the earliest meetings to get finish.

        //first we can store all the start time and the end time of the meeting in a list

        // we need to sort the list based on the end time
        //then we can have a count variable as 1 , then initially when we pick the first meeting ( which has the less end time) , we need
        //to store it in the lastEnd

        // we need a for loop for the rest of the meetings,(from index 1 till length)
        //Check if the current meeting starts after the last selected meeting ends.
        //If yes, we select it.
        //Update lastEnd with the current meeting’s end time.

        List<int[]> meetings = new ArrayList<>();


        for(int i=0; i < start.length; i++){
            meetings.add(new int[]{start[i], end[i]});
        }

        Collections.sort(meetings, (a, b) -> a[1] - b[1]);

        int count = 1;
        int lastEnd = meetings.get(0)[1];


        for(int i=1 ; i < meetings.size(); i++){


            if(meetings.get(i)[0] > lastEnd){
                count++;
                lastEnd = meetings.get(i)[1];
            }
        }

        System.out.println("max meeting  "+ count);

    }

}


