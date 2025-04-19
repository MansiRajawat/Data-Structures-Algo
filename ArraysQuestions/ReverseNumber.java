package ArraysQuestions;

public class ReverseNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] temp = new int[arr.length];

        reverseNumber(arr, temp);
    }
    private static void reverseNumber(int[] arr, int[] temp) {
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[arr.length -1 -i];
        }

        for(int val : temp){
            System.out.print(val);
        }
    }
}
