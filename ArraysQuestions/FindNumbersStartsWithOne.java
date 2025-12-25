package ArraysQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindNumbersStartsWithOne {
    public static void main(String[] args) {
        int [] arr = {18, 20, 10, 99,17};

        for(int num : arr){
            if(String.valueOf(num).startsWith("1")){
                System.out.println(num);
            }
        }
           //using java stream
        Arrays.stream(arr).filter(i -> String.valueOf(i).startsWith("1"))
                .forEach(System.out::println);


    }
}
