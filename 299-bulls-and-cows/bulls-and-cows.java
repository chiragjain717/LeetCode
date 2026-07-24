class Solution {
    public String getHint(String secret, String guess) {
        int[] a = new int[10];
        int b = 0;
        int c = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                b++;
            } else {
                a[secret.charAt(i) - '0']++;
            }
        }
    for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) != guess.charAt(i)) {
                int d = guess.charAt(i) - '0';

                if (a[d] > 0) {
                    c++;
                    a[d]--;
                }
            }
        }

        return b + "A" + c + "B";
    }
}