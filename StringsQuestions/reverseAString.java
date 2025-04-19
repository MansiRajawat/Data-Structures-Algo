package StringsQuestions;

public class reverseAString {
    public static void main(String[] args) {
        String str1= "coding to welcome";

        String result1 = reverseAString(str1);
        System.out.println("reverse of the word  "+ result1);
    }
    private static String reverseAString(String str1) {
        StringBuilder sb = new StringBuilder();

        String [] strArr = str1.split(" ");

        for(int i= strArr.length -1; i >=0; i--){
            sb.append(strArr[i]);

            if(i !=0){
                sb.append(" ");
            }
        }
        return sb.toString();

    }
}
