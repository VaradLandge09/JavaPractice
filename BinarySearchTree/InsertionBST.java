
import Trees.TreeNode;

public class InsertionBST {
    
    public static TreeNode insert(TreeNode root, int val) {
        
        if(root == null) 
            return new TreeNode(val);
        
        else if(root.val > val) {
            root.left = insert(root.left, val);
        }
        else if(root.val < val) {
            root.left = insert(root.right, val);
        }

        return root;
    }

    public static void main(String[] args) {
        
    }
}
