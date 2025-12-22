package ArraysQuestions.TwoDimentionalArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class FindAverage {
    public static void main(String[] args) {
        Student[] students = {
                new Student("dhruv", 70),
                new Student("mansi", 100),
                new Student("dhruv", 60)
        };

        //print the name whose average is greater

        Map<String, Integer> sumMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        String name = "";
        double maxAvgerage =0;

        for(Student val : students){
            sumMap.put(val.name, sumMap.getOrDefault(val.name,0)+ val.marks);
            countMap.put(val.name, countMap.getOrDefault(val.name,0)+1);

        }

        System.out.println(sumMap);

        for(String val : sumMap.keySet()){
            double avg = (double)sumMap.get(val) / countMap.get(val);

            if(avg > maxAvgerage){
                maxAvgerage = avg;
                name = val;
            }


        }

        System.out.println(name);


    }
}
