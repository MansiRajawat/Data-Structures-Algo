package StringsQuestions;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        //output- geeksskeeg - as this is the longest palindromic string.

         //1. we need to use 2 for loop here to calculate the substring
        //2.get the substring from i to j+1 string.substring(i, j+1) , why j+1?

        //  let's take an example if i=1 and j = 3 , we want to get all the substring
        // from 1 to 3 , the end index to get included in substring which is 3 here of the substring
        // , we need to add 3+1 , which is = 4 , and 4th index won't be included in the substring so only 1-3 substring will be found

       //3.we need to check for the palindrome of the substring , and if the length of the substring is
        //greater than the maxlength then assign the maxlength as the substring length.

        //and return the longestSubstring.
        String result = longestPalindromicSubstring(s);

        System.out.println(result);
    }

    private static String longestPalindromicSubstring(String s) {
        String longestSubstring = "";
        int maxLength = 0;
        for(int i=0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){

                String substring = s.substring(i, j+1);

                if(isPalindrome(substring) && substring.length() > maxLength){
                    longestSubstring = substring;
                    maxLength = substring.length();
                }
            }
        }
        return longestSubstring;
    }

    private static boolean isPalindrome(String substring) {
        String sb = new StringBuilder(substring).reverse().toString();
        return sb.equals(substring);

    }
}
