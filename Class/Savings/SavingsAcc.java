package Class.Savings;

public class SavingsAcc {
    private double ints; // Annual interest rate
    private double bal;  // Current balance

    // Constructor
    public SavingsAcc(double Int, double Bal) {
        ints = Int;
        bal = Bal;
    }

    // Withdraw method
    public void withdraw(double with) {
        bal -= with;
    }

    // Deposit method
    public void deposit(double dep) {
        bal += dep;
    }

    // Monthly interest calculation
    public double calculateMonthlyInterest() {
        return bal * (ints / 1200.0); // Calculate interest without modifying bal
    }

    public double getBalance() {
        return bal;
    }

    public void applyMonthlyInterest() {
        bal += calculateMonthlyInterest(); // Apply interest after deposit/withdrawal
    }
}
