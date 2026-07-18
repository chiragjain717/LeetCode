class Solution {
    public int maxScore(String s) {
        int x=0;
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            x++;
        }
        }
        int u=0,l=0;
   for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)=='1'){
            x--;
        }
        else{
            u++;
        }
        l=Math.max(l,x+u);
   }
   return l;
    }
}