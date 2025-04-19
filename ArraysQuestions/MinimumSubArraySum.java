package ArraysQuestions;

public class MinimumSubArraySum {
    public static void main(String[] args) {
        int [] arr2= {1, 3, 2, 4};
    }
    private static void minimumSubArraySum(int[] arr2) {
        int sum =0;

        for(int i=0; i < arr2.length; i++){
            for(int j =i; j < arr2.length; j++){

                int  min = arr2[i];

                for(int k=i; k <=j ; k++){
                    min = Math.min(min, arr2[k]);
                }

                sum = sum + min;
            }
        }

        System.out.println("minimum sub array sum " +sum);
    }
}
