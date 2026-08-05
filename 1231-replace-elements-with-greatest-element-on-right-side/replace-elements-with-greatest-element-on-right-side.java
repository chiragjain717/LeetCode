class Solution {
    public int[] replaceElements(int[] arr) {
        int a[]=new int[arr.length];
        int u=-1;
        for(int i=arr.length-1;i>=0;i--){
            a[i]=u;
            if(arr[i]>u){
                u=arr[i];
            }
        }
        return a;
    }
}