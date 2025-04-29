package ArraysQuestions;

public class ProductOfSubarrayExceptSelf {
    public static void main(String[] args) {
        int [] arr = {10, 3, 5, 6, 2};
        //output - 180,600,360,300,900
        productOfSubarrayExceptSelfSolution1(arr);
        System.out.println(" ----------------------------------------------- ");
        productOfSubarrayExceptSelfSolution2(arr);
    }

    private static void productOfSubarrayExceptSelfSolution2(int[] arr) {
        int [] prefix = new int[arr.length];
        int [] suffix = new int[arr.length];
        int [] newArr = new int[arr.length];
        prefix[0] = 1; // we need to set the first index to one

        for(int i = 1; i < arr.length; i++){
            //for index 1 , it will be like arr[ 1 -1 ] = arr[0] = 10
            //prefix[1-1] , prefix[0] = which is set as 1 and so on till the loop terminates.
            prefix[i] = arr[i -1] * prefix[i-1];
        }
        // we need to set the last index to one
        suffix[arr.length -1] = 1;

        for(int i = arr.length -2; i >=0; i--){
             //for index second last , it will be like arr[ 3+1 ] = arr[4] = 2
            //prefix[3+1] , prefix[4] = which is set as 1 and so on till the loop terminates.
            suffix[i] = arr[i+1] * suffix[i+1];

        }

        for(int i=0; i < arr.length; i++){
            newArr[i] = prefix[i] * suffix[i];
        }

        for (int i : newArr){
            System.out.println(i);
        }

    }

    private static void productOfSubarrayExceptSelfSolution1(int[] arr) {
        int [] newArr = new int[arr.length];
        //the logic is , we need one for loop that traverse from o to length
// another for loop also should traverse from 0 to length as we need to include the first element everytime
        // if the index of i and j are not same we need to multiply all the elements. and then store it
        //in the new array.

        for(int i = 0; i < arr.length; i++){
            int product = 1;

            for(int j = 0; j < arr.length; j++){

                if(i != j){

                    product = product * arr[j];
                }
            }

            newArr[i] = product;
        }

        for (int i : newArr){
            System.out.println(i);
        }
    }
}
