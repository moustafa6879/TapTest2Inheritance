class Shares {
    private int shares = 0;

    public void buyShares(int count) {
        shares += count;
    }

    public int sellShares(int price) {
        int profit = shares * price;
        shares = 0;
        return profit;
    }
}