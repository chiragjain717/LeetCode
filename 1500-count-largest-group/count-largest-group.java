class Solution {
    public int countLargestGroup(int n) {

        Map<Integer, Integer> mp = new HashMap<>();
        int max = 0;

        for (int i = 1; i <= n; i++) {
            int u = i;
            int sum = 0;

            while (u > 0) {
                sum += u % 10;
                u /= 10;
            }

            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
            max = Math.max(max, mp.get(sum));
        }

        int o = 0;
        for (var x : mp.entrySet()) {
            if (x.getValue() == max) {
                o++;
            }
        }

        return o;
    }   
}