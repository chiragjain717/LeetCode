class Solution {
    public String intToRoman(int num) {
        String ch[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int a[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String str="";
            for(int i=0;i<a.length;i++){
               while(num>=a[i]){
                str+=ch[i];
                num-=a[i];
         }
            }
return str;
    }
}