import java.util.Scanner;

public class ShareTrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, c1, c2;
        N = scanner.nextInt();
        c1 = scanner.nextInt();
        c2 = scanner.nextInt();
        int[] sharePrices;

        sharePrices = startValidations(scanner,N,c1,c2);


        TradingMethods trade = new BuyAndSell();

        int result = trade.calculateProfit(N, c1, c2, sharePrices);
        System.out.println(result);
    }

    public static int[] startValidations(Scanner scanner, int N, int c1, int c2){
        if (!InputValidator.isValidInput(N, c1, c2)) {
            System.out.println("Invalid input");
        }

        int[] sharePrices = new int[N];
        for (int i = 0; i < N; i++) {
            sharePrices[i] = scanner.nextInt();
            if (!InputValidator.isValidSharePrice(sharePrices[i])) {
                System.out.println("Invalid share price");
            }
        }
        return sharePrices;
    }
}