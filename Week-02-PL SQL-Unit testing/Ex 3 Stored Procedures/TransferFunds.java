public class TransferFunds {

    public static void main(String[] args) {
        double[] accountBalances = { 5000.0, 3000.0, 8000.0 };

        int sourceAccount = 0;
        int targetAccount = 1;
        double transferAmount = 1500.0;

        System.out.println("Attempting to transfer $" + transferAmount + " from Account " + (sourceAccount + 1)
                + " to Account " + (targetAccount + 1) + "\n");

        if (accountBalances[sourceAccount] >= transferAmount) {
            accountBalances[sourceAccount] -= transferAmount;
            accountBalances[targetAccount] += transferAmount;
            System.out.println("Transfer Successful!");
            System.out.println("Source Account New Balance: $" + accountBalances[sourceAccount]);
            System.out.println("Target Account New Balance: $" + accountBalances[targetAccount]);
        } else {
            System.out.println("Transfer Failed: Insufficient balance in Source Account.");
        }
    }
}
