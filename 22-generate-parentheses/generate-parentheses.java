class Solution {
    public List<String> generateParenthesis(int n) {
          List<String> list = new ArrayList<>();
        list.add("");

        for (int i = 0; i < 2 * n; i++) {

            List<String> list1 = new ArrayList<>();

            for (String s : list) {
                list1.add(s + "(");
                list1.add(s + ")");
            }

            list= list1;
        }

        List<String> anslist = new ArrayList<>();

        for (String s : list) {
            int count = 0;
            boolean valid = true;

            for (char ch : s.toCharArray()) {
                if (ch == '(')
                    count++;
                else
                    count--;

                if (count < 0) {
                    valid = false;
                    break;
                }
            }

            if (valid && count == 0) {
                anslist.add(s);
            }
        }

        return anslist;
    }
}