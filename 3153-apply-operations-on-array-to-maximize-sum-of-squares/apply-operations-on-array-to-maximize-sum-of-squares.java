class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int mod = 1000000007;
        int n = nums.size();
        int[] bits = new int[31];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 31; j++) {
                if ((nums.get(i) & (1 << j)) != 0) {
                    bits[j]++;
                }
            }
        }

        long ans = 0;

        for (int i = 0; i < k; i++) {
            long x = 0;

            for (int j = 30; j >= 0; j--) {
                if (bits[j] > 0) {
                    x |= (1L << j);
                    bits[j]--;
                }
            }

            ans = (ans + x * x) % mod;
        }

        return (int) ans;
    }
}