class Sell implements TradingMethods {
    @Override
    public int calculateProfit(int N, int c1, int c2, int[] sharePrices, Shares shares) {
        int balance = 0;

        for (int i = 0; i < N; i++) {
            if (sharePrices[i] >= c2 || i == N - 1) {
                // Sell all shares for all day cases if sharePrice more than c2
                balance += shares.sellShares(sharePrices[i]);
            }
        }

        return balance;
    }
}