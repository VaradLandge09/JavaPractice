import Trees.TreeNode;
import java.util.*;
public class kthSmallestEle {
    
    public static void inorderTraversal(TreeNode root, List<Integer> arr) {
        if(root == null) 
            return;
        inorderTraversal(root.left, arr);
        arr.add(root.val);
        inorderTraversal(root.right, arr);
    }

    public static int kthSmallestElement(TreeNode root, int k) {
        List<Integer> arr = new ArrayList<>();
        inorderTraversal(root, arr);
        return arr.get(k-1);
    }
}
