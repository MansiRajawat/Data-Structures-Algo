package ArraysQuestions;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;

        int newArr[] = new int[arr.length];
       // we need to first iterate over the array
        //then in the new array of the same size as original array , we are going to store the values
        // using the below formula
        // example -> ( i +k ) -> i-> 0 , k = 3  (1+4) % arr length , it will store that element in that position.

        for(int i=0; i < arr.length; i++){
            newArr[(i+k)%arr.length] = arr[i];
        }

        for (int i : newArr){
            System.out.println(i);
        }
    }
}
