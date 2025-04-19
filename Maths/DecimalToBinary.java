package Maths;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 13;
        String result = "";

        while (decimal >0){

            int remainder = decimal %2;

            result = result + remainder;

            decimal = decimal/2;
        }

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(result).reverse().toString());


    }
}
