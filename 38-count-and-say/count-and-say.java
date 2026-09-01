class Solution {
    public String countAndSay(int n) {
      if(n==1)return "1";
        String x="11";
        while(n>2){
            char ch=x.charAt(0);
            int c=1;
            String h="";
            for(int i=1;i<x.length();i++){
                if(ch==x.charAt(i))c++;
                else{
                    h+=Integer.toString(c)+ch;
                    ch=x.charAt(i);
                    c=1;
                }
            }
           h+=Integer.toString(c)+ch;
            x=h;

            n--;

        }
        return x;
    }
}