package ArraysQuestions;

public class MoveZerosAtEnd {
    public static void main(String[] args) {
        int[] moveZeros = {1,0,2,4,5,0,9,0};
        moveZerosAtEnd(moveZeros);
    }
    private static void moveZerosAtEnd(int[] moveZeros) {
        int temp [] = new int[moveZeros.length];
        int count =0;
        //move the non zero element to temp;
        for(int i=0; i < moveZeros.length; i++){
            if(moveZeros[i] !=0){
                temp[count] = moveZeros[i];
                count++;
            }
        }

        //copy the temp values to original array
        for (int i=0; i < moveZeros.length; i++){
            moveZeros[i] = temp[i];
        }

//        for(int i = count; i < moveZeros.length; i++){
//            moveZeros[i] = 0;
//        }
        for(int nums : moveZeros){
            System.out.println("shifted value :"+ nums);
        }

    }
}
