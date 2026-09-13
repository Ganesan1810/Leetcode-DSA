class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              int origRow = (i+colShift[j]) % n;
              int origCol = (j+rowShift[origRow]) % n;
              res[i][j]=grid[origRow][origCol];
            }
            
        }
        return res;
    }
}