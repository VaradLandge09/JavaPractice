package Trees;

public class MaxPathSum {
    static int max = -1001;
    public static int pathSum(TreeNode root) {
        if(root == null) 
            return 0;

        max = root.val + pathSum(root.left) + pathSum(root.right);
        
        int left = (root.left!=null)?root.left.val:0;
        int right = (root.right!=null)?root.right.val:0;

        return root.val + Math.max(left, right);
    }

    public static int maxPath(TreeNode root) {
        pathSum(root);
        return max;
    }

    public static void main(String[] args) {
        TreeNode left1 = new TreeNode(4, null, null);
        TreeNode left2 = new TreeNode(5, null, null);
        TreeNode right1 = new TreeNode(6, null, null);
        TreeNode right2 = new TreeNode(-7, null, null);
        TreeNode left = new TreeNode(2, left1, left2);
        TreeNode right = new TreeNode(3, right1, right2);
        TreeNode root = new TreeNode(-1, left, right);
        
        System.out.println(maxPath(root));
    }
}
