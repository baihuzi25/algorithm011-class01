//DFS深度优先搜索（递归）找他的重复子问题
class Solution {
    private int n;
    private int m;
    public int numIslands(char[][] grid) {
        int cnt = 0; //定义岛屿数目
        n = grid.length; //得到二维数组的行数
        if(n == 0) return 0;
        m = grid[0].length;//得到二维数组第0行的长度
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                     ++cnt;
                    DFS(grid, i, j);
                   
                }
            }
        }
        return cnt;
    }
    private void DFS(char[][] grid, int i, int j) {
         n = grid.length; 
         m = grid[0].length;
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        DFS(grid, i+1, j);
        DFS(grid, i-1, j);
        DFS(grid, i, j+1);
        DFS(grid, i, j-1);
    }
}