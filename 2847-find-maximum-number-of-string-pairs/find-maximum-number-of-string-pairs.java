class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
         Set<String> set = new HashSet<>();
        int ans = 0;

        for (String word : words) {
            String rev = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }

            if (set.contains(rev)) {
                ans++;
            } else {
                set.add(word);
            }
        }

        return ans;
    }
}