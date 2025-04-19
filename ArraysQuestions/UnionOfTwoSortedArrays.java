package ArraysQuestions;

import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int num1[] = {3,4,4,4};
        int num2[] = {6,7,7};
        unionOfTwoSortedArrays(num1, num2);
    }
    private static void unionOfTwoSortedArrays(int[] num1, int[] num2) {

        Set<Integer> nums = new TreeSet<>();

        for(int i=0; i < num1.length; i++){
            nums.add(num1[i]);
        }

        for(int i=0; i< num2.length; i++){
            nums.add(num2[i]);
        }

        int [] temp = new int[nums.size()];

        int count =0;

        for(int i : nums){
            temp[count] = i;
            count++;
        }

        for(int i : temp){
            System.out.println(i);
        }
    }
}
