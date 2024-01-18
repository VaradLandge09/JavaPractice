import java.util.*;
import Trees.TreeNode;

public class ValidBST {

    public static void inOrderTraversal(TreeNode root, List<Integer> arr) {
        if(root == null) 
            return;
        inOrderTraversal(root.left, arr);
        arr.add(root.val);
        inOrderTraversal(root.right, arr);
        return;
    }

    public static boolean isValid(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inOrderTraversal(root, arr);
        int i;
        for(i=0; i<arr.size()-1; i++) {
            if(arr.get(i) > arr.get(i+1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode left1 = new TreeNode(4, null, null);
        TreeNode left2 = new TreeNode(5, null, null);
        TreeNode right1 = new TreeNode(6, null, null);
        TreeNode right2 = new TreeNode(7, null, null);
        TreeNode left = new TreeNode(2, left1, left2);
        TreeNode right = new TreeNode(3, right1, right2);
        TreeNode root = new TreeNode(1, left, right);
        System.out.println(isValid(root));
    }
}