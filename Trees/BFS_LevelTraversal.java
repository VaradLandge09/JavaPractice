package Trees;
import java.util.*;

public class BFS_LevelTraversal {
    
    public static List<List<Integer>> levelTraversal(TreeNode root) {
        if(root == null) return null;

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty()) {
            int cnt = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i<cnt; i++) {
                TreeNode x = q.remove();
                level.add(x.val);
                if(x.left != null) q.add(x.left);
                if(x.right != null) q.add(x.right);
            }
            result.add(level);
        }
        return result;
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
        levelTraversal(root);
    }
}
