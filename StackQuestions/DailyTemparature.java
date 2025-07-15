package StackQuestions;

import java.util.Stack;

public class DailyTemparature {
    public static void main(String[] args) {
        //Given an array of integers temperatures represents the daily temperatures,
        // return an array answer such that answer[i] is the number of days you
        // have to wait after the ith day to get a warmer temperature. If there is
        // no future day for which this is possible, keep answer[i] == 0 instead.


        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] answer = dailyTemperature(temperatures); //brute force

        int[] answerUsingStack = dailyTemperatureUsingStack(temperatures);


        for (int i : answerUsingStack){
            System.out.println(i);
        }
    }

    private static int[] dailyTemperatureUsingStack(int[] temperatures) {
        int n = temperatures.length;

        int[] answer = new int[n];

        Stack<Integer> st = new Stack<>();

        //this problem is similar to next greater element .

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() &&  temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                answer[i] = 0;
            } else {
                answer[i] = st.peek() - i;
            }

            st.push(i);
        }
        return answer;
    }

    private static int[] dailyTemperature(int[] temperatures) {
        int n = temperatures.length;
        int [] answer = new int[n];
        for(int i=0; i < n ; i++){
            for(int j = i+1; j < n; j++){
                if(temperatures[j] > temperatures[i]){

                  answer[i] = j-i;
                  break;

                }
            }
        }
        return answer;
    }


}
