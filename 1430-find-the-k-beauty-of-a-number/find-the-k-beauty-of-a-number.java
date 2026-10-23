class Solution {
    public int divisorSubstrings(int num, int k) {
        int i=0,j=0;
        int o=0;
        String g=Integer.toString(num);
    
        while(j<g.length()){
            if(j-i+1==k){
                int x = Integer.parseInt(g.substring(i, j + 1));

        if (x != 0 && num % x == 0) {
            o++;
        }
        i++;
            }
            j++;
        }
        return o;
    
    
    }
}