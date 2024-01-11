package Trees;

public class SymmetricTree {
    
    public static boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;

        if(left == null || right == null) return false;

        if(left.val != right.val) return false;

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeNode left_l = new TreeNode(7, null, null);
        TreeNode left_r = new TreeNode(6, null, null);
        TreeNode right_l = new TreeNode(6, null, null);
        TreeNode right_r = new TreeNode(7, null, null);
        TreeNode left = new TreeNode(2, left_l, left_r);
        TreeNode right = new TreeNode(2, right_l, right_r);
        TreeNode root = new TreeNode(1, left, right);
        System.out.println("The given tree is Symmetric: " + isSymmetric(root, root));
    }
}
