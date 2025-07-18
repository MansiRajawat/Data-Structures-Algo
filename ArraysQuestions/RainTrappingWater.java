package ArraysQuestions;

public class RainTrappingWater {
    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        int left = 0;
        int right = height.length -1;

        int lmax= 0;
        int rmax=0;
        int ans =0;
        while (left < right){
            lmax = Math.max(lmax, height[left]);
            rmax = Math.max(rmax, height[right]);

            if(lmax < rmax){
                ans = ans + lmax - height[left];
                left++;
            } else{
                ans = ans + rmax - height[right];
                right--;
            }
        }
        System.out.println(ans);
    }

}
