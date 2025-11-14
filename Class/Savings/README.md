# Savings Account Calculator (Java)

This project is a simple Java program that simulates a savings account.  
It allows the user to:

- Enter an annual interest rate
- Enter a starting balance
- Enter the number of months passed
- Input deposits and withdrawals for each month
- Automatically calculate and apply monthly interest
- Display the total deposits, withdrawals, interest earned, and final balance

This project is useful for learning Java basics, OOP, classes, objects, and user input using `Scanner`.

---

## 📂 Project Structure

```
src/
 └── Class/
      └── Savings/
           ├── SavingsAcc.java
           └── SavingsAccMain.java
```

### File Descriptions

#### **SavingsAcc.java**
Contains the `SavingsAcc` class, which handles:

- Deposits
- Withdrawals
- Monthly interest calculation
- Applying interest
- Tracking and returning the balance

#### **SavingsAccMain.java**
Main driver program that:

- Reads user input
- Performs deposits and withdrawals for each month
- Calculates and applies monthly interest
- Tracks totals
- Displays final results

---

## ✨ Features

### ✔ Deposit Money
Adds money to the account balance.

### ✔ Withdraw Money
Subtracts money from the balance.

### ✔ Monthly Interest Calculation
Interest is calculated using:

```
monthlyInterest = balance * (annualRate / 1200)
```

### ✔ Interest Application
Interest is added to the balance each month.

### ✔ Summary Report
At the end, the program prints:

- Total balance
- Total deposits
- Total withdrawals
- Total interest earned

---

## 🚀 How to Run

1. Open the project in IntelliJ IDEA
2. Ensure your folder matches the package structure

```
Class/Savings/
```

3. Run the file:

```
SavingsAccMain.java
```

4. Follow the prompts (interest rate, balance, months, deposits, withdrawals)

---

## 📝 Example Input / Output

### Input Example:
```
Enter the annual interest rate: 5
Enter the starting balance: 1000
Enter the months that have passed: 2

Enter the amount deposited for month-1: 200
Enter the amount withdrawn for month-1: 50

Enter the amount deposited for month-2: 100
Enter the amount withdrawn for month-2: 20
```

### Output Example:
```
The total balance is: 1269.12
The total amount of deposits is: 300.00
The total amount of withdrawals is: 70.00
The total amount of interest earned is: 39.12
```

---

## 🛠 Technologies

- Java
- IntelliJ IDEA
- Scanner Class
- OOP (Classes & Methods)

---

## 📄 Author

Dhairya Patel

