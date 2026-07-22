class Solution {
    public boolean digitCount(String num) {
       
        int[] a = new int[10];

        for(int i=0;i<num.length();i++){
            a[num.charAt(i)-'0']++;
        }

        for(int i=0;i<num.length();i++){

            int x = num.charAt(i)-'0';

            if(a[i] != x)
                return false;
        }

        return true;
    }
}