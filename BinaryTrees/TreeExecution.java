package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class TreeExecution {
    public static void main(String[] args) {

        BinaryTreeInorder obj = new BinaryTreeInorder();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        List<Integer> result = new ArrayList<>();
        obj.binaryTreeInorderRecursive(root, result);

        System.out.println("Inorder Traversal: " + result);

        System.out.println("----------------------------------------------");

        BinaryTreePreOrder obj2 = new BinaryTreePreOrder();

        obj2.preOrderTraversalRecursive(root, result);

        System.out.println("Preorder Traversal: " + result);

    }
}
