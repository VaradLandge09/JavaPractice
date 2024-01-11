package Trees;

public class DiameterOfTree {

    static int max = 0;

    public static int height(TreeNode root) {
        if(root == null) 
            return 0;
        
        int left = height(root.left);
        int right = height(root.right);

        max = Math.max(max, left+right);

        return 1+Math.max(left, right);
    }
    
    public static int diameter(TreeNode root) {
        height(root);
        return max;
    }

    public static void main(String[] args) {
        TreeNode left1 = new TreeNode(4, null, null);
        TreeNode left2 = new TreeNode(5, null, null);
        TreeNode right1 = new TreeNode(6, null, null);
        TreeNode right2 = new TreeNode(7, null, null);
        TreeNode left = new TreeNode(2, left1, left2);
        TreeNode right = new TreeNode(3, right1, right2);
        TreeNode root = new TreeNode(1, left, right);

        System.out.println(diameter(root));
    }
}
