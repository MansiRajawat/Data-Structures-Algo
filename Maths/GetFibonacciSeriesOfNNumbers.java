package Maths;

public class GetFibonacciSeriesOfNNumbers {
    public static void main(String[] args) {
        int n =10;
        getFibonacciSeriesOfNNumbers( n);
    }
    private static void getFibonacciSeriesOfNNumbers(int n) {
        //0,1,1,2,3,5,8,13,21,34
        int num1 = 0;
        int num2 = 1;
        for(int i= 2; i <n ; i++){
            int num3 = num1+num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;

        }

    }
}
