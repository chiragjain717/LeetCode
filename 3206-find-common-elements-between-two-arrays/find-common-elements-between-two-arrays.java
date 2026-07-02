class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
     Set<Integer>set=new HashSet<>();
     Set<Integer>set1=new HashSet<>();
     int a[]=new int[2];
     for(int i:nums2){
        set.add(i);

     } 
     int x=0,y=0;
     for(int i:nums1){
        set1.add(i);
       if(set.contains(i))x++;
     }  
     a[0]=x;
     for(int i:nums2 ){
        if(set1.contains(i))y++;
     }
     a[1]=y;
     return a;
    }
}