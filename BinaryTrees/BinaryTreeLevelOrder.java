package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrder {
    public List<List<Integer>> levelOrderTraversal(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if ( root == null ) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);


        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentVal = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                currentVal.add(node.data);

                if ( node.left != null ) {
                    queue.offer(node.left);
                }
                if ( node.right != null ) {
                    queue.offer(node.right);
                }
            }

            result.add(currentVal);

        }

        return result;

    }
}
