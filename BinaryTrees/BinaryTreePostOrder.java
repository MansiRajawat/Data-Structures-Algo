package BinaryTrees;

import java.util.List;

public class BinaryTreePostOrder {
    //postorder -Left -> Right -> Root
    public void postOrderTraversalRecursive(TreeNode root, List<Integer> list){
        if ( root == null ) {
            return;
        }

        postOrderTraversalRecursive(root.left, list);
        postOrderTraversalRecursive(root.right, list);
        list.add(root.data);
    }
}
