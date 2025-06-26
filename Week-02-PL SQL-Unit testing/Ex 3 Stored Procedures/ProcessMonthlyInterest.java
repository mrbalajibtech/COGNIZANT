public class ProcessMonthlyInterest {

    public static void main(String[] args) {
        double[] savingsBalances = {5000.0, 12000.0, 7500.0, 10000.0};

        System.out.println("Processing Monthly Interest (1%) for all Savings Accounts:\n");

        for (int i = 0; i < savingsBalances.length; i++) {
            double interest = savingsBalances[i] * 0.01;
            savingsBalances[i] += interest;
            System.out.println("Account " + (i + 1) + " | New Balance: $" + savingsBalances[i]);
        }
    }
}
