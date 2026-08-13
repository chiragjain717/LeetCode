class Solution {
    public boolean scoreBalance(String s) {
        int x = 0;
        for (char ch : s.toCharArray()) {
            x += ch - 'a' + 1;
        }
        
        int l = 0;
        for (int i = 0; i < s.length() - 1; i++) {

            l+= s.charAt(i) - 'a' + 1;

            int r = x- l;

            if (l == r) {
                return true;
            }
        }

        return false;
    }
}