class Solution {
    public int secondHighest(String s) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int x=ch-'0';
                mp.put(x,mp.getOrDefault(x,0)+1);
            }

    }
    //if(mp.size()==1)return -1;
    int i=0;
    for(var x:mp.entrySet()){
        i++;
        if(i==mp.size()-1)return x.getKey();

    }
return -1;
        }
    }
