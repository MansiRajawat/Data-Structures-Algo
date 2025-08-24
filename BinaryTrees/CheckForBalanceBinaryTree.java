package BinaryTrees;

public class CheckForBalanceBinaryTree {
    public static void main(String[] args) {
        BinaryTreeInorder obj = new BinaryTreeInorder();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(isBalanced(root));
    }


    public  static boolean isBalanced(TreeNode root){
        return dfsHeight(root) != -1;
    }

    private static int dfsHeight(TreeNode root) {
        if ( root == null ) return 0;

        int leftHeight = dfsHeight(root.left);
        int rightHeight = dfsHeight(root.right);

        if(leftHeight == -1 || rightHeight == -1) return -1;

        if(Math.abs(leftHeight - rightHeight) >1) return -1;

        return Math.max(leftHeight, rightHeight) +1;

    }
}
