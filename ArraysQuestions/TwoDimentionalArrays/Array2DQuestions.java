package ArraysQuestions.TwoDimentionalArrays;
public class Array2DQuestions {
    public static void main(String[] args) {
        int [][] firstQuestion = { {0,0},{0,0} };
        count1sInArray(firstQuestion);

        int [] [] secondQuestion =  { {1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12} };
        int target = 8;
        boolean isMatrixFound =  searchIn2DMatrix(secondQuestion, target);
        System.out.println(isMatrixFound);
    }

    private static boolean searchIn2DMatrix(int[][] secondQuestion, int target) {
        for(int i=0; i < secondQuestion.length; i++){
            for (int j=0; j < secondQuestion[0].length ; j++){
                if(secondQuestion[i][j] == target){
                    return  true;
                }
            }
        }
        return  false;
    }

    private static void count1sInArray(int[][] firstQuestion) {
        int max_count = 0;
        int index = -1;

        //use array.length for rows and array[0].length for columns (assuming all rows have the same length).
        for(int i = 0; i < firstQuestion.length; i++){

            int countOnes = 0;

            for(int j = 0; j < firstQuestion[0].length; j++){

                countOnes = countOnes + firstQuestion[i][j];
            }

            if(countOnes > max_count){
                max_count =countOnes;
                index = i;
            }
        }

        System.out.println(index);
    }
}

