class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                int v = grid[i][j];
                if(v<0){
                    count++;
                }

            }
        }
        System.out.print(m+" "+n);

        return count;
    }
}
