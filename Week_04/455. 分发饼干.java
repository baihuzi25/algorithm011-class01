//贪心算法，一层循环o（n）时间复杂度
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0,j = 0;
        int res = 0;
        while(i < g.length && j < s.length) {
            if(g[i] <= s[j]) {
                res++;//可以满足小朋友胃口，把饼干分发
                i++;
                j++;
            }else {
                j++;//不能满足，看下一块饼干
            }
        }
        return res;
    }
}