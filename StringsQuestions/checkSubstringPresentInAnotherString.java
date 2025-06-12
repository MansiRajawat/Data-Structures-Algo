package StringsQuestions;

public class checkSubstringPresentInAnotherString {
    public static void main(String[] args) {
        String newStr = "aeeksforgeeks";
        String substr = "geeks";
        boolean isSubstringPresent = checkSubstringPresentInAnotherString(newStr, substr);
        boolean isSubstringPresent2 = checkSubstringPresentInAnotherString2(newStr, substr);

        System.out.println("isSubstringPresent,...."+ isSubstringPresent2);
    }
    private static boolean checkSubstringPresentInAnotherString(String newStr, String substr) {
        //we need to substract the length of string 1 from stirng 3 to have enough length to compare because at end
        // if not sufficient length is present we cannot compare

        for(int i=0; i <= newStr.length() - substr.length(); i++){
            boolean match = true;
            for(int j = 0; j < substr.length(); j++){

                if(newStr.charAt(i + j) != substr.charAt(j)){
                    match = false;
                    break;
                }

            }
            if(match){
                return true;
            }
        }
        return false;
    }

    private static boolean checkSubstringPresentInAnotherString2(String newStr, String substr) {
        //we need to substract the length of string 1 from stirng 3 to have enough length to compare because at end
        // if not sufficient length is present we cannot compare

        for(int i=0; i <= newStr.length() - substr.length(); i++){
          String sub = newStr.substring(i , i + substr.length());

          if(sub.equals(substr)){
              return true;
          }
        }
        return false;
    }
}
