class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int b[] = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        Map<Integer,Integer>mp=new HashMap<>();
        int x=1;
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                continue;
            }
            mp.put(arr[i],x++);
        }
        int a[]=new int [arr.length];
        for(int i=0;i<b.length;i++){
            if(mp.containsKey(b[i])){
                a[i]=mp.get(b[i]);
            }
        }
        return a;
    }
}