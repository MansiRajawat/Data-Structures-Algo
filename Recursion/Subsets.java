package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
   /*                          (i=0, [])
                          /                  \
                include 1                    exclude 1
               (i=1,[1])                     (i=1,[])
               /        \                    /        \
       include 2     exclude 2        include 2     exclude 2
      (i=2,[1,2])    (i=2,[1])       (i=2,[2])      (i=2,[])
        /     \        /    \          /    \         /    \
     +3       -3     +3     -3      +3     -3      +3     -3
 (i=3,[1,2,3]) [1,2] [1,3]  [1]   [2,3]   [2]    [3]     []

output
[1,2,3] [1,2] [1,3] [1] [2,3] [2] [3] []

*/

        List<List<Integer>> results = new ArrayList<>();
        backtrack(0, arr, new ArrayList<>(), results);
        System.out.println(results);

    }

    private static void backtrack(int index, int[] arr, ArrayList<Integer> current, List<List<Integer>> results) {

        if(index == arr.length){
            results.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[index]);

        backtrack(index +1, arr, current, results);

        current.remove(current.size() -1);

        backtrack(index +1, arr, current, results);
    }
}
