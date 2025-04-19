package ArraysQuestions;

public class InsertNumberInArray {
    public static void main(String[] args) {
        int arr2[] = {4,5,6,7};
        int position = 2;
        int target = 1;

        insertNumberInArray(arr2, position, target);
    }
    private static void insertNumberInArray(int[] arr2, int position, int target) {
        //output = {4,5,1,6,7}
        int[] newArr = new int[arr2.length +1];

        for(int i =0; i < position ; i++){
            newArr[i] = arr2[i];
        }

        newArr[position] = target;

        for(int i = position ; i < arr2.length; i++){
            newArr[i +1] = arr2[i];
        }

        for(int val : newArr){
            System.out.println(" new arr values   "+ val);
        }
    }
}
