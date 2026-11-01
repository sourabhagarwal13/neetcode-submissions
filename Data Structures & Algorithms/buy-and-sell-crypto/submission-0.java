class Solution {
  public int maxProfit(int[] prices) {
    int result = 0;
    for (int i = 0; i < prices.length - 1; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        int pnf = prices[j] - prices[i];
        if (pnf < 0) {
          continue;
        }
        result = Math.max(pnf, result);
      }
    }
    return result;
  }
}
