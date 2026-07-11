class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
         for (char ch : brokenLetters.toCharArray()) {
            set.add(ch);
        }

        String g = "";
        int c = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == ' ') {
                boolean ok = true;
                for (char x : g.toCharArray()) {
                    if (set.contains(x)) {
                        ok = false;
                        break;
                    }
                }
                if (ok) c++;
                g = "";
            } else {
                g += ch;
            }
        }
        boolean ok = true;
        for (char x : g.toCharArray()) {
            if (set.contains(x)) {
                ok = false;
                break;
            }
        }
        if (ok) c++;

        return c;
    }
}