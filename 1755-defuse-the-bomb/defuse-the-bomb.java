class Solution {
    public int[] decrypt(int[] code, int k) {
        int a[]=new int[code.length];
        int n=code.length;
        for(int i=0;i<code.length;i++){
            int u=k;
             int sum=0;
           if(u<0){
            int y=i;
            while(u<0){
                sum+=code[(y-1+n)%n];
                y--;
                u++;
            }
           }
           else{
            int y=i;
            while(u>0){
              sum+=code[(y+1)%n];
              y++;
              u--;
            }
           }
           a[i]=sum;
        }
        return a;
    }
}