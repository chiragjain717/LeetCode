class Solution {
    public boolean checkValidString(String s) {
        Stack<Character>st=new Stack<>();
          int x = 0;
        int y = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                x++;
                y++;
            }
            else if (ch == ')') {
                x--;
                y--;
            }
            else { 
                x--;
                y++;
            }

            if (y < 0) {
                return false;
            }

            x = Math.max(0, x);
        }

        return x == 0;
    }
}