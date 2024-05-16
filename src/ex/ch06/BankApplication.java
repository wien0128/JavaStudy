package ex.ch06;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accounts = new Account[100];
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;

        while (flag) {
            System.out.println("________________________________");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("________________________________");
            System.out.print("선택> ");

            int op = in.nextInt();

            switch (op) {
                case 1  -> createAccount();
                case 2  -> accountsShow();
                case 3  -> deposit();
                case 4  -> withdraw();
                case 5  -> flag = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void withdraw() {
        System.out.println("-------");
        System.out.println("출금");
        System.out.println("-------");

        System.out.print("계좌번호: ");
        String depositAccountNumber = in.next();

        System.out.print("예금액: ");
        int withdrawMoney = in.nextInt();

        Account account = findAccount(depositAccountNumber);

        if (account == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
            return;
        }

        if (account.getBalance() < withdrawMoney) {
            System.out.println("예금액보다 많은 금액을 인출 하실 수 없습니다.");
            return;
        }

        account.setBalance(account.getBalance() - withdrawMoney);
        System.out.println("결과: 출금이 성공적으로 되었습니다.");
    }

    private static void deposit() {
        System.out.println("-------");
        System.out.println("예금");
        System.out.println("-------");

        System.out.print("계좌번호: ");
        String depositAccountNumber = in.next();

        System.out.print("예금액: ");
        int depositMoney = in.nextInt();

        Account account = findAccount(depositAccountNumber);

        if (account == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
            return;
        }

        account.setBalance(account.getBalance() + depositMoney);
        System.out.println("결과: 예금이 성공적으로 되었습니다.");
    }

    private static void accountsShow() {
        System.out.println("-------");
        System.out.println("계좌목록");
        System.out.println("-------");

        for (Account account : accounts) {
            if (account != null) {
                System.out.print(account.getAccountNumber());
                System.out.print("  ");
                System.out.print(account.getOwner());
                System.out.print("  ");
                System.out.print(account.getBalance());
                System.out.println();
            }
        }
    }

    private static void createAccount() {
        System.out.println("-------");
        System.out.println("계좌생성");
        System.out.println("-------");

        System.out.print("계좌번호: ");
        String accountNumber = in.next();

        System.out.print("계좌주: ");
        String owner = in.next();

        System.out.print("초기입금액: ");
        int balance = in.nextInt();

        Account newAccount = new Account(accountNumber, owner, balance);

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null && accounts.length <= 100) {
                accounts[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    private static Account findAccount(String accountNumber) {
        Account account = null;
        for (Account v : accounts) {
            if (v != null && v.getAccountNumber().equals(accountNumber)) {
                account = v;
                break;
            }
        }

        return account;
    }
}
