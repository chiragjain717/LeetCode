class Solution {
    public int longestConsecutive(int[] nums) {
     if (nums.length == 0) return 0;

        Map<Integer, Integer> mp = new TreeMap<>();

        for (int num : nums) {
            mp.put(num, 1);
        }

        Integer c = null;
        int count = 1;
        int ans = 1;

        for (int key : mp.keySet()) {

            if (c == null) {
                c = key;
                continue;
            }

            if (key - c == 1) {
                count++;
            } else {
                count = 1;
            }

            ans = Math.max(ans, count);
            c = key;
        }

        return ans;
    }
}