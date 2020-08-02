//��̬�滮
//��������������һ���£���n�෽������һ�෽����m_1�в�ͬ�Ľⷨ���ڶ��෽������m_2�಻ͬ�ķ�����... ����n�෽������m_n��ͬ�ŷ�����ô���������ܹ���N=m_1+m_2+...+m_n�ַ�����
//ǰi���ַ����б��������, charat(i) == 0 && charat(i-1)== "1" || "2" dp[i] = dp[i-2] ���� return 0
//charat(i) != 0, charat(i-1) == "1", dp[i] = dp[i-1] +dp[i-2]
//charat(i) != 0, charat(i-1) =="2" && "1"=<charat(i)<="6",dp[i] = dp[i-1] +dp[i-2]
//���� dp[i] = dp[i-1]
class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(s.charAt(0) == '0') return 0;
        if(n == 1) {
            return 1;
        }     
        int[] dp = new int[n];
        if(s.charAt(1) == '0') {
            if(s.charAt(0) == '1' || s.charAt(0) == '2') {
                    dp[0] = 0;
                    dp[1] = 1;
                }else {
                  dp[0] = 0;
                  dp[1] = 0;  
                }
        
        }
        else if(s.charAt(0) == '1' 
        ||(s.charAt(0) == '2' && s.charAt(1) >= 1 && s.charAt(1) <= '6')) {
           dp[0] = 1;
           dp[1] = 2; 

        }   
         else {
             dp[0] = 1;
             dp[1] = 1;
         }
         
        
        for(int i = 2; i < n; i++) {
            if(s.charAt(i) == '0') {
                if(s.charAt(i-1) == '1' || s.charAt(i-1) == '2') {
                    dp[i] = dp[i-2];
                }else {
                    return 0;
                }
            }else if(s.charAt(i-1) == '1' 
        ||(s.charAt(i-1) == '2' && s.charAt(i) >= 1 && s.charAt(i) <= '6')) {
            dp[i] = dp[i-1] + dp[i-2];
        }else {
            dp[i] = dp[i-1];
        }
            
            
        }
        return dp[n-1];
    }
}