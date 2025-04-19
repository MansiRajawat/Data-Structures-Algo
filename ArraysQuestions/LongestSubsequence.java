package ArraysQuestions;

public class LongestSubsequence {
    public static void main(String[] args) {
        int[] arr1 = {100, 4, 200, 1, 3, 2};
        int longestSubSeq = longestConsecutiveSequenceOfAnArray(arr1);
        System.out.println(longestSubSeq);

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
