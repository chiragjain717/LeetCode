class Solution {
    public String smallestPalindrome(String s) {
    //  Map<Character, Integer> mp = new HashMap<>();
    //    for (char ch : s.toCharArray()) {
    //         mp.put(ch, mp.getOrDefault(ch, 0) + 1);
    //     }
    //   String left = "";
    //     String middle = "";

    //     for (char ch = 'a'; ch <= 'z'; ch++) {

    //         if (mp.containsKey(ch)) {

    //             int c = mp.get(ch);

    //             for (int i = 0; i < c / 2; i++) {
    //                 left += ch;
    //             }

    //             if (c % 2 == 1) {
    //                 middle = ch + "";
    //             }
    //         }
    //     }

    //     String right = "";

    //     for (int i = left.length() - 1; i >= 0; i--) {
    //         right += left.charAt(i);
    //     }

    //     return left + middle + rigt;
    int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = ' ';

        for(int i = 0; i < 26; i++){

            int count = freq[i];
            char ch = (char)('a' + i);

            for(int j = 0; j < count / 2; j++){
                left.append(ch);
            }

            if(count % 2 == 1){
                middle = ch;
            }
        }

        StringBuilder right = new StringBuilder(left).reverse();

        return left.toString() + 
               (middle == ' ' ? "" : middle) + 
               right.toString();
    }
}