//给定一个 没有重复 数字的序列，返回其所有可能的全排列。
//
// 示例:
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//]
// Related Topics 回溯算法


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new LinkedList<>();
		ArrayList<Integer> output = new ArrayList<>();
		for (int num : nums){
			output.add(num);
		}
		int n = nums.length;
		backtrack(n,output,result,0);
		return result;
	}

	public void backtrack(int n,ArrayList<Integer> output,List<List<Integer>> result,int first){
		if(first == n){
			result.add(new ArrayList<Integer>(output));
		}
		for (int i = first; i < n; i++) {
			Collections.swap(output,first,i);
			backtrack(n,output,result,first+1);
			Collections.swap(output,first,i);

		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)
