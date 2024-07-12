package thisIsJava.exceptionEx.backingEx;

import javax.naming.InsufficientResourcesException;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("Deposit amount : " + account.getBalance());

        try {
            account.withdraw(30000);
        } catch (InsufficientResourcesException e) {
            System.out.println(e.getMessage());
        }
    }
}
