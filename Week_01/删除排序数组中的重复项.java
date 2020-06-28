// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if(nums==null||nums.length==0)
//         return 0;
//         int p=0;
//         int q=0;
//         while(q<nums.length){
//             if(nums[p]==nums[q]){
//                 q++;
//             }else{
//                 nums[p+1]=nums[q];
//                 p++;
//             }
//         }
//         return p+1;
//     }
// }
//双指针移位

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0)
        return 0;
        int j =0;
        for(int i =1; i<nums.length; i++) {
            if(nums[j]!=nums[i]) {
              nums[j+1]=nums[i];
               j++;
            }
           
        }
        return j+1;
    }
}