class Solution {
    public int minimumDeletions(int[] nums) {
        int a=nums[0],b=nums[0];
        for(int i:nums){
            a=Math.min(a,i);
            b=Math.max(b,i);


        }
        int x=1,w=0,k=0;
        for(int i:nums){
            if(i==a){
                w=x; 

            }
            if(i==b){
                k=x;
            }
            x++;
        }
        // int p=Integer.MAX_VALUE;
        // int l=Integer.MAX_VALUE;
        // for(int i=nums.length-1;i>=0;i--){
        //     if(nums[i]==a){
        //      p=Math.min(x,w);
        //     }
        //     if(nums[i]==b){
        //         l=Math.min(x,k);
        //     }
        //     x++;
        // }
        // return l+p;
        int left = Math.min(w, k);
        int right = Math.max(w, k);
        int n = nums.length;

        int p = right;                   
        int l = n - left + 1;            
        int m = left + n - right + 1;     

        return Math.min(p, Math.min(l, m));
    }
}