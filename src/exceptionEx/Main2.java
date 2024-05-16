package exceptionEx;

import java.util.Scanner;

// 예외 종류에 따라 오류 메시지가 달라진다

public class Main2 {
    public static void main(String[] args) {
        NetworkService5 networkService = new NetworkService5();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 정상 종료");
    }
}
