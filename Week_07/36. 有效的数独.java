class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,Integer>[] rows = new HashMap[9];
        HashMap<Integer,Integer>[] cloums = new HashMap[9];
        HashMap<Integer,Integer>[] boxs = new HashMap[9];
        for(int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>();
            cloums[i] = new HashMap<>();
            boxs[i] = new HashMap<>();
        }
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char num = board[i][j];
                if(num != '.') {
                    int n = (int)num;
                    int boxs_index = (i/3)*3+j/3;
                    rows[i].put(n, rows[i].getOrDefault(n,0)+1);
                    cloums[j].put(n,cloums[j].getOrDefault(n,0)+1);
                    boxs[boxs_index].put(n, boxs[boxs_index].getOrDefault(n,0)+1);
                    if (rows[i].get(n) > 1 || cloums[j].get(n) > 1 || boxs[boxs_index].get(n) > 1)
            return false;

                } 
            }
        }
        return true;
    }
}