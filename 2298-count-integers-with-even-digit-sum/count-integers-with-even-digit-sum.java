class Solution {
    public int countEven(int num) {
        int x=0;
       for(int i=1;i<=num;i++){
        int u=i;
        int sum=0;
        while(u>0){
         sum+=u%10;
         u/=10;
        }
        if(sum%2==0)x++;
       } 
       return x;
    }
}