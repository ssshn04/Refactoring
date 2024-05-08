package lab6.task1_1;

import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void processAccounts() {
        for (Account account : accounts) {
            calculateInterest(account);
        }
    }
    private void calculateInterest(Account account) {
        double interest = account.getBalance() * account.getInterestRate() / 100;
        System.out.println("Interest calculated for : " + interest);
        // Логіка для обчислення відсотків...
    }
}
