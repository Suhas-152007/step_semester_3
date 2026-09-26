class PayrollAccount {

    private double basicSalary;
    private double bonus;

    public PayrollAccount(double basicSalary) {

        if (basicSalary < 0) {
            this.basicSalary = 0;
            System.out.println("Negative salary not allowed.");
        } else {
            this.basicSalary = basicSalary;
        }

        bonus = 0;
    }

    public void creditBonus(double amount) {

        if (amount <= 0) {
            System.out.println("Bonus must be greater than zero.");
        } else {
            bonus = bonus + amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }

    public void deductTax(double percent) {

        basicSalary = basicSalary - (basicSalary * percent / 100);

        System.out.println("Tax deducted: " + percent + "%");
    }

    public double getNetSalary() {
        return basicSalary + bonus;
    }
}

public class PayrollAccount {

    public static void main(String[] args) {

        PayrollAccount employee = new PayrollAccount(50000);

        employee.creditBonus(5000);
        employee.deductTax(10);

        System.out.println(
            "Net salary: Rs " + employee.getNetSalary()
        );
    }
}