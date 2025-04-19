package ArraysQuestions;

public class BuyAndSellStock {
    public static void main(String[] args) {
       //buy and sell stock question 1
        //Given an array prices[] of length N,
        // representing the prices of the stocks on different days,
        // the task is to find the maximum profit possible by buying and selling the stocks on different days
        // when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell.

        int arr2[] = {7, 10, 1, 3, 6, 9, 2};
        int result1=0;
        for(int i=0; i < arr2.length; i++){
            for(int j=i+1; j < arr2.length; j++){
                result1 = Math.max(result1, arr2[j] - arr2[i]);
            }
        }

        System.out.println(result1);
    }
}
