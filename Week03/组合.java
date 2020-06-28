//给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
//
// 示例:
//
// 输入: n = 4, k = 2
//输出:
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//]
// Related Topics 回溯算法


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public List<List<Integer>> combine(int n, int k) {
		LinkedList<Integer> nums = new LinkedList<>();
		for (int i = 1; i < k + 1; i++) {
			nums.add(i);
		}
		nums.add(n+1);
		List<List<Integer>> output = new ArrayList<>();
		int j = 0;
		while(j < k){
			output.add(new LinkedList(nums.subList(0,k)));
			j = 0;
			while((j<k) && (nums.get(j+1) == nums.get(j)+1)){
				nums.set(j,j++ + 1);
			}
			nums.set(j,nums.get(j)+1);
		}
		return output;
	}
}
//leetcode submit region end(Prohibit modification and deletion)
