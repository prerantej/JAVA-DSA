package java_basics.Arrays.Medium;

class stocksellbuy {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        stocksellbuy solution = new stocksellbuy();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = solution.maxProfit(prices);
        System.out.println("Maximum profit: " + profit);  // Output should be 5
    }
}
