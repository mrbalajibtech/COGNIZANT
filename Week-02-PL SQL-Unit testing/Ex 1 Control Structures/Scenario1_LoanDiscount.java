public class Scenario1_LoanDiscount {

    public static void main(String[] args) {
        int[] customerAges = {45, 62, 70, 55, 80};
        double[] loanInterestRates = {7.5, 8.0, 7.8, 8.2, 7.9};

        System.out.println("Applying 1% discount to customers above 60 years old:\n");

        for (int i = 0; i < customerAges.length; i++) {
            if (customerAges[i] > 60) {
                loanInterestRates[i] -= 1.0;
                System.out.println("Customer " + (i + 1) + " | Age: " + customerAges[i] + " | New Interest Rate: " + loanInterestRates[i] + "%");
            }
        }
    }
}
