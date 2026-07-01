class Solution {
    public int[] minOperations(String boxes) {
        int a[]=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int x=0;
            for(int j=0;j<boxes.length();j++){
                if(boxes.charAt(j)=='1'){
                  x+=Math.abs(i-j);
                }
            }
            a[i]=x;
        }
        return a;
    }
}