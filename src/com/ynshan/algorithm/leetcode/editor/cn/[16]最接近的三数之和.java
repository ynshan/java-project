//给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和
//。假定每组输入只存在唯一答案。 
//
// 
//
// 示例： 
//
// 输入：nums = [-1,2,1,-4], target = 1
//输出：2
//解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 10^3 
// -10^3 <= nums[i] <= 10^3 
// -10^4 <= target <= 10^4 
// 
// Related Topics 数组 双指针 
// 👍 697 👎 0

  
package com.ynshan.algorithm.leetcode.editor.cn;

import java.util.Arrays;

class ThreeSumClosest {
    public static void main(String[] args) {
        Solution solution = new ThreeSumClosest().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            // 确定数组长度
            int n = nums.length;
            // 对数组进行排序
            Arrays.sort(nums);
            // 初始化返回值
            int ans;
            int diff;
            // 枚举a
            for (int first = 0; first < n; first++) {
                // c 对应的指针指向数组的最右端
                int third = n-1;
                // 枚举b
                for (int second = first+1; second < n; second++) {
                    ans = nums[third] + nums[second] + nums[first];
                    diff = target - ans;

                }

            }

            return 0;

        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}