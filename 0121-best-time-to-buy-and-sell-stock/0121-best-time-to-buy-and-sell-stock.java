class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int minBuy=prices[0];
        for(int i=0;i<n;i++)
        {
            if(prices[i]<minBuy)
                minBuy=prices[i];
            else if(prices[i]-minBuy > profit)
                profit=prices[i]-minBuy;

        }
       return profit;
    }
}