class Solution {
    public int[] plusOne(int[] digits) {
        for (int i= digits.length-1; i>=0; i--) {
            int j = digits[i]+=1;
            if (j%10 == 0) {
                digits[i] = 0;
                continue;
            }else {
                
                 break;
            }
           

        }
       if (digits[0] == 0) {
          digits = new int[digits.length+1];
           digits[0] = 1;
       }

         return digits;
    }
}