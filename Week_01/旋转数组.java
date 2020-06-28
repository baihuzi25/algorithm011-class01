//暴力求解
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int privious, tempBox;
//         for(int i = 0; i<k; i++){
//             privious = nums[nums.length-1];
//             for(int j = 0; j<nums.length; j++) {
//                 tempBox = nums[j];
//                 nums[j] = privious;
//                 privious = tempBox;
//             }
//         }
//     }
// }
//使用额外的数组
//原本数组里下标为 ii 的我们把它放到 (i+k)\%数组长度(i+k)%数组长度 的位置。然后把新的数组拷贝到原数组中

class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i = 0;i<nums.length;i++) {
            temp [(i+k)%nums.length] = nums[i];
        }
        for (int j = 0;j<nums.length;j++) {
            nums[j] = temp[j];
        }
    }
}