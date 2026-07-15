class Solution {
    public String customSortString(String order, String s) {
        String g="";
        Set<Character>set=new HashSet<>();
        for(int i=0;i<order.length();i++){
            char ch=order.charAt(i);
            for(int j=0;j<s.length();j++){
                if(ch==s.charAt(j)){
                    g+=ch;
                    set.add(ch);

                }
            }
        }
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i)))g+=s.charAt(i);
        }
        return g;
    }
}