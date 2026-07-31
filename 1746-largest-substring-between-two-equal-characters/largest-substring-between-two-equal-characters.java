class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
         Set<Character>set=new HashSet<>();
        // int x=-1,z=-1;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(set.contains(ch)){
        //       x=Math.max(x,z);
        //       z=-1;
        //     }
        //     else{
        //     set.add(ch);
        //     z++;
        //     }
        // }
        // return x;
        Map<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)){
                continue;
            }
            else{
                set.add(ch);
                mp.put(ch,i);
            }
        }
        int x=-1;
        for(var m:mp.entrySet()){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(m.getKey()==s.charAt(i)){
                  count=i-m.getValue();
                }
            }
            x=Math.max(count,x);
        }
        return x-1;
    }
}