package StringsQuestions;

public class reverseAString {
    public static void main(String[] args) {
        String str1= "coding to welcome";

        String result1 = reverseAString(str1);
        System.out.println("reverse of the word  "+ result1);
    }
    private static String reverseAString(String str1) {
        StringBuilder sb = new StringBuilder();

        //1. create a string builder to append the string result as well as append the spaces
        //2. split the string into arrays ["coding" , "to" , "welcome"]
        //3. iterate from the last and then append the result and check if the index is not 0 then append spaces
//String [] strArr = str1.split("\\s+"); -> this means
        String [] strArr = str1.split("\\s+");

        for(int i= strArr.length -1; i >=0; i--){
            sb.append(strArr[i]);

            if(i !=0){
                sb.append(" ");
            }
        }
        return sb.toString();

    }
}
