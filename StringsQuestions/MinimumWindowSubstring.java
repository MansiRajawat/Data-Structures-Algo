package StringsQuestions;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String S = "ADOBGCHBANC";
        String T = "ABC";

        System.out.println(minimumWindowSubstring(S, T));
    }

    private static String minimumWindowSubstring(String s, String t) {
        int minLength = Integer.MAX_VALUE;
        String res = "";
        for(int i=0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String subStr = s.substring(i , j+1);

                if(Contains(subStr, t) ){
                  if(subStr.length() <= minLength){
                      minLength = subStr.length();
                      res = subStr;
                  }
                }
            }
        }

        return res;

    }

    private static boolean Contains(String subStr, String t) {
        int[] freq = new int[256];

        for(char c: subStr.toCharArray()){
            freq[c]++;
        }

        for(char c : t.toCharArray()){
            if(freq[c] == 0){
                return false;
            }

            freq[c]--;
        }
        return true;
    }
}
