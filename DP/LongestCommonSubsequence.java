package DP;

public class LongestCommonSubsequence {

    public static int tabu(String s1, String s2, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {

                if(i==0||j==0) dp[i][j] = 0;

                else if(s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = 1+ dp[i-1][j-1];
                }

                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }

            }
        }
        return dp[m][n];
    }
    
    public static int lcs(String s1, String s2, int m, int n, int[][] dp) {

        if(m==0 || n==0) return 0;

        if(dp[m][n] != -1) {
            return dp[m][n];
        }

        else if(s1.charAt(n-1) == s2.charAt(m-1)) {
            return dp[m][n] = 1+ lcs(s1, s2, m-1, n-1, dp);
        }


        else {
            return dp[m][n] = Math.max(lcs(s1, s2, m-1, n, dp), lcs(s1, s2, m, n-1, dp));
        }
    }
    public static void main(String[] args) {
        String s1 = "AFKJFDJNN";
        String s2 = "AFNJCAIPJ";

        int m=s1.length(), n=s2.length();
        int[][] dp = new int[m+1][n+1];

        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(tabu(s1, s2, m, n));
    }
}
