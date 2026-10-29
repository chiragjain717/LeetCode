class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
     int y = mp.get(s.charAt(0));
        for(var x:mp.entrySet()){
            if(x.getValue()!=y)return false;
        }
        return true;
    }
}