class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String>mp=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            mp.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        System.out.println(mp);
        String g="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                 String h="";
                  int u=i+1;
                while(s.charAt(u)!=')'){
                    h+=s.charAt(u++);
                }
                if(mp.containsKey(h)){
                    g+=mp.get(h);
                }
                else{
                    g+='?';
                }
                i=u;
            }
            else{
                g+=ch;
            }
        }
        return g;
    }
}