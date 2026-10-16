class Solution {
    int MOD = 1000000007;
    long[] sum, sq, lazy;
    int n;

    public int sumCounts(int[] nums) {
        n = nums.length;
        sum = new long[4 * n];
        sq = new long[4 * n];
        lazy = new long[4 * n];

        java.util.Map<Integer, Integer> last = new java.util.HashMap<>();
        long ans = 0;

        for (int i = 0; i < n; i++) {
            int prev = last.getOrDefault(nums[i], -1);

            update(1, 0, n - 1, prev + 1, i);

            last.put(nums[i], i);
            ans = (ans + sq[1]) % MOD;
        }

        return (int) ans;
    }

    void push(int node, int l, int r) {
        long v = lazy[node];
        if (v == 0) return;

        long len = r - l + 1;

        sq[node] = (sq[node] + 2 * v % MOD * sum[node] % MOD
                + v * v % MOD * len % MOD) % MOD;

        sum[node] = (sum[node] + v * len) % MOD;

        if (l != r) {
            lazy[node * 2] += v;
            lazy[node * 2 + 1] += v;
        }

        lazy[node] = 0;
    }

    void update(int node, int l, int r, int ql, int qr) {
        push(node, l, r);

        if (l > qr || r < ql) return;

        if (ql <= l && r <= qr) {
            lazy[node]++;
            push(node, l, r);
            return;
        }

        int mid = (l + r) / 2;

        update(node * 2, l, mid, ql, qr);
        update(node * 2 + 1, mid + 1, r, ql, qr);

        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
        sq[node] = (sq[node * 2] + sq[node * 2 + 1]) % MOD;
    }
}