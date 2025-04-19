package ArraysQuestions;

public class SumAlternateOddDigitFromAnArray {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        sumAlternateOddDigitFromAnArray(num);
    }
    private static void sumAlternateOddDigitFromAnArray(int[] num) {

        int sum =0;
        for(int i=0; i < num.length; i+=2){
            sum = sum+num[i];

        }
        System.out.println(sum);
    }
}
