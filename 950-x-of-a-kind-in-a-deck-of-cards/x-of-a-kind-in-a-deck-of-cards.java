class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
    if (deck.length <= 1) return false;

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < deck.length; i++) {
            mp.put(deck[i], mp.getOrDefault(deck[i], 0) + 1);
        }

        int z = 0;

        for (var i : mp.entrySet()) {
            z = gcd(z, i.getValue());
        }

        return z >= 2;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}