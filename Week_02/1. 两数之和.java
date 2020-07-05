//暴力解法
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int [] a =new int[2];
//         for (int i = 0; i<nums.length-1; i++) {
//             for (int j = i+1; j<nums.length; j++) {
//                 if(target ==nums[i]+nums[j]) {
//                     a[0] = i;
//                     a[1] = j;
//                     break;
//                 }
//             }
//         }
//         return a;
//     }
// }

//通过hashMap降低时间复杂度
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] a = new int[2];
        for (int i=0; i<nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                a[0]=map.get(target-nums[i]);
                a[1]=i;
                
            }
            map.put(nums[i],i);
        }
        return a;
    }
}