class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
     List<List<Integer>> list1= new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                list.add(grid[i][j]);
            }
        }
        Collections.rotate(list, k);
        int index = 0;

        for(int i = 0; i < m; i++){
          List<Integer> list2 = new ArrayList<>();

            for(int j = 0; j < n; j++){
                list2.add(list.get(index));
                index++;
            }

            list1.add(list2);
        }

        return list1;
    }
}