package ArraysQuestions;

public class ProductOfSubarrayExceptSelf {
    public static void main(String[] args) {
        int [] arr = {10, 3, 5, 6, 2};
        int [] newArr = new int[arr.length];

        //output - 180,600,360,300,900

//the logic is , we need one for loop that traverse from o to length
// another for loop also should traverse from 0 to length as we need to include the first element everytime
        // if the index of i and j are not same we need to multiply all the elements. and then store it
        //in the new array.

        for(int i=0; i < arr.length; i++){
            int product = 1;

            for(int j=0; j < arr.length; j++){

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
