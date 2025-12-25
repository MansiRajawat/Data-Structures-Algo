package StringsQuestions;

public class ValidPalindrome1 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        String newStr = sb.toString();
        String str = "";
        for(int i = newStr.length() -1; i >=0; i--){
            str = str + newStr.charAt(i);
        }

        return str.equals(newStr);
    }
}
