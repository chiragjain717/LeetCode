class Solution {
    public int maxIceCream(int[] costs, int coins) {
       Arrays.sort(costs);
       int x=0,sum=0;
       for(int i:costs){
        sum+=i;
        if(sum>coins)break;
        x++;
       }
       return x; 
    }
}