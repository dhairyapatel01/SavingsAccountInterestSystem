package Class.Savings;

import java.util.Scanner;

public class SavingsAccMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ints, bal;
        int months;
        double dep, with;
        double totalInt = 0, totalDep = 0, totalWith = 0;

        System.out.print("Enter the annual interest rate: ");
        ints = input.nextDouble();

        System.out.print("Enter the starting balance: ");
        bal = input.nextDouble();

        System.out.print("Enter the months that have passed: ");
        months = input.nextInt();

        // Create SavingsAcc object
        SavingsAcc s = new SavingsAcc(ints, bal);

        for (int i = 1; i <= months; i++) {
            System.out.print("Enter the amount deposited for month-" + i + ": ");
            dep = input.nextDouble();
            totalDep += dep;
            s.deposit(dep);

            System.out.print("Enter the amount withdrawn for month-" + i + ": ");
            with = input.nextDouble();
            totalWith += with;
            s.withdraw(with);

            // Calculate and apply interest
            double interest = s.calculateMonthlyInterest();
            totalInt += interest;
            s.applyMonthlyInterest();
        }

        // Display results
        System.out.printf("The total balance is: %.2f%n", s.getBalance());
        System.out.printf("The total amount of deposits is: %.2f%n", totalDep);
        System.out.printf("The total amount of withdrawals is: %.2f%n", totalWith);
        System.out.printf("The total amount of interest earned is: %.2f%n", totalInt);

        input.close();
    }
}
