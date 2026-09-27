class Solution {
    public String reverseParentheses(String s) {
       Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch != ')') {
                st.push(ch);
            } 
            else {
                String h = "";
                while (!st.isEmpty() && st.peek() != '(') {
                    h += st.pop();
                }
                if (!st.isEmpty()) {
                    st.pop();
                }
                for (char c : h.toCharArray()) {
                    st.push(c);
                }
            }
        }

        String g = "";

        while (!st.isEmpty()) {
            g = st.pop() + g;
        }

        return g;
    }
}