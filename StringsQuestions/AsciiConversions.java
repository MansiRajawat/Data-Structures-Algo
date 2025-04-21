package StringsQuestions;

public class AsciiConversions {
    public static void main(String[] args) {
        String numStr = "1234";
        int num = 0;
        int num2 = 1234;
       String words = convertNumberToWords(num2);
        System.out.println(words);
        stringToInteger(numStr);
    }

    private static String convertNumberToWords(int num2) {
        String [] words = {"zero","one","two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String numStr = Integer.toString(num2);
        StringBuilder result = new StringBuilder();
        for(char i : numStr.toCharArray()){

          result.append(words[i - '0']).append(" ");
        }
        return result.toString();
    }

    private static void stringToInteger(String numStr) {
        int num =0;
        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            num =  num*10 + (ch - '0'); // Build the integer
        }

        System.out.println("Converted number: " + num); // Output: 1234
    }
}
