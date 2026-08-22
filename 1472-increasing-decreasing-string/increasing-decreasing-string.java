class Solution {
    public String sortString(String s) {
        Map<Character, Integer> mp = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        String g = "";

        for (var x : mp.entrySet()) {
            g += x.getKey();
        }

        String f = "";

        for (char ch : g.toCharArray()) {
            f = ch + f;
        }

        String h = "";
        int z = 1;

        while (!mp.isEmpty()) {

            if (z % 2 != 0) {

                for (char ch : g.toCharArray()) {
                    if (mp.containsKey(ch)) {
                        h += ch;

                        mp.put(ch, mp.get(ch) - 1);

                        if (mp.get(ch) == 0) {
                            mp.remove(ch);
                        }
                    }
                }

            } else {

                for (char ch : f.toCharArray()) {
                    if (mp.containsKey(ch)) {
                        h += ch;

                        mp.put(ch, mp.get(ch) - 1);

                        if (mp.get(ch) == 0) {
                            mp.remove(ch);
                        }
                    }
                }
            }

            z++;
        }

        return h;
    }
}