package ArraysQuestions.BinarySearch;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        //the goal is to find the minimum eating speed to finish at h hours of time.

        // why binary search ?
        //We want the minimum eating speed k such that Koko can eat all bananas in h hours.
        //If k is too small, she cannot finish → ❌ invalid.
        //If k is large enough, she can finish → ✅ valid.
        //As k increases, the condition “can finish in ≤ h hours” only goes from ❌ to ✅ once and stays ✅ afterward.
        //That’s a monotonic property (function moves one-way).

        System.out.println("Minimum Eating Speed = " + minEatingSpeed(piles, h));

    }
    //You have an array piles of bananas.
    //Koko can eat at most k bananas/hour.
    //Each pile must be eaten by her completely in whole hours (e.g., if a pile has 10 bananas and k = 3, she eats it in ceil(10/3) = 4 hours).
    //You’re given a total h hours.
    //Find the minimum eating speed k such that Koko can finish all bananas within h hours.
    public static int minEatingSpeed(int [] piles, int h){
        int low = 1;
        int high = getMaxPiles(piles);

        int result = high;


        while(low <= high){
            int mid = (low + high)/2;

                int totalHours = canEatAll(piles, mid);

                if(totalHours <= h){
                    result = mid;
                    high = mid -1;
                } else{
                    low = mid +1;
                }

        }

        return result;

    }

    private static int canEatAll(int[] piles, int mid) {
        int time =0;

        for(int pile : piles){
            time += Math.ceil((double)pile/mid);
        }

        return time;
    }

    private static int getMaxPiles(int[] piles) {
        int max =0;
        for(int pile : piles){
           max = Math.max(max, pile);
        }

        return max;
    }


}
