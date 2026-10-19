class Solution {
    public int minimumSum(int num) {
    List<Integer>list=new ArrayList<>();
   while(num>0){
    list.add(num%10);
    num/=10;
   }
   Collections.sort(list);
   int n=list.size()-1;
   int x=0;
   for(int i=0;i<list.size()/2;i++){
      int  sum=list.get(i)*10+list.get(n);
      x+=sum;
      n--;
   }
   return x;

    }
}