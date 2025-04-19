package ArraysQuestions;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;

        int newArr[] = new int[arr.length];

        for(int i=0; i < arr.length; i++){
            newArr[(i+k)%arr.length] = arr[i];
        }

        for (int i : newArr){
            System.out.println(i);
        }
    }
}
