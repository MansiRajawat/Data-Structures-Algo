package StringsQuestions;

public class ReverseVowelsInAString {
    public static void main(String[] args) {
        String s = "icecream";

        StringBuilder vowelsSb = new StringBuilder();

        for(int i=0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                vowelsSb.append(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder(s);

        int idx = vowelsSb.length() -1;

        for(int i=0; i < s.length() ; i++){
            if(isVowel(s.charAt(i))){
                sb.setCharAt(i , vowelsSb.charAt(idx--));
            }
        }

        System.out.println("reverse vowels in a string ----> "+sb.toString());
    }

    private static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }


}
