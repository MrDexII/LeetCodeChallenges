package Arrays;

public class BestTimeToBuyAndSellStock {
    // space complexity O(1)
    // time complexity O(n^2)
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (maxProfit < profit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    // space complexity O(1)
    // time complexity O(n)
    public static int maxProfit2(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        int[] prices3 = {7, 2, 100, 1, 5, 3, 6, 4};
        int[] prices4 = {1, 2};

        System.out.println(maxProfit2(prices));
        System.out.println(maxProfit2(prices2));
        System.out.println(maxProfit2(prices3));
        System.out.println(maxProfit2(prices4));
    }
}
