package BankApplicationSystem;

import java.util.*;

abstract class Account {
    private long accNumber;
    private double balance;

    public Account(long a, double bal) {
        this.accNumber = a;
        this.balance = bal;
    }

    public void setAccountNumber(long A) {
        this.accNumber = A;
    }

    public void setBalance(double b) {
        this.balance = b;
    }

    public long getAccountNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdrawl(double amount);
}

class SavingsAccount extends Account {
    private double intrate;

    public SavingsAccount(long Accno, double balance, double intrate) {
        super(Accno, balance);
        this.intrate = intrate;
    }

    public double getInterestRate() {
        return intrate;
    }

    public void setInterestRate(double intrate) {
        this.intrate = intrate;
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * (intrate / 100);
        setBalance(getBalance() + (amount + interest));
    }

    public void withdrawl(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient Balance!!");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftlimit;

    public CurrentAccount(long accNumber, double balance, double overdraftlimit) {
        super(accNumber, balance);
        this.overdraftlimit = overdraftlimit;
    }

    public void setOverDraftLimit(double overdraftlimit) {
        this.overdraftlimit = overdraftlimit;
    }

    public double getOverDraftLimit() {
        return overdraftlimit;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdrawl(double amount) {
        if (getBalance() - amount >= -getOverDraftLimit()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount s1 = new SavingsAccount(2345678, 200000, 25);
        CurrentAccount c1 = new CurrentAccount(45687445, 400000, 25000);
        System.out.println("Choose the type of account: ");
        System.out.println("1.Press 1 for Savings Account.");
        System.out.println("2.Press 2 for Current Account.");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Welcome Your acount balance is" + s1.getBalance());
            System.out.println("Press 1 for deposit.");
            System.out.println("Press 2 for withdrawl.");
            int op = sc.nextInt();
            if (op == 1) {
                System.out.println("Enter the deposit amount: ");
                double amount = sc.nextInt();
                s1.deposit(amount);
                System.out.println(amount + "deposited successfully!!");
                System.out.println("Your balance is: " + s1.getBalance());
            } else if (op == 2) {
                System.out.println("Enter the withdrawl amount: ");
                double amount = sc.nextInt();
                s1.withdrawl(amount);
                System.out.println("Your remainig balance is: " + s1.getBalance());
            } else {
                System.out.println("Wrong Input");
            }
        } else if (n == 2) {
            System.out.println("Welcome Your acount balance is" + c1.getBalance());
            System.out.println("Press 1 for deposit.");
            System.out.println("Press 2 for withdrawl.");
            int op = sc.nextInt();
            if (op == 1) {
                System.out.println("Enter the deposit amount: ");
                double amount = sc.nextInt();
                c1.deposit(amount);
                System.out.println(amount + "deposited successfully!!");

                System.out.println("Your balance is: " + c1.getBalance());
            } else if (op == 2) {
                System.out.println("Enter the withdrawl amount: ");
                double amount = sc.nextInt();
                c1.withdrawl(amount);
                System.out.println("Your remainig balance is: " + c1.getBalance());
            } else {
                System.out.println("Wrong Input");
            }
        } else {
            System.out.println("Wrong Input!!");
        }

    }
}
