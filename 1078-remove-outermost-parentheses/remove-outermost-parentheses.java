class Solution {
    public String removeOuterParentheses(String s) {
    
       Stack<Character> st = new Stack<>();
        String g = "";

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (!st.isEmpty()) {
                    g += ch;
                }
                st.push(ch);
            } else {
                st.pop();

                if (!st.isEmpty()) {
                    g += ch;
                }
            }
        }

        return g;

    }
}