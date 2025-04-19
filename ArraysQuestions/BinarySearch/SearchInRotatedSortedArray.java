package ArraysQuestions.BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int num[] = {4,5,6,7,0,1,2};
        int target = 0;

        search(num, target);
    }

    private static void search(int[] num, int target) {

        int low =0; int high = num.length -1;

        while( low <= high){

            int mid = (low + high)/2;

            if(num[mid] == target) {
                System.out.println(mid);
                break;
            }

            if(num[low] <= num[mid]){
                if(num[low] <= target && target <= num[mid]){
                    //eliminate the right half

                    high = mid -1;
                } else {
                    //target doesnot exist in the left sorted array
                    low = mid +1;
                }
            } else {
                if(num[mid] <= target && target <= num[high]){
                    //eliminate the left half
                    low = mid+1;
                } else {
                    high = mid -1;
                }
            }
        }
        //System.out.println("-1");
    }
}
