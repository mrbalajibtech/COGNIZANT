public class Scenario3_LoanReminder {

    public static void main(String[] args) {
        String[] customerNames = { "Balaji", "Shalini", "Shobana", "Rolex", "Vikram" };
        int[] loanDueInDays = { 40, 15, 5, 60, 25 };

        System.out.println("Sending reminders for loans due within the next 30 days:\n");

        for (int i = 0; i < customerNames.length; i++) {
            if (loanDueInDays[i] <= 30) {
                System.out.println(
                        "Reminder: Dear " + customerNames[i] + ", your loan is due in " + loanDueInDays[i] + " days.");
            }
        }
    }
}
