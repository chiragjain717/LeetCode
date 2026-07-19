class Solution {
    public String smallestSubsequence(String s) {
        if (s.length() == 0)
            return "";

        int[] a = new int[26];

        for (char ch : s.toCharArray())
            a[ch - 'a']++;

        int x = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) < s.charAt(x))
                x = i;

            a[s.charAt(i) - 'a']--;

            if (a[s.charAt(i) - 'a'] == 0)
                break;
        }

        char ch = s.charAt(x);

        String g = s.substring(x + 1).replaceAll("" + ch, "");

        return ch + smallestSubsequence(g);
    }
}