package ArraysQuestions;

public class longestSubarrayWithSumK {
    public static void main(String[] args) {
        int [] arr2= {10, 5, 2, 7, 1, 9};
        int K = 15;
        int longestSubarray = longestSubarrayWithSumK(arr2, K);
        System.out.println("longest sub array sum  "+ longestSubarray);
    }

    // O(N)^3
    private static int longestSubarrayWithSumK(int[] arr2, int K) {
        //to get the output , find all the subarray then check the sum
        int longest = 0;
        for(int i =0; i < arr2.length; i++){
            for(int j = i ; j < arr2.length; j++){
                int sum =0;
                for(int k = i ; k <= j ; k++){
                    sum = sum + arr2[k];
                }
                if(sum == K){
                    longest = Math.max(longest, j - i +1);
                }
            }
        }
        return  longest;
    }
}
