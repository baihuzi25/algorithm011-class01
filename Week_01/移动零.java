//双指针（j遇到0不走，i一直在走，一个慢指针，一个快指针）
class Solution {
    public void moveZeroes(int[] nums) {
        int  j =0;
        for (int i =0; i<nums.length; i++) {
             if (nums[i]!=0) {
                 nums[j]=nums[i];
                 if(j!=i) {
                    nums[i]=0;
                 }
                 j++;
             }
        }
    }
}