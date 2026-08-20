class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer>list=new ArrayList<>();
        List<Integer>list1=new ArrayList<>();
        int a=nums[0];
        list.add(a);

        int b=nums[1];
        list1.add(b);
        int x[]=new int[nums.length];

        for(int i=2;i<nums.length;i++){
             if(a>b){
                list.add(nums[i]);
                a=nums[i];
             }
             else{
                list1.add(nums[i]);
                b=nums[i];
             }
        }

System.out.println(list);
System.out.println(list1);
int i=0,u=0;
while(i<list.size()){
    x[u]=list.get(i);
    i++;
    u++;
}
i=0;
while(i<list1.size()){
    x[u]=list1.get(i);
    i++;
    u++;
}
return x;

           }
}