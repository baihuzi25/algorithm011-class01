//方法一 : 合并后排序
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         System.arraycopy(nums2, 0,  nums1, m, n);
//         Arrays.sort(nums1);
//     }
// }
//方法二：双指针法
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy,0, m);
        int i=0,j=0; //分别指向nums1_copy和nums2首位；
        int p = 0;//指向nums1首位；
        while((i<m) && (j<n)) {
            if (nums1_copy[i] < nums2[j]) {
                nums1[p] = nums1_copy[i];
                i++; 
                p++;
            }else {
                 nums1[p] = nums2[j];
                j++;
                p++;
            }
            
        }
            if(i<m) {
                System.arraycopy(nums1_copy, i, nums1, p, m-i);
            }
            if(j<n) {
                System.arraycopy(nums2, j, nums1, p, n-j);
        }

    }
}