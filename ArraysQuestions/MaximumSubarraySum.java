package ArraysQuestions;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int [] arr1 = {2, 3, -8, 7, -1, 2, 3};
        int result = Integer.MIN_VALUE;
        for(int i =0; i < arr1.length; i++){
            for(int j=i; j < arr1.length; j++){
                int sum = 0;
                for (int k = i; k <=j ; k++){
                    sum = sum + arr1[k];
                }
                result = Math.max(result, sum);
            }
        }
        System.out.println(result);
    }
}
