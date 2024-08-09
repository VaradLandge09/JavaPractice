package DP;

public class KnapSack {
    
    public static int sol(int[] profit, int[] weight, int max, int n) {
        if(max == 0 || n==0) return 0;

        if(weight[n]>max) return sol(profit, weight, max, n-1);

        return Math.max(sol(profit, weight, max, n-1), profit[n] + sol(profit, weight, max-weight[n-1], n-1));
    }

    public static int memo(int[] proft, int[] weight, int m, int n, int[][] dp) {
        if(m==0 || n==0) return 0;

        if(weight[n]>m) return memo(proft, weight, m, n-1, dp);

        if(dp[m][n] != -1) return dp[n][m];

        return dp[m][n] = Math.max(memo(proft, weight, m, n-1, dp), proft[n] + memo(proft, weight, m-weight[n], n-1, dp));
    }

    public static int tabulation(int[] profit, int[] weight, int m, int n) {
        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=m; j++) {

                if(i==0 || j==0) {
                    dp[i][j] = 0;
                }

                else if(weight[i-1] > j) {
                    dp[i][j] = dp[i-1][j];
                }

                else if(weight[i-1] <= j) {
                    dp[i][j] = Math.max(dp[i-1][j], profit[i-1] + dp[i-1][j-weight[i-1]]);
                }

            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        int profit[] = {60, 100, 120};
        int weight[] = {1, 2, 3};
        int max = 3;
        int n=3;

        // int[][] dp = new int[max+1][n+1];

        // for(int i=0; i<max+1; i++) {
        //     for(int j=0; j<n+1; j++) {
        //         dp[i][j] = -1;
        //     }
        // }
        System.out.println(tabulation(profit, weight, max, n));

    }
}
