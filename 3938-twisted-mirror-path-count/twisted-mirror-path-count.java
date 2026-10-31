class Solution {
    public int uniquePaths(int[][] grid) {
         int m = grid.length;
        int n = grid[0].length;
        int mod = 1000000007;

        long[][] right = new long[m][n];
        long[][] down = new long[m][n];

        right[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) continue;

                if (j > 0) {
                    if (grid[i][j - 1] == 0) {
                        right[i][j] = 
                            (right[i][j - 1] + down[i][j - 1]) % mod;
                    } else {
                        right[i][j] = down[i][j - 1];
                    }
                }

                if (i > 0) {
                    if (grid[i - 1][j] == 0) {
                        down[i][j] = 
                            (right[i - 1][j] + down[i - 1][j]) % mod;
                    } else {
                        down[i][j] = right[i - 1][j];
                    }
                }
            }
        }

        return (int)((right[m - 1][n - 1] +
                      down[m - 1][n - 1]) % mod);
    }
}