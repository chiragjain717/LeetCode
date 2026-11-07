class Solution {
    public String longestPalindrome(String s) {
  int max = 1;
        String g = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {

                    String x = s.substring(i, j + 1);
                    StringBuilder sb = new StringBuilder(x);

                    if (x.equals(sb.reverse().toString())) {

                        if (j - i + 1 > max) {
                            max = j - i + 1;
                            g = x;
                        }
                    }
                }
            }
        }

        return g;
    }
}