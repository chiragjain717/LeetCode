class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
     List<List<Integer>>list1=new ArrayList<>();
      Arrays.sort(arr);
     int y=arr[1]-arr[0];
     for(int i=1;i<arr.length;i++){
           y=Math.min(y,Math.abs(arr[i-1]-arr[i]));
     }
     System.out.println(y);
       int x=arr[1]-arr[0];
       for(int i=1;i<arr.length;i++){
       List<Integer>list=new ArrayList<>();
       if(arr[i]-arr[i-1]==y){
           list.add(arr[i-1]);
        list.add(arr[i]);
     
        list1.add(list);
       }
       }
       return list1;

    }
}