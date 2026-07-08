class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int t[]=arr.clone(); ;
Arrays.sort(arr);
int x=arr[arr.length-1];
for(int i=0;i<t.length;i++){
    if(t[i]==x)return i;
}
return 0;
    }
}