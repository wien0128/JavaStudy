package thisIsJava.ch06;

public class Account {
    private int balance;
    private String accountNumber;
    private String owner;
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    Account(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
