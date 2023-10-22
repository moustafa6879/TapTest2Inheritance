import java.util.Scanner;

public class ShareTrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N, c1, c2;
        N = scanner.nextInt();
        c1 = scanner.nextInt();
        c2 = scanner.nextInt();
        int[] sharePrices;

        sharePrices = startValidations(scanner,N,c1,c2);


        Shares shares = new Shares();
        TradingMethods buy = new Buy();
        TradingMethods sell = new Sell();

        int result = buy.calculateProfit(N, c1, c2, sharePrices,shares) + sell.calculateProfit(N, c1, c2, sharePrices,shares);
        System.out.println(result);
    }

    public static int[] startValidations(Scanner scanner, int N, int c1, int c2){
        if (!InputValidator.isValidInput(N, c1, c2)) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        int[] sharePrices = new int[N];
        for (int i = 0; i < N; i++) {
            sharePrices[i] = scanner.nextInt();
            if (!InputValidator.isValidSharePrice(sharePrices[i])) {
                System.out.println("Invalid share price");
                System.exit(1);
            }
        }
        return sharePrices;
    }
}