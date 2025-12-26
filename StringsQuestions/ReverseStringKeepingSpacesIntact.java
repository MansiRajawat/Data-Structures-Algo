package StringsQuestions;

public class ReverseStringKeepingSpacesIntact {
    public static void main(String[] args) {
        // String s = "my name is dhruv";

        //vu rhds ie manym"
        String s ="my name is dhruv";
        StringBuilder letters = new StringBuilder();
        //get the chars without space and store in the new string
        for(char c : s.toCharArray()){
            if(c != ' '){
                letters.append(c);
            }
        }
        //reverse the new string
        letters.reverse();
        //System.out.println(letters);

        StringBuilder res = new StringBuilder();
        int index =0;
        //get the values from the new string and concat with the required space
        for(char ch : s.toCharArray()){
            if(ch == ' '){
                res.append(ch);
            }
            else {
                res.append(letters.charAt(index));
                index++;
            }
        }

        System.out.println(res);

    }
}
