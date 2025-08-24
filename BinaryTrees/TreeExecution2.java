package BinaryTrees;

public class TreeExecution2 {
    public static void main(String[] args) {
        BinaryTreeInorder obj = new BinaryTreeInorder();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(5);
        root.right.right = new TreeNode(6);


        //maximum depth

        MaximumDepthOfBT depthOfBT = new MaximumDepthOfBT();

        System.out.println("Maximum Depth of BT  " +depthOfBT.maxiumumDepth(root));
    }
}
