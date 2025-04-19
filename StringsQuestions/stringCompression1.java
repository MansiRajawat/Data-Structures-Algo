package StringsQuestions;

public class stringCompression1 {
    public static void main(String[] args) {
        String str3 =   "aabcccccaaa";
        // output "a2b1c5a3".

        String outputCompression = stringCompression1(str3);
        System.out.println("string compression output ..."+ outputCompression);
    }

    private static String stringCompression1(String str3) {

        //first we need to iterate till the length of the string, initialise as i-0
        //initialise j = i;
        //if j < length and i and j values are same , move the j
        //then append the value of i in stringbuilder //then get the length
        //count the occurance using j-i; store it in length if the length is > 1, then append the length in the builder
        //initialise the i value with j

        //aabcccccaaa

        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i < str3.length()){
            int j=i;

            while(j < str3.length() && str3.charAt(i) == str3.charAt(j)){
                j++;
            }
            sb.append(str3.charAt(i));

            int length = j-i;
            if(length >1){
                sb.append(length);
            }
            i = j;


        }

        return sb.toString();
    }
}
