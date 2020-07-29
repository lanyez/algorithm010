//给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
//
//
//
// 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 感谢 Mar
//cos 贡献此图。
//
// 示例:
//
// 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
//输出: 6
// Related Topics 栈 数组 双指针
// 👍 1496 👎 0


import com.sun.source.tree.AssignmentTree;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int trap(int[] height) {
		//双指针解法
		int max_left = 0;
		int sum = 0;
		int[] max_right = new int[height.lengh];
		for(int i = height.length - 2;i >= 0;i--){
			max_right[i] = Math.max(max_right[i+1],height[i+1]);
		}

		for(int i = 0; i < height.length-1; i++){
			max_left = Math.max(max_left,height[i-1]);
			int min = Math.max(max_left, max_right[i]);
			if(min > height[i]){
				sum = sum + (min - height[i]);
			}
		}
		return sum;
	}
}
//leetcode submit region end(Prohibit modification and deletion)
