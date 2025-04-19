package ArraysQuestions;

public class GetSecondLargestElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        getSecondLargestElement(arr);
    }
    private static void getSecondLargestElement(int[] arr) {
        int tempVal = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > tempVal){
                tempVal= arr[i];
            }

        }

        for(int i=0; i < arr.length; i++){
            if(arr[i] > secondLargest && arr[i] != tempVal){
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }
}
