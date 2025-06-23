package StringsQuestions;

public class MaximumScoreAfterSplitting {
    public static void main(String[] args) {
        String s = "011101";
/*
All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5
left = "01" and right = "1101", score = 1 + 3 = 4
left = "011" and right = "101", score = 1 + 2 = 3
left = "0111" and right = "01", score = 1 + 1 = 2
left = "01110" and right = "1", score = 2 + 1 = 3
 */

        //we declare a outer for loop , it will go till the length of the string
        //initialise the count as 0
        //initialise two inner for loop, one will go from j = 0 till j <= i,
        //if we have the char as '0' increase the count
        //second inner loop will track from j = i+1 till the length
        //if we have the char as '1' increase the count.
        //update the maximum score inside the loop.

        //System.out.println(s.length()-1);


        int maxScore =0;
        for(int i=0; i < s.length() -1; i ++){
            int count =0;
            for(int j=0; j <=i; j++){

                if(s.charAt(j) == '0'){
                    count++;
                }
            }

            for(int j= i+1; j < s.length(); j++){
                if(s.charAt(j) == '1'){
                    count++;
                }
            }

            maxScore = Math.max(maxScore, count);
        }

        System.out.println("max score after splitting "+ maxScore);
    }
}
