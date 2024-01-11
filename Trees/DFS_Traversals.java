package Trees;

public class DFS_Traversals {


    public static void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
        return;
    }

    public static void preorder(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
        return;
    }

    public static void postorder(TreeNode root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
        return;
    }
    
    public static void main(String[] args) {
        TreeNode left1 = new TreeNode(4, null, null);
        TreeNode left2 = new TreeNode(5, null, null);
        TreeNode right1 = new TreeNode(6, null, null);
        TreeNode right2 = new TreeNode(7, null, null);
        TreeNode left = new TreeNode(2, left1, left2);
        TreeNode right = new TreeNode(3, right1, right2);
        TreeNode root = new TreeNode(1, left, right);
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
        System.out.print("preorder: ");
        preorder(root);
        System.out.println();
        System.out.print("postorder: ");
        postorder(root);
    }
}