package ArraysQuestions;

public class SumOfSubarrayRanges {
    public static void main(String[] args) {
        //sum of subarray ranges

        int [] arr3 = {1,2,3};

        int sum =0;
        for(int i=0; i < arr3.length; i++){
            int smallest = arr3[i];
            int largest = arr3[i];
            for(int j = i; j< arr3.length; j++){

                smallest = Math.min(smallest, arr3[j]);

                largest = Math.max(largest, arr3[j]);

                int length = largest  - smallest;

                sum = sum + length;


            }
        }

        System.out.println(sum);
    }
}
