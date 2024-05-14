package lab6.task4._4;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double applyCommission() {
        double commissionRate = 0.05;
        balance -= balance * commissionRate;
        return balance;
    }
}
