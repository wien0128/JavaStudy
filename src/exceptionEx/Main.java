package exceptionEx;

import java.util.Scanner;

// 모든 곳에서 예외를 잡지 않아 main 밖으로 던짐
// 예외 메시지와 예외 추적 스택 트레이스 출력 후 종료

public class Main {
    public static void main(String[] args) throws NetworkClientException {
        NetworkService networkService = new NetworkService();
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
