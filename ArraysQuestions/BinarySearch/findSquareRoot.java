package ArraysQuestions.BinarySearch;

public class findSquareRoot {
    public static void main(String[] args) {
        int num = 28;
        long ans = findSquareRoot( num);
        System.out.println("square root of a number  "+ans);
    }

    private static long findSquareRoot(int num) {
        long ans = 0;
        int low = 1;
        int high = num;

        while(low <= high){
            int mid = (low + high)/2;

            if((mid * mid) <= num){
                ans = (long) mid;
                low = mid +1;
            } else {
                high = mid -1;
                //break;
            }
        }
        return ans;
    }
}
