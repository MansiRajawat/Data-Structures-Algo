package ArraysQuestions.BinarySearch;

public class findFirstAndLastOccurrenceInAnArray {
    public static void main(String[] args) {
        int arr1[] = {5, 7, 7, 8, 8, 10};
        int x= 8;
        int[] result1 = findFirstAndLastOccurrenceInAnArray(arr1, x);
        System.out.println(result1);
    }
    private static int[] findFirstAndLastOccurrenceInAnArray(int[] arr1, int x) {
        int firstElement= findFirstElement(arr1, x);
        int lastElement = findLastElement(arr1, x);

        return new int[]{firstElement, lastElement};
    }

    private static int findLastElement(int[] arr1, int x) {

        int low = 0;
        int high = arr1.length -1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr1[mid] == x){
                ans = mid;
                low = mid +1;
            } else if(arr1[mid] <x){
                low = mid +1;

            } else {
                high = mid -1;
            }

        }
        return ans;
    }

    private static int findFirstElement(int[] arr1, int x) {
        int low =0;
        int high = arr1.length -1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;

            if(arr1[mid] == x){
                ans = mid;
                high = mid -1;
            } else if ( arr1[mid] < x) {
                low = mid +1;

            } else {
                high = mid -1;
            }
        }
        return ans;
    }
}
