class Solution {
    public int maximumLengthSubstring(String s) {
    Map<Character,Integer>mp=new HashMap<>();
    int i=0,j=0,max=0;
    while(j<s.length()){
        char ch=s.charAt(j);
        mp.put(ch,mp.getOrDefault(ch,0)+1);
          while(mp.get(ch) > 2) {
                char x = s.charAt(i);
                mp.put(x, mp.get(x) - 1);
                i++;
            }

            max = Math.max(max, j - i + 1);
            j++;
        }

        return max;
    }
}