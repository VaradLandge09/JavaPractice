package Backtracking;
import java.util.*;

public class RatInMaze {

    public static void solveMaze(ArrayList<String> ans, int r, int c, int[][] m, int n, String path, boolean[][] vis)
    {
        if(r==n-1 && c==n-1 && m[r][c] != 0)
        {
            ans.add(path);
            return;
        }

        if(r>=0 && r<n && c>=0 && c<n)
        {
            if(vis[r][c] == true || m[r][c] ==0)
            {
                return;
            }
            vis[r][c] = true;
            solveMaze(ans, r+1, c, m, n, path + 'D', vis); // Moving Down
            solveMaze(ans, r, c-1, m, n, path + 'L', vis); // Moving Left
            solveMaze(ans, r, c+1, m, n, path + 'R', vis); // Moving Right
            solveMaze(ans, r-1, c, m, n, path + 'U', vis); // Moving Up
            vis[r][c] = false;
        }
    }

    public static void main(String[] args) {
        int[][] m = {
            {1, 1, 1, 0},
            {1, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 0, 1, 1}
        };

        int n = 4;
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] vis = new boolean[n][n];

        solveMaze(ans, 0, 0, m, n, "", vis);

        System.out.println("The strings are : ");
        for(String s: ans)
        {
            System.out.println(s);
        }
    }

    // Time Complexity : O(3^N^2) 3 to the power N square
    // 3 because we have three possible ways to move, including the direction we came from
    
    // Space Complexity : O(L * X)
    // x -> number of paths
    // L -> length of paths
}
