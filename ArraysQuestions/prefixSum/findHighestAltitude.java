package ArraysQuestions.prefixSum;

import java.util.concurrent.ConcurrentHashMap;

public class findHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};

        int result = largestAltitude(gain);
        System.out.println(result);
        

    }

    private static int largestAltitude(int[] gain) {
        int [] currentAltitude = new int[gain.length];

        currentAltitude[0] = gain[0];

        int maxAltitude = 0;

        for(int i =1 ; i < gain.length ; i++){
            currentAltitude[i] = currentAltitude[i-1] + gain[i];
            maxAltitude = Math.max(currentAltitude[i], maxAltitude);
        }
        return maxAltitude;
    }
}
