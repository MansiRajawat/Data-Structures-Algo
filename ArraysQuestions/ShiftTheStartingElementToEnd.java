package ArraysQuestions;

public class ShiftTheStartingElementToEnd {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        shiftTheStartingElementToEnd(num);
    }
    private static void shiftTheStartingElementToEnd(int[] num) {
        int temp = num[0];

        for(int i=1; i < num.length; i++){
            num[i-1] = num[i];

        }

        num[num.length -1] = temp;

        for(int nums : num){
            System.out.println("shifted value :"+ nums);
        }


    }
}
