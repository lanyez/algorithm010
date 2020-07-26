//给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
//
//
//
// 每次转换只能改变一个字母。
// 转换过程中的中间单词必须是字典中的单词。
//
//
// 说明:
//
//
// 如果不存在这样的转换序列，返回 0。
// 所有单词具有相同的长度。
// 所有单词只由小写字母组成。
// 字典中不存在重复的单词。
// 你可以假设 beginWord 和 endWord 是非空的，且二者不相同。
//
//
// 示例 1:
//
// 输入:
//beginWord = "hit",
//endWord = "cog",
//wordList = ["hot","dot","dog","lot","log","cog"]
//
//输出: 5
//
//解释: 一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog",
//     返回它的长度 5。
//
//
// 示例 2:
//
// 输入:
//beginWord = "hit"
//endWord = "cog"
//wordList = ["hot","dot","dog","lot","log"]
//
//输出: 0
//
//解释: endWord "cog" 不在字典中，所以无法进行转换。
// Related Topics 广度优先搜索
// 👍 391 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		if (wordList == null || !wordList.contains(endWord)) return 0;
		//将beginWord加入list
		wordList.add(beginWord);
		//begin找end
		Queue<String> queue1 = new LinkedList<>();
		Set<String> visited1 = new HashSet<>();
		queue1.add(beginWord);
		visited1.add(beginWord);
		//end找begin
		Queue<String> queue2 = new LinkedList<>();
		Set<String> visited2 = new HashSet<>();
		queue2.add(endWord);
		visited2.add(endWord);
		int depth = 0;
		Set<String> allWord = new HashSet<>(wordList);
		while (!queue1.isEmpty() && !queue2.isEmpty()) {
			//将节点更少的作为 1
			if (queue1.size() > queue2.size()) {
				Queue<String> temp = queue1;
				queue1 = queue2;
				queue2 = temp;
				Set<String> set = visited1;
				visited1 = visited2;
				visited2 = set;
			}
			//开始遍历
			depth++;
			int size = queue1.size();
			while (size-- > 0) {
				String poll = queue1.poll();
				char[] chars = poll.toCharArray();
				//遍历poll的每个字符
				for (int i = 0; i < chars.length; i++) {
					//保存第i个字符,判断结束后需要还原
					char temp = chars[i];
					//将poll的每个字符逐个替换为其他字符
					for (char c = 'a'; c <= 'z'; c++) {
						chars[i] = c;
						//判断替换后的单词
						String newString = new String(chars);
						if (visited1.contains(newString)) {
							continue;
						}
						if (visited2.contains(newString)) {
							return depth + 1;
						}
						//如果替换后的单词,存在字典中，则入队并标记访问
						if (allWord.contains(newString)) {
							queue1.add(newString);
							visited1.add(newString);
						}
					}
					//还原第i个字符
					chars[i] = temp;
				}
			}
		}
		return 0;

	}
}
//leetcode submit region end(Prohibit modification and deletion)
