package GreedyAlgorithm;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        //Assume you are an awesome parent and want to give your children some cookies.
        // But, you should give each child at most one cookie. Each child i has a greed factor g[i], which is the
        // minimum size of a cookie that the child will be
        // content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i,
        // and the child i will be content. Your goal is to maximize the number of your content children
        // and output the maximum number.


        int[] children = {4, 5, 1};
        int[] cookies = {6, 4, 2};


        //we need to sort both the arrays , in such a way that, each student can get the corresponding cookie ,
        //in that way we can get the maximum number of children

        //if the current cookie can satisfy the maximum if of student then move to the next student
        //else move to the next cookie


        Arrays.sort(children);
        Arrays.sort(cookies);

        int l = 0, r = 0;


        while (l < children.length && r < cookies.length) {
            if ( cookies[r] >= children[l]) {
                l++;
            } else {
                r++;
            }
        }

        System.out.println("maximum student to get cookie ->  "+ l);
    }
}
