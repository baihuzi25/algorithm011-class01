//贪心算法
//10元找5元是最优的，20元找10+5元是最优的；
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int  five = 0;//记录已收5元数量
        int ten = 0;//记录已收10元数量
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