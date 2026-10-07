class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> removeInvalidParentheses(String s) {

        int left = 0;
        int right = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                left++;
            } else if (ch == ')') {
                if (left > 0)
                    left--;
                else
                    right++;
            }
        }

        solve(s, 0, left, right, 0, "");

        return ans;
    }

    void solve(String s, int i, int left, int right,
               int balance, String str) {

        if (i == s.length()) {
            if (left == 0 && right == 0 && balance == 0) {
                if (!ans.contains(str))
                    ans.add(str);
            }
            return;
        }

        char ch = s.charAt(i);
        if (ch == '(' && left > 0) {
            solve(s, i + 1, left - 1, right, balance, str);
        }

        if (ch == ')' && right > 0) {
            solve(s, i + 1, left, right - 1, balance, str);
        }
        if (ch == '(') {
            solve(s, i + 1, left, right,
                    balance + 1, str + ch);
        }
        else if (ch == ')') {
            if (balance > 0) {
                solve(s, i + 1, left, right,
                        balance - 1, str + ch);
            }
        }
        else {
            solve(s, i + 1, left, right,
                    balance, str + ch);
        }
    }
}