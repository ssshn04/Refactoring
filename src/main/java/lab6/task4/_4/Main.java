package lab6.task4._4;
public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000);
        double balance = account.applyCommission();
        System.out.println("Balance after commission: " + balance);
    }
}

