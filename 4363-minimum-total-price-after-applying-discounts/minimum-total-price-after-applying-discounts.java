class Solution {
    public double minPrice(int[] prices, int[] discounts) {
         Arrays.sort(prices);
        Arrays.sort(discounts);

        int n = prices.length - 1;
        int m = discounts.length - 1;

        double total = 0;

        while (n >= 0 && m >= 0) {
            double price = prices[n] * (100.0 - discounts[m]) / 100.0;
            total += price;

            n--;
            m--;
        }
        while (n >= 0) {
            total += prices[n];
            n--;
        }

        return total;
    }
}