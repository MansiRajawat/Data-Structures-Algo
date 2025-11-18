package StackQuestions;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public static void main(String[] args) {
        //Given an array of integers heights representing the histogram's bar height where the width of each bar is 1,
        // return the area of the largest rectangle in the histogram.

        /*  Input: heights = [2,1,5,6,2,3]
            Output: 10
            Explanation: The above is a histogram where width of each bar is 1.
            The largest rectangle is shown in the red area, which has an area = 10 units.
        */


        int [] height = {2,1,5,6,2,3};

        System.out.println(largestRectangleArea(height));

        // we need to calculate the previous smaller element and the next smaller element to get the larger area, then we calculate the area.

    }


    public static int largestRectangleArea(int [] heights){
        int n = heights.length;

        int [] prevSmaller = previousSmallerElement(heights);
        int [] nextSmaller = nextSmallerElement(heights);
        int maxArea = 0;
        for(int i=0; i < n; i++){
            int height = heights[i];

            int width = nextSmaller[i] - prevSmaller[i] - 1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    private static int[] nextSmallerElement(int[] heights) {

        Stack<Integer> st = new Stack<>();
        int[] nse = new int[heights.length];
        for(int i= heights.length -1; i >=0; i--){

            int currentElement = heights[i];

           while(!st.isEmpty() && heights[st.peek()] >= currentElement){
               st.pop();
           }

           if(st.isEmpty()){
             nse[i] = heights.length;
           } else {
               nse[i] = st.peek();
           }

           st.push(i);
        }
       return nse;
    }

    private static int[] previousSmallerElement(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int[] pse = new int[heights.length];

        for(int i=0; i < heights.length; i++){

            int currentElement = heights[i];

            while (!st.isEmpty() && heights[st.peek()] >= currentElement){
                st.pop();
            }

            if(st.isEmpty()){
                pse[i] = -1;
            } else {
                pse[i] = st.peek();
            }

            st.push(i);
        }

        return pse;
    }
}
