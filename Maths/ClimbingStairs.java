package Maths;

public class ClimbingStairs {
    public static void main(String[] args) {
        //You are climbing a staircase. It takes n steps to reach the top.
        //Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


        int n = 5;

        //this question is similar to fibonacci

        //till n = 2 . we can return the same number.
        //if n is greater than 2 , we start using the fibonacci logic

        if(n <= 2){
            System.out.println("output "+ n);
        } else {

            int first_step =1;
            int second_step =2;

            for(int i=3; i <= n ; i++){
                int temp = first_step + second_step;
                first_step = second_step;
                second_step = temp;
            }
            System.out.println("output "+  second_step);
        }
    }
}
