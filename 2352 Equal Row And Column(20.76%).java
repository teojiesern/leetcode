class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        HashMap<Integer, String> row = new HashMap<>();
        HashMap<String, Integer> column = new HashMap<>();
        for(int i=0; i<grid.length; i++){
            String temp1 = "";
            String temp2 = "";
            for(int j=0; j<grid[i].length; j++){
                temp1 += grid[i][j] + " ";
                temp2 += grid[j][i] + " ";
            }
            row.put(i, temp1);
            if(!column.containsKey(temp2)) column.put(temp2, 1);
            else {
                Integer prev = column.get(temp2);
                column.replace(temp2, prev, prev+1);
            }
        }

        for(int i=0; i<grid.length; i++){
            String r = row.get(i);
            if(column.containsKey(r)) count += column.get(r);
        }
        return count;
    }
}