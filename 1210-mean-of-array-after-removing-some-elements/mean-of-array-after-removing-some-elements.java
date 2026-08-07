class Solution {
    public double trimMean(int[] arr) {
       Arrays.sort(arr);
       int n=(int)(arr.length*0.05);
       double  sum=0;
       int x=0;
   for(int i=n;i<arr.length-n;i++){
    sum+=arr[i];
    x++;
   }
   return sum/x;

    }
}