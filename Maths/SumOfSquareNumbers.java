package Maths;

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        int c= 5;
        /* Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c. */
        boolean res = sumOfSquareNum( c);
        System.out.println(res);
    }

    private static boolean sumOfSquareNum(int c) {
        int value = (int) Math.sqrt(c);
        int[] arr = new int[value+1];

        for(int i=0; i <= value; i++){
            arr[i] = i;
        }

        int left =0;
        int right = arr.length -1;

        while(left <= right){
           int i = arr[left] * arr[left];
           int j = arr[right] * arr[right];

           if(i + j == c){
               return true;
           } else if( i + j < c){
               left++;
           } else {
               right--;
           }
        }

        return false;
    }
}
