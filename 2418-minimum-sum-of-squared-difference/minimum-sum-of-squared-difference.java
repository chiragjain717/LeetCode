class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
    Map<Integer, Integer> mp = new HashMap<>();
int n = nums1.length;
long k = (long) k1 + k2;
int max = 0;
long total = 0;

    for (int i = 0; i < n; i++) {
        int x = Math.abs(nums1[i] - nums2[i]);
        mp.put(i, x);
        max = Math.max(max, x);
        total += x;
    }

    if (total <= k) {
        return 0;
    }

    int low = 0, high = max;

    while (low < high) {
        int mid = low + (high - low) / 2;
        long need = 0;

        for (int x : mp.values()) {
            if (x > mid) {
                need += x - mid;
            }
        }

        if (need <= k) {
            high = mid;
        } else {
            low = mid + 1;
        }
    }

    long remaining = k;
    long sum = 0;

    for (int i = 0; i < n; i++) {
        int x = mp.get(i);

        if (x > low) {
            remaining -= x - low;
            x = low;
        }

        mp.put(i, x);
    }

    for (int i = 0; i < n && remaining > 0; i++) {
        int x = mp.get(i);

        if (x == low && x > 0) {
            mp.put(i, x - 1);
            remaining--;
        }
    }

    for (int x : mp.values()) {
        sum += (long) x * x;
    }

    return sum;
    }
}