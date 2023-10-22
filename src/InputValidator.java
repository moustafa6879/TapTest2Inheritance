class InputValidator {
    public static boolean isValidInput(int N, int c1, int c2) {
        return (N >= 1 && N <= 100 && c1 >= 1 && c1 < c2 && c2 <= 1000);
    }

    public static boolean isValidSharePrice(int price) {
        return (price >= 1 && price <= 1000);
    }
}