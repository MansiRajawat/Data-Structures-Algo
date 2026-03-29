package GreedyAlgorithm;

public class LemonadeChange {
    public static void main(String[] args) {
        /*

        At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills).
        Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.
        You must provide the correct change to each customer so that the net transaction is that the customer pays $5.
        Note that you do not have any change in hand at first.
        Given an integer array bills where bills[i] is the bill the ith customer pays,
        return true if you can provide every customer with the correct change, or false otherwise.
         */

        int[] arr = {5,5,10,10,20};
        /*
        Solution:
        We track:
                    count of $5 bills
                    count of $10 bills
                  Because:
                    $5 is most important for change
                    Prefer giving change using 10 + 5 instead of three 5s
         */
        System.out.println(doesLemonadeProvideChange(arr));



    }

    private static boolean doesLemonadeProvideChange(int[] arr) {
        int five = 0, ten =0;
        for(int bill : arr){
            if(bill == 5){
                five++;
            } else if(bill == 10){
                if(five >0) {
                five--;
                ten++;
            } else {
                    return  false;
                }
            } else {
                //bill is 20
                if(five >0 && ten > 0){
                    five--;
                    ten--;
                } else if(five >=3){
                    five = five -3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
