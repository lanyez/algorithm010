//给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
//
// 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
//
// 此外，你可以假设该网格的四条边均被水包围。
//
//
//
// 示例 1:
//
// 输入:
//[
//['1','1','1','1','0'],
//['1','1','0','1','0'],
//['1','1','0','0','0'],
//['0','0','0','0','0']
//]
//输出: 1
//
//
// 示例 2:
//
// 输入:
//[
//['1','1','0','0','0'],
//['1','1','0','0','0'],
//['0','0','1','0','0'],
//['0','0','0','1','1']
//]
//输出: 3
//解释: 每座岛屿只能由水平和/或竖直方向上相邻的陆地连接而成。
//
// Related Topics 深度优先搜索 广度优先搜索 并查集


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int numIslands(char[][] grid) {
		if(grid == null || grid.length == 0){
			return 0;
		}

		int row = grid.length, col = grid[0].length;
		int numIslands = 0;
		for(int r = 0;r < row; ++r){
			for(int c = 0;c < col; ++c){
				if(grid[r][c] == '1'){
					++numIslands;
					dfs(grid,r,c);
				}
			}
		}
		return numIslands;
	}

	private void dfs(char[][] grid,int r,int c){
		int row = grid.length, col = grid[0].length;
		if(r < 0 || c < 0 || r >= row || c >= col || grid[r][c] == '0'){
			return;
		}

		grid[r][c] = '0';
		dfs(grid,r - 1, c);
		dfs(grid,r + 1, c);
		dfs(grid,r, c - 1);
		dfs(grid,r, c + 1);
	}
}
//leetcode submit region end(Prohibit modification and deletion)
