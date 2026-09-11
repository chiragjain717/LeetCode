class Solution {
    public int totalNumbers(int[] digits) {
        int c=0;
        Set<Integer>set=new HashSet<>();
     for(int i=0;i<digits.length;i++){
        for(int j=0;j<digits.length;j++){
            for(int k=0;k<digits.length;k++){
                if(i == j || j == k || i == k) continue;
             if(digits[i] == 0) continue;
                int x=digits[i]*100+digits[j]*10+digits[k];
                if(!set.contains(x)&&x%2==0)c++;
                 set.add(x);
            }
        }
     } 
     return c;  
    }
}