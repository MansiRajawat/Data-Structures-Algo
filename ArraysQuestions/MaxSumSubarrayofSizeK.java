package ArraysQuestions;

public class MaxSumSubarrayofSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int K = 3;


        int maxSum =0;

        for(int i=0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){

                if(j - i +1 == K){
                    int maxWindow =0;
                    for(int k = i; k <= j ; k++){
                        maxWindow = maxWindow + arr[k];
                    }
                    maxSum = Math.max(maxSum, maxWindow);
                }
            }
        }

        System.out.println("max subarray sum with k "+ maxSum);
    }
}
