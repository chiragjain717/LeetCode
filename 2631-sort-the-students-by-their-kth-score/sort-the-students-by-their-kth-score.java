class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int n = score.length;
        int m = score[0].length;

        Map<Integer, Integer> mp =
                new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            mp.put(score[i][k], i);
        }

        int[][] ans = new int[n][m];

        int u = 0;

        for (var x : mp.entrySet()) {

            int y = x.getValue();

            for (int j = 0; j < m; j++) {
                ans[u][j] = score[y][j];
            }

            u++;
        }

        return ans;
    }
}