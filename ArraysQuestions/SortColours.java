package ArraysQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortColours {
    public static void main(String[] args) {
        int num [] = {2,0,2,1,1,0};

        //java8
        List<Integer> result = Arrays.stream(num).boxed().sorted().collect(Collectors.toList());
        System.out.println(result);

        //brute force

        for(int i=0; i < num.length; i++){
            for(int j = i+1; j < num.length; j++){
                if(num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for(int i : num){
            System.out.println("output : "+i);
        }
    }
}