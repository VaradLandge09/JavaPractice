import Trees.TreeNode;

public class DeletionBST {

    public static int successor(TreeNode root) {
        root = root.right;
        while(root.left != null) {
            root = root.left;
        }

        return root.val;
    }

    public static int predecessor(TreeNode root) {
        root = root.left;
        while(root.right != null) {
            root = root.right;
        }
        return root.val;
    }
    
    public static TreeNode deletion(TreeNode root, int key) {
        if(root == null)
            return null;

        if(root.val>key) {
            root.left = deletion(root.left, key);
        }
        else if (root.val<key) {
            root.right = deletion(root.right, key);
        }
        else {

            if(root.left == null && root.right == null) {
                root = null;
            }

            else if(root.right != null) {
                root.val = successor(root);
                root.right = deletion(root.right, root.val);
            }

            else {
                root.val = predecessor(root);
                root.left = deletion(root.left, root.val);
            }
            
        }
        return root;
    }
}
