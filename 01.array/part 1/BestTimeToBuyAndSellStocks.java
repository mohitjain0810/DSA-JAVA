public class BestTimeToBuyAndSellStocks {
   public static void main(String[] args) {
      // Example usage:
      int[] prices = { 7, 1, 5, 3, 6, 4 };
      int maxProfit = maxProfit(prices);
      System.out.println("Maximum Profit: " + maxProfit);
   }

   public static int maxProfit(int[] prices) {
      // Check for empty array
      if (prices.length == 0) {
         return 0;
      }

      int profit = 0; // Variable to store the current profit
      int min = prices[0]; // Variable to store the minimum stock price encountered
      int maxProfit = 0; // Variable to store the maximum profit

      // Iterate through the stock prices
      for (int stockPrice : prices) {
         min = Math.min(min, stockPrice); // Update the minimum stock price
         profit = stockPrice - min; // Calculate the current profit
         maxProfit = Math.max(profit, maxProfit); // Update the maximum profit
      }

      // Return the maximum profit
      return maxProfit;
   }
}
