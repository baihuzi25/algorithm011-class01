//̰���㷨
//10Ԫ��5Ԫ�����ŵģ�20Ԫ��10+5Ԫ�����ŵģ�
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int  five = 0;//��¼����5Ԫ����
        int ten = 0;//��¼����10Ԫ����
        for(int bill : bills) {
            if(bill == 5) {
                five++;
            }else if(bill == 10) {
                ten++;
                if(five == 0) {
                    return false;
                }
                five--;
            }else {
                if(five >0 && ten > 0) {
                    five--;
                    ten--;
                }else if(five >= 3) {
                    five -=3;
                }else {
                    return false;
                }

            }
        }
        return true;

    }
}