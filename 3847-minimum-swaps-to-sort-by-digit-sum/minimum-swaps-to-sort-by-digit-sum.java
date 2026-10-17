class Solution {
    public int minSwaps(int[] nums) {
              int n = nums.length;
        int[][] a = new int[n][2];

        for (int i = 0; i < n; i++) {
            int u = nums[i], sum = 0;

            while (u > 0) {
                sum += u % 10;
                u /= 10;
            }

            a[i][0] = sum;
            a[i][1] = nums[i];
        }

        Integer[] idx = new Integer[n];

        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        Arrays.sort(idx, (i, j) -> {
            if (a[i][0] != a[j][0]) {
                return a[i][0] - a[j][0];
            }
            return a[i][1] - a[j][1];
        });

        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[idx[i]] = i;
        }

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || p[i] == i) {
                continue;
            }

            int j = i;
            int count = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = p[j];
                count++;
            }

            swaps += count - 1;
        }

        return swaps;
    }
}
