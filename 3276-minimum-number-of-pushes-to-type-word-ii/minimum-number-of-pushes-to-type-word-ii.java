class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer>mp=new HashMap<>();
        for(char ch:word.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);

        }
        int sum=0;
        for(var x:mp.entrySet()){
            sum+=x.getValue();
        }
    if(mp.size()<=8)return sum;

Map<Character, Integer> mp1 = sorted(mp);
int w=0,l=0;
for(var x:mp1.entrySet()){
    int y=l/8+1;
    w+=y*x.getValue();
    l++;
     
}
return w;
    }
   private static Map<Character, Integer> sorted(Map<Character, Integer> mp) {

    List<Map.Entry<Character, Integer>> list = new ArrayList<>(mp.entrySet());
    list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
      Map<Character, Integer> sorted = new LinkedHashMap<>();
      for (Map.Entry<Character, Integer> e : list) {
        sorted.put(e.getKey(), e.getValue());
    }

    return sorted;
}
}