
import Trees.TreeNode;

public class SearchBST {
    
    public static TreeNode search(TreeNode root, int val) {

        if(root == null || root.val == val)
            return root;
        
            
        else if(root.val > val) {
            return search(root.left, val);
        }
            
        else {
            return search(root.right, val);
        }
                
    }
}
