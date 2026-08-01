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
        int [] newArr = new int[arr.length];

        int leftProduct =1;
        //get the left product
        for(int i=0; i < arr.length; i++){
            newArr[i] = leftProduct;
            leftProduct = leftProduct * arr[i];
        }

        //get the right product
        int rightProduct=1;
        for(int i= arr.length-1; i >=0; i--){
            newArr[i] = newArr[i] * rightProduct;
            rightProduct = rightProduct * arr[i];
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
