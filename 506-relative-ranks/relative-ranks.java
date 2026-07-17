class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<String, Integer> mp = new LinkedHashMap<>();

        int[] copy = score.clone();
        Arrays.sort(score);

        int n = score.length;

        if (n >= 1)
            mp.put("Gold Medal", score[n - 1]);
        if (n >= 2)
            mp.put("Silver Medal", score[n - 2]);
        if (n >= 3)
            mp.put("Bronze Medal", score[n - 3]);

        int u = 4;

        for (int i = n - 4; i >= 0; i--) {
            mp.put(Integer.toString(u++), score[i]);
        }

        String[] sb = new String[n];

        for (int i = 0; i < n; i++) {

            for (var x : mp.entrySet()) {

                if (x.getValue() == copy[i]) {
                    sb[i] = x.getKey();
                    break;
                }
            }
        }

        return sb;
    }

}