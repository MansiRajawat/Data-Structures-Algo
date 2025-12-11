package ArraysQuestions;

public class MinimumSubArraySum {
    public static void main(String[] args) {
        int [] arr2= {1, 3, 2, 4};
        minimumSubArraySum(arr2);
    }
    private static void minimumSubArraySum(int[] arr2) {

        int  result = Integer.MAX_VALUE;
        for(int i=0; i < arr2.length; i++){
            for(int j =i; j < arr2.length; j++){

                int sum =0;

                for(int k=i; k <=j ; k++){
                   sum = sum + arr2[k];
                }

                result = Math.min(result, sum);
            }
        }

        System.out.println("minimum sub array sum " +result);
    }
}
