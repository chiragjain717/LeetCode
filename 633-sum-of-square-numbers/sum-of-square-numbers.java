class Solution {
    public boolean judgeSquareSum(int c) {

       double x=(int)Math.sqrt(c);
        int z=0;

        while(z<=x){
            double y=((z*z)+(x*x));
            if(y==c) {
               
                return true;
            }
            else if(y<c){
                z++;
            }
            else{
                x--;
            }
        }
      return false;
    }
}