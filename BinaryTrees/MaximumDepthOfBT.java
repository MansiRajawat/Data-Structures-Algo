package BinaryTrees;

public class MaximumDepthOfBT {
    public int maxiumumDepth(TreeNode root){
        if(root == null) return 0;

        int leftSide = maxiumumDepth(root.left);
        int rightSide = maxiumumDepth(root.right);

        return 1+ Math.max(leftSide,rightSide);
    }
}