class Buy implements TradingMethods {
    @Override
    public int calculateProfit(int N, int c1, int c2, int[] sharePrices, Shares shares) {
        int balance = 0;

        for (int i = 0; i < N; i++) {
            if (sharePrices[i] <= c1 && i!=N-1) {
                // Buy share for exception on last day if less than c1
                shares.buyShares(1);
                balance -= sharePrices[i];
            }
        }

        return balance;
    }
}
