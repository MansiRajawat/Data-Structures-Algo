package StringsQuestions;

public class RotateString {
    public static void main(String[] args) {
        String s1 = "abcde";
        String goal = "cdeab";


        boolean result = checkIfOneStringIsRotationOfAnother(s1, goal);

        System.out.println("rotated String ? "+ result);

    }

    private static boolean checkIfOneStringIsRotationOfAnother(String s1, String goal) {
        for (int i = 0; i < s1.length(); i++) {
            //this will help to get the substring of the s1 it will be then check with the goal string ,
            //if it matches then return true else false
            //s1.substring(i) -> calculate all the substring ex- bcde in i=1
            //s1substring(0,i) -> from 0 to ith index it will get the substring -> a -> i=1
            //then the sorted will be bcdea
            String sorted = s1.substring(i) + s1.substring(0, i);

            if (sorted.contains(goal)) {
                return true;
            }
        }
        return false;
    }


}
