public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int temp = 1;
        int cnt = 0;
        for(int i = 0; i < 32; i++) {
            if((n & temp)!=0) {
                cnt++;
            }
            temp = temp<<1;
        }
        return cnt;
    }
}