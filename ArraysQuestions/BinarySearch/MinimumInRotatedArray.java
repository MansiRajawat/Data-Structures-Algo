package ArraysQuestions.BinarySearch;

public class MinimumInRotatedArray {
    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 7, 0, 1, 2, 3};

        approach1(arr);
        approach2(arr);
        approachUsingBinarySearch(arr);
    }

    private static void approachUsingBinarySearch(int[] arr) {
        int low =0;
        int high = arr.length -1;
        int minVal = Integer.MAX_VALUE;
        while (low <= high){
            int mid = (low +high) /2;

            if(arr[low] <= arr[mid]){
                minVal = Math.min(minVal, arr[low]);

                low = mid +1;
            } else {
                minVal = Math.min(minVal, arr[mid]);
                high = mid -1;
            }
        }

        System.out.println("using binary search : "+minVal);
    }

    private static void approach2(int[] arr) {
        int minVal = arr[0];
        //second appraoch
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }

        System.out.println("approach 1 : "+minVal);
    }

    private static void approach1(int[] arr) {
        int minVal = Integer.MAX_VALUE;
        //first appraoch
        for(int i = 0; i < arr.length; i++){
            minVal = Math.min(minVal, arr[i]);
        }

        System.out.println("approach 2 : "+minVal);
    }
}
