package BinaryTrees;

import java.util.List;

public class BinaryTreePreOrder {
    // Preorder Traversal (Root → Left → Right)
    public void preOrderTraversalRecursive(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        list.add(root.data);

        preOrderTraversalRecursive(root.left, list);
        preOrderTraversalRecursive(root.right,list);
    }
}
