class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
             }
            //  int count=0,z=0;
            //  for(var x:mp.entrySet()){
            //     z++;
            //   count+=x.getValue();
            //  }
            //  int f=z*(z+1)/2;
       
            //  if(count!=f)return false;
            //  return true;
            Set<Integer>set=new HashSet<>();
            for(var x:mp.entrySet()){
                int c=x.getValue();
                if(set.contains(c))return false;
                set.add(c);
            }
            return true;
    }
}