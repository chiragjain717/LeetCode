class Solution {
    public String[] createGrid(int m, int n) {
      String[] ans = new String[m];

        for (int i = 0; i < m; i++) {
            char[] row = new char[n];

            for (int j = 0; j < n; j++) {
                row[j] = '#';
            }

            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    row[j] = '.';
                }
            } else {
                row[n - 1] = '.';
            }

            ans[i] = new String(row);
        }

        return ans;
    }
}