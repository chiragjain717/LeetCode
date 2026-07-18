class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        System.out.println(mp);
        String sb="";
        while (!mp.isEmpty()) {
    int max = 0;
    char maxChar = ' ';
    for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
        if (entry.getValue() > max) {
            max = entry.getValue();
            maxChar = entry.getKey();
        }
    }

    while (max > 0) {
        sb+=maxChar;
        max--;
    }
    mp.remove(maxChar);
    }
    return sb;
    }
}