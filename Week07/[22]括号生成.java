//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
//
//
//
// 示例：
//
// 输入：n = 3
//输出：[
//       "((()))",
//       "(()())",
//       "(())()",
//       "()(())",
//       "()()()"
//     ]
//
// Related Topics 字符串 回溯算法
// 👍 1193 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public List<String> generateParenthesis(int n) {
		// 参数介绍：n是 剩余左括号，剩余右括号
		List<String> res = new ArrayList<>();
		_generatebrackets(res,"" , n , n);
		return res;
	}

	private void _generatebrackets(List<String> res, String s, int left , int right) {
		//终止条件
		if (left == 0 && right ==0) {
			res.add(s);
			return;
		}
		if ( left > 0)
			_generatebrackets(res,s+"("  , left -1 , right);

		// 匹配右边括号的时候总是比左边括号数多
		if( right > 0 && right > left)
			_generatebrackets(res,s+")" , left , right - 1);

	}
}
//leetcode submit region end(Prohibit modification and deletion)
