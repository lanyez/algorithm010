//给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
//
// 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
//
// 示例 1:
//
//
//输入: "abc"
//输出: 3
//解释: 三个回文子串: "a", "b", "c".
//
//
// 示例 2:
//
//
//输入: "aaa"
//输出: 6
//说明: 6个回文子串: "a", "a", "a", "aa", "aa", "aaa".
//
//
// 注意:
//
//
// 输入的字符串长度不会超过1000。
//
// Related Topics 字符串 动态规划
// 👍 282 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int countSubstrings(String s) {
		char[] chars = s.toCharArray();
		int result = 0;
		boolean[][] flag = new boolean[chars.length][chars.length];
		for (int j = 0; j < chars.length; j++) {
			for (int i = j; i >= 0; i--) { // i j 的值设定保证了只使用了 flag[][]的上三角，没有出现重复
				if (chars[i] == chars[j] && (j - i < 2 || flag[i + 1][j - 1])) {
					flag[i][j] = true;
					result++;
				}
			}
		}
		return result;
	}
}
//leetcode submit region end(Prohibit modification and deletion)
