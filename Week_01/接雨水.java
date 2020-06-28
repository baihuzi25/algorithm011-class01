//暴力解法
/*.首先我们需要搞清楚，下标为i的雨水量是由什么决定的.
是由i左右两边最大值中较小的那个减去height[i]决定的.例 [0,1,0,2,1,0,1,3,2,1,2,1]中，下标为2的位置 值为0，而它的用水量是由左边的最大值1，右边最大值3 中较小的那个 也就是1减去0得到的。
*/
// class Solution {
//     public int trap(int[] height) {
//         int res = 0;
//         // 遍历每个柱子
//         for (int i = 1; i < height.length - 1; i++) {
//             int leftMax = 0, rightMax = 0;
//             // 计算当前柱子左侧的柱子中的最大高度
//             for (int j = 0; j <= i; j++) {
//                 leftMax = Math.max(leftMax, height[j]);
//             }
//             // 计算当前柱子右侧的柱子中的最大高度
//             for (int j = i; j < height.length; j++) {
//                 rightMax = Math.max(rightMax, height[j]);
//             }
//             // 结果中累加当前柱子顶部可以储水的高度，
//             // 即 当前柱子左右两边最大高度的较小者 - 当前柱子的高度。
//             res += Math.min(leftMax, rightMax) - height[i];
//         }
//         return res;
//     }
// }
//双指针
class Solution {
    public int trap(int[] height) {
        int res = 0, leftMax = 0, rightMax = 0, left = 0, right = height.length - 1;
        while (left <= right) {
            if (leftMax <= rightMax) {
                leftMax = Math.max(leftMax, height[left]);
                res += leftMax - height[left++];
            } else {
                rightMax = Math.max(rightMax, height[right]);
                res += rightMax - height[right--];
            }
        } 
        return res;
    }
}