package ArraysQuestions;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,8,9};

        int[] result = plusOne(digits);

        System.out.println(Arrays.toString(result));
    }

    private static int[] plusOne(int[] digits) {

        int carry =1;

        for(int i = digits.length -1; i >=0; i--){
            int sum = digits[i] + carry;

            carry = sum /10;

            digits[i] = sum %10;
        }

        return digits;
    }
}
