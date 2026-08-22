class Solution {
    public boolean checkDivisibility(int n) {
        if(n<10)return false;
       // if(n%10==0)return true;
        int c=n;
        int sum=0,p=1;
        while(c>0){
            sum+=c%10;
            p*=c%10;
            c/=10;
        }
        // while(sum>0){
        //     temp=temp*10+sum%10;
        //     sum/=10;
        // }
        // if(temp==p)return true;
        // else return false;
        if(n%(sum+p)==0)return true;
        return false;


     }
}