public class Scenario2_VIPPromotion {

    public static void main(String[] args) {
        double[] customerBalances = { 5000.0, 15000.0, 8000.0, 25000.0, 9500.0 };
        boolean[] isVIP = new boolean[customerBalances.length];

        System.out.println("Promoting customers to VIP status with balance over $10,000:\n");

        for (int i = 0; i < customerBalances.length; i++) {
            if (customerBalances[i] > 10000.0) {
                isVIP[i] = true;
                System.out.println(
                        "Customer " + (i + 1) + " | Balance: $" + customerBalances[i] + " | VIP Status: " + isVIP[i]);
            }
        }
    }
}
