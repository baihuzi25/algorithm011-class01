//̰���㷨��һ��ѭ��o��n��ʱ�临�Ӷ�
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0,j = 0;
        int res = 0;
        while(i < g.length && j < s.length) {
            if(g[i] <= s[j]) {
                res++;//��������С����θ�ڣ��ѱ��ɷַ�
                i++;
                j++;
            }else {
                j++;//�������㣬����һ�����
            }
        }
        return res;
    }
}