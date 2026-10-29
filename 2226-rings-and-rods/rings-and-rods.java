class Solution {
    public int countPoints(String rings) {
         Map<Integer, List<Character>> mp = new HashMap<>();

        for (int i = 0; i < rings.length(); i += 2) {
            char ch = rings.charAt(i);
            int x = rings.charAt(i + 1) - '0';

            if (!mp.containsKey(x)) {
                mp.put(x, new ArrayList<>());
            }

            mp.get(x).add(ch);
        }

        int count = 0;

        for (int key : mp.keySet()) {
            List<Character> list = mp.get(key);

            if (list.contains('R') && list.contains('G')
                    && list.contains('B')) {
                count++;
            }
        }

        return count;
    }
}