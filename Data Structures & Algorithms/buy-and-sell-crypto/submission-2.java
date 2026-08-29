class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1){
            return 0;
        }
        int l = 0;
        int r = 1;
        int maxProfit = 0;

        while(r < prices.length){
           
            if(prices[l] > prices[r]){
                l++;
            } else {
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(profit, maxProfit);
                r++;
            }
        }
        return maxProfit;
    }
}
