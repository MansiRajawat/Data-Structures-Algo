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

        //kadane's algorithm

        int current_max = arr1[0];
        int global_max = arr1[0];

        for(int i=0; i < arr1.length; i++){
            current_max = Math.max(arr1[i], current_max + arr1[i]);

            global_max = Math.max(current_max, global_max);
        }

        System.out.println(global_max);
    }
}
