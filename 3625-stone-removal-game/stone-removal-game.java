class Solution {
    public boolean canAliceWin(int n) {
        int x =10,y=0;
      while(n>=0){
         n-=x;
         x--;
         y++;
      } 
      return y%2==0 ?true:false;
    }
}