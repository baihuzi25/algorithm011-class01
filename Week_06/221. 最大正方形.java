//动态规划,以i,j点为右下角的矩阵最大边长：dp[i][j] = Math.min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1])+1
//而且dp[i][j] 也表示以i,j点为右下角的组成矩阵最大个数
class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length ==0) 
        return 0;
        int m = matrix.length;
        int n = matrix[0].length;      
        int[][] dp = new int[m][n];
        int res = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || j == 0) {
                    if(matrix[i][j] == '0') dp[i][j] = 0;
                    else dp[i][j] = 1;
                }else if(matrix[i][j] == '0') {
                    dp[i][j] = 0;
                }else 
                dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]),dp[i-1][j-1])+1;              
                 if(dp[i][j] > res) {
                    res = dp[i][j];
                }
                
            }
        }  
        return res*res;  
    }
}