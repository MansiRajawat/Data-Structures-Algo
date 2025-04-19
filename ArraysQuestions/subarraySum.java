package ArraysQuestions;

public class subarraySum {
    public static void main(String[] args) {
        int [] arr3 ={1, 2, 3};
        int target = 3;
        int countSubArrayWithGivenSum = subarraySum(arr3, target);
        System.out.println(countSubArrayWithGivenSum);
    }
    private static int subarraySum(int[] arr3, int target) {
        int count =0;
        for(int i=0; i < arr3.length; i++){
            for(int j=i; j < arr3.length; j++){
                int sum = 0;
                for(int k= i; k <= j ; k++){
                    sum = sum + arr3[k];
                }

                if(sum == target){
                    count++;
                }
            }
        }
        return count;
    }
}
