class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
     int t=0,f=0,len=0,j=0,i=0,y=0;
     while(j<answerKey.length()){
        char ch=answerKey.charAt(j);
        if(ch=='T')t++;
        else f++;
        while(t>k){
            if(answerKey.charAt(i)=='T')t--;
            i++;
        }
         while(f>k){
            if(answerKey.charAt(y)=='F')f--;
            y++;
        }
        len=Math.max(len,j-i+1);
        len=Math.max(len,j-y+1);
        j++;

     }  
     return len;
    }
}