package Trees;

public class MaxDepth {
    
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode left1 = new TreeNode(4, null, null);
        TreeNode left2 = new TreeNode(5, null, null);
        TreeNode right1 = new TreeNode(6, null, null);
        TreeNode right3 = new TreeNode(8);
        TreeNode right2 = new TreeNode(7, right3, null);
        TreeNode left = new TreeNode(2, left1, left2);
        TreeNode right = new TreeNode(3, right1, right2);
        TreeNode root = new TreeNode(1, left, right);

        System.out.println("The max Depth is: " + maxDepth(root));
    }
}
