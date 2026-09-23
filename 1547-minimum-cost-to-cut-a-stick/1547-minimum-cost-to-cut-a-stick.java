class Solution {

    public int mincut(int i , int j , ArrayList<Integer> cuts , int[][] dp)
    {
        if(i>j) return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int mini = Integer.MAX_VALUE;
        for(int idx = i; idx<=j; idx++)
        {
            int cost = cuts.get(j + 1) - cuts.get(i - 1) + mincut(i, idx-1, cuts, dp) +mincut(idx+1, j, cuts, dp);
            mini =  Math.min(mini,cost);
        }
        return dp[i][j]=mini;
    }
    
    public int minCost(int n, int[] cuts) {
        ArrayList<Integer> arr =  new ArrayList<>();
        arr.add(0);
        for(int x : cuts)
        {
            arr.add(x);
        }
        arr.add(n);
        Collections.sort(arr);
        int size = arr.size();

        int dp[][]=new int[size][size];
        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }
        return mincut(1,size-2,arr,dp);
        
    }
}