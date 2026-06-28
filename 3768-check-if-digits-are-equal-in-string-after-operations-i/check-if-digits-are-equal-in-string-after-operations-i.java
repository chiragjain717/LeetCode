class Solution {
    public boolean hasSameDigits(String s) {
        String g="";
        String h=s;
        while(h.length()>2){
        for(int i=0;i<h.length()-1;i++){
            char ch=h.charAt(i);
             char c=h.charAt(i+1);
              int x=ch-'0';
              int y=c-'0';
              int z=(x+y)%10;
              g+=Integer.toString(z);
               }
        h=g;
        g="";
        }
        if (h.charAt(0) == h.charAt(1))return true;
        return false;
    }
}