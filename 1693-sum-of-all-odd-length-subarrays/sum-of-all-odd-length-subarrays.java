class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
    int sum=0;
 for(int i=0;i<arr.length;i++){
        int x=0,y=1;
 for(int j=i;j<arr.length;j++){
    x+=arr[j];
        if(y%2!=0)sum+=x;
        System.out.println(x );
   y++;
     }
      } 
      return sum; 
    }
}