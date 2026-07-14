package ArraysQuestions;

import java.util.HashSet;

public class LongestSubsequence {
    public static void main(String[] args) {
        int[] arr1 = {100, 4, 200, 1, 3, 2};
        int longestSubSeq = longestConsecutiveSequenceOfAnArray(arr1);
        int longestSubsequence = longestConsecutiveSequenceOfAnArray2(arr1);
        System.out.println(longestSubSeq);
        System.out.println(longestSubsequence);

    }

    private static int longestConsecutiveSequenceOfAnArray2(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }
        int longest = 0;
        for(int i=0; i < arr.length ; i++){
            //check if the set doesn't contain the previous number then go to if check
            if(!set.contains(arr[i] -1)){
                int count = 1;
                //increment the count only when we have the element present
                for(int j = arr[i] +1; set.contains(j) ; j++){
                    count++;
                }

                longest = Math.max(longest, count);


            }
        }

        return longest;

    }

    private static int longestConsecutiveSequenceOfAnArray(int[] arr1) {

        //we need to check if the next element is also equal to the element of an array
        // example 1,2,3,4 -> arr[i] -> 1+1  == 2 ( arr[i]
        int longest = 1;

        for(int i=0; i < arr1.length; i++){
            int count = 1;
            int num = arr1[i];

            while(search(arr1, num + 1)){
                num = num +1;
                count ++;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }

    private static boolean search(int[] arr1, int num){
        for(int i=0; i < arr1.length; i++){
            if(arr1[i] == num) {
                return true;
            }
        }
        return  false;
    }
}
