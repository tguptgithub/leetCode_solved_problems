class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
             min=Math.min(prices[i], min);
            int profitOne=prices[i]-min;
            profit=Math.max(profitOne, profit);
        }
        
        return profit;
        
    }
}