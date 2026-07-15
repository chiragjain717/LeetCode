class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum=0,p=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                sum+=i;
            }
            else{
                p+=i;
            }
        }
        System.out.println(sum);
           System.out.println(p);

        boolean x=true;
        int i=sum/2;
         while(i>0){
         if(p%i==0&&sum%i==0){
                    return i;
                  }
                  i--;
        }
return -1;
    }
}