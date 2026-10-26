class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;

        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0 && !vis[i][j]) {
                    long sum = dfs(grid, vis, i, j, m, n);

                    if (sum % k == 0) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }

    public long dfs(int[][] grid, boolean[][] vis,
                    int i, int j, int m, int n) {

        if (i < 0 || j < 0 || i >= m || j >= n ||
            grid[i][j] == 0 || vis[i][j]) {
            return 0;
        }

        vis[i][j] = true;

        long sum = grid[i][j];

        sum += dfs(grid, vis, i + 1, j, m, n);
        sum += dfs(grid, vis, i - 1, j, m, n);
        sum += dfs(grid, vis, i, j + 1, m, n);
        sum += dfs(grid, vis, i, j - 1, m, n);

        return sum;
    }
}