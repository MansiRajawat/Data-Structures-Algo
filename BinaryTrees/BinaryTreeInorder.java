package BinaryTrees;

import java.util.List;

public class BinaryTreeInorder {
//At each node:
//Recurse to the left.
//Process/access the current node.
//Recurse to the right.

    //Inorder -> left , root, right
    public void binaryTreeInorderRecursive(TreeNode root, List<Integer> list) {

        if ( root == null ) {
            return;
        }

        binaryTreeInorderRecursive(root.left, list);
        list.add(root.data);
        binaryTreeInorderRecursive(root.right, list);
    }
}
