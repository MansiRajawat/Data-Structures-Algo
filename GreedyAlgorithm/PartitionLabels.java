package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static void main(String[] args) {
        /*

        You are given a string s. We want to partition the string into as many parts as
        possible so that each letter appears in at most one part. For example, the string
        "ababcc" can be partitioned into ["abab", "cc"], but partitions such as
        ["aba", "bcc"] or ["ab", "ab", "cc"] are invalid.
        Note that the partition is done so that after concatenating all the parts in order,
        the resultant string should be s.
         */

        String s = "ababcbacadefegdehijhklij";

        //  ababcbaca defegde hijhklij -> 3 different partition
        //ababcc
        /*
        1. logic is to first get all the character last index
        2. once we get the last index, we declare start and end variable
        3. end will try to check each character end , if one character end index is less to the other , we need to get the max of the end
        4. if we have the index matches with the end we try to store the length of the partition and also increment the start with i+1;
        5. return the result
         */
        List<Integer> result = getPartitionLabels(s);
        System.out.println(result);
    }

    private static List<Integer> getPartitionLabels(String s) {
        int [] lastIndex = new int[26];

        for(int i=0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        int start =0, end =0;

        List<Integer> list = new ArrayList<>();

        for(int i=0; i < s.length(); i++){
            end = Math.max(end, lastIndex[s.charAt(i) - 'a']);

            if(i == end){
                list.add(end - start +1);
                start = i +1;
            }
        }
        return list;

    }
}
