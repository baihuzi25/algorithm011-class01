class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 0) return false;
        int temp = 1;
        int cnt = 0;
        for(int i = 0; i < 32; i++) {
            if((n & temp)!=0) {
                cnt++;
            }
            temp = temp<<1;
        }
        return cnt==1;
    }
}