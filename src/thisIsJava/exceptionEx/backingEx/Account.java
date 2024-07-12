package thisIsJava.exceptionEx.backingEx;

import javax.naming.InsufficientResourcesException;

public class Account {
    private long balance;

    public Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(long amount) {
        balance += amount;
    }

    public void withdraw(long amount) throws InsufficientResourcesException {
        if (balance < amount) {
            throw new InsufficientResourcesException("잔고 부족: " + (amount - balance) + " 모자람.");
        }
        balance -= amount;
    }
}
