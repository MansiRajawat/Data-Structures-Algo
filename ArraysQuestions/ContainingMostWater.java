package ArraysQuestions;

public class ContainingMostWater {
    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};

        int low = 0;
        int high = arr.length -1;
        int maxWater = 0;
        while(low < high){
            int width = high - low;

            int height = Math.min(arr[low], arr[high]);

            int area = width * height;

            maxWater = Math.max(maxWater, area);

            if(arr[low] > arr[high]){
                high --;
            } else {
                low ++;
            }

        }

        System.out.println("max water containing : "+ maxWater);
    }
}
