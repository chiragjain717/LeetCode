class Solution {
    public String decodeMessage(String key, String message) {
       Map<Character,Character>mp=new HashMap<>();
           int u=97;
       for(int i=0;i<key.length();i++){
        char ch=key.charAt(i);
    
        if(ch!=' '&& !mp.containsKey(ch)){
           mp.put(ch,(char)u);
           u++;
        }
       }
       System.out.println(mp);
       String s="";
       for(int i=0;i<message.length();i++){
        char ch=message.charAt(i);
        if(ch==' '){
            s+=" ";
            continue;
        }
        for(var x:mp.entrySet()){
            char y=x.getKey();
            char z=x.getValue();
            if(ch==y){
                s+=z;
            }
        }
       }
       return s; 
    }
}