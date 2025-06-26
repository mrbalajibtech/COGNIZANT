public class UpdateEmployeeBonus {

    public static void main(String[] args) {
        String[] employeeDepartments = { "IT", "HR", "Sales", "IT", "Sales" };
        double[] employeeSalaries = { 50000.0, 45000.0, 55000.0, 60000.0, 52000.0 };

        String targetDepartment = "Sales";
        double bonusPercentage = 10.0;

        System.out.println("Applying " + bonusPercentage + "% bonus for department: " + targetDepartment + "\n");

        for (int i = 0; i < employeeDepartments.length; i++) {
            if (employeeDepartments[i].equals(targetDepartment)) {
                double bonus = employeeSalaries[i] * (bonusPercentage / 100);
                employeeSalaries[i] += bonus;
                System.out.println("Employee " + (i + 1) + " | New Salary: $" + employeeSalaries[i]);
            }
        }
    }
}
