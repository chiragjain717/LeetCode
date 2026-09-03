class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=nums1[0];
        boolean o=false;
        for(int i:nums1){
            min=Math.min(i,min);
            if(i%2==1){
                o=true;
            }
        }
        if(min%2==1)return true;
        if(o==false)return true;
        return false;
    }
}