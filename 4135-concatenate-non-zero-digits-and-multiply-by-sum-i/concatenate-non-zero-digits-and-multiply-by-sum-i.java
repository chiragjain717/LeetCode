class Solution {
    public long sumAndMultiply(int n) {
        long  sum=0;
        long x=0;
        while(n>0){
            sum+=n%10;
            if(n%10>0){
            x=x*10+n%10;
            }
            n/=10;
        }
        long z=0;
            while(x>0){
            z=z*10+x%10;
            x/=10;
            }
       
        return z*sum;
    }
}