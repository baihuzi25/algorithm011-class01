//1.DFS,BFS（类似岛屿问题）
//使用visited数组，依次判断每个节点，如果其未访问，朋友圈数加一，并进行DFS搜索所有访问的节点
class Solution {
    public int findCircleNum(int[][] M) {
        boolean[] visited = new boolean[M.length];
        int res = 0;
        for(int i = 0; i < M.length; i++) {
            if(!visited[i]) {
                dfs(M, visited, i);
                res++;
            }
        }
        return res;
     }
     private void dfs(int[][] m, boolean[] visited, int i) {
         for(int j =0; j < m.length; j++) {
             if(m[i][j] == 1 && !visited[j]) {
                 visited[j] = true;
                 dfs(m, visited, j);
             }
         }
     }
}