public class BestTimeBuySellStock_121 {
    public static void main(String[] args) {
        BestTimeBuySellStock_121 myObj = new BestTimeBuySellStock_121();
        System.out.println(myObj.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            } else if (prices[i] - buyPrice > profit) {
                profit = prices[i] - buyPrice;
            }
        }

        return profit;
    }
}
