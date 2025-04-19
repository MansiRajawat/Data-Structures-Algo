package ArraysQuestions;

public class MergeTwoSorterArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6,7};
        mergeTwoSorterArrays(arr1, arr2);
    }
    private static void mergeTwoSorterArrays(int[] arr1, int[] arr2) {
        int sortedArr[] = new int[arr1.length + arr2.length];
        for(int i=0; i < arr1.length; i++){
            sortedArr[i] = arr1[i];
        }

        for(int i=0; i < arr2.length ; i++){
            sortedArr[arr1.length +i] = arr2[i];
        }

        for(int i : sortedArr){
            System.out.println(i);
        }
    }
}
