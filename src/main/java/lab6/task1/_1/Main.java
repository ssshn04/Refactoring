package lab6.task1._1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(102000.00, 3.00);
        Account acc2 = new Account(200000.00, 4.00);

        List<Account> accounts = new ArrayList<>();
        accounts.add(acc1);
        accounts.add(acc2);

        Bank bank = new Bank(accounts);
        bank.processAccounts();
    }
}
