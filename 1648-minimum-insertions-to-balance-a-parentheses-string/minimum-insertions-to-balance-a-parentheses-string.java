class Solution {
    public int minInsertions(String s) {
       int open = 0;
        int x = 0;

        for (char ch :s.toCharArray()){
             if (ch == '(') {
                open += 2;

                if (open % 2 != 0) {
                    x++;
                    open--;
                }
            } else {
                open--;

                if (open < 0) {
                    x++;
                    open = 1;
                }
            }
        }

        return x + open;
    }
}