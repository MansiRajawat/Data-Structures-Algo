package StringsQuestions;

public class MaximumScoreAfterSplitting {
    public static void main(String[] args) {
        String s = "011101";


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
