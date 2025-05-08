package StringsQuestions;

public class findLongestCommonPrefix {
    public static void main(String[] args) {
        String [] LongestCommonPrefixString = {"flowers" , "flow" , "fly", "flight" };
        findLongestCommonPrefix(LongestCommonPrefixString);
    }
    private static void findLongestCommonPrefix(String[] longestCommonPrefixString) {

        String prefix = longestCommonPrefixString[0];

        for(int i=1; i< longestCommonPrefixString.length; i++){

            while(longestCommonPrefixString[i].indexOf(prefix) != 0) // check if the prefix is at the start
                //keep shrinking the string until it's appeared at the start of the current word.
            {
                prefix = prefix.substring(0, prefix.length() -1);//start removing the character from last

                if(prefix.isEmpty() ){
                    System.out.println("");
                }
            }

        }
        System.out.println("longest common prefix --> "+ " "+prefix);
    }
}
