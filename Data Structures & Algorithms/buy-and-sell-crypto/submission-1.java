class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;

        int maxProfit = 0;

        while(r < prices.length){
           int profit = prices[r] - prices[l];
           maxProfit = Math.max(profit, maxProfit);
           if(prices[r] < prices[l]){
            l = r;
            r = l + 1;
           } else {
            r++;
           }
        }
        return maxProfit;
    }
}
