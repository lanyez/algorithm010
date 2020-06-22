//给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
//
// 示例:
//
// 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//]
//
// 说明：
//
//
// 所有输入均为小写字母。
// 不考虑答案输出的顺序。
//
// Related Topics 哈希表 字符串


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String,List<String>> map = new HashMap<>();
		for(int i=0; i < strs.length; i++){
			char[] ca = strs[i].toCharArray();
			Arrays.sort(ca);
			String s = String.valueOf(ca);
			if(!map.containsKey(s)){
				map.put(s,new ArrayList<>());
			}
			map.get(s).add(strs[i]);
		}
		return new ArrayList<>(map.values());
	}
}
//leetcode submit region end(Prohibit modification and deletion)
