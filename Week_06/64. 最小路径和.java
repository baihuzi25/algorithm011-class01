//动态规划
//到达第(m,n)点的最小路径dp[m][n] = Math.min(dp[m-1][n],dp[m][n-1])+grid[m][n]
class Solution {
    public int minPathSum(int[][] grid) {
        if(grid == null) return 0;
        int m = grid.length;
        int n =  grid[0].length;
        if(m == 1 && n == 1) return grid[0][0];
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i = 1; i < m; i++) {
            dp[i][0] = grid[i][0]+dp[i-1][0];
        }
        for(int j = 1; j < n; j++) {
            dp[0][j] = grid[0][j]+dp[0][j-1];
        }
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[m-1][n-1];

    }
}