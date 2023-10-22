class BuyAndSell implements TradingMethods {
    @Override
    public int calculateProfit(int N, int c1, int c2, int[] sharePrices) {
        int shares = 0;
        int balance = 0;

        for (int i = 0; i < N; i++) {
            if (sharePrices[i] <= c1) {
                // Buying
                balance -= sharePrices[i];
                shares++;
            } else if (sharePrices[i] >= c2) {
                // Selling (Not handling last day selling)
                balance += (shares * sharePrices[i]);
                shares = 0;
            }
        }

        // Sell any remaining shares on the last day
        balance += (shares * sharePrices[N - 1]);
        return balance;
    }
}