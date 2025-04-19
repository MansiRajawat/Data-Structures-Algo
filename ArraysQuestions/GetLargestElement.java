package ArraysQuestions;

public class GetLargestElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        getLargestElement(arr);
    }
    private static void getLargestElement(int[] arr) {
        int tempVal= Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > tempVal){
                tempVal= arr[i];
            }

        }

        System.out.println( tempVal);
    }

}
