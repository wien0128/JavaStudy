package exceptionEx.last;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NetworkService networkService = new NetworkService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
    }
    
    private static void exceptionHandler(Exception e) { // 공통 예외 처리
        System.out.println("알 수 없는 문제 발생");
        System.out.println("==for Dev==");
        e.printStackTrace();  // 스택 트레이스 출력

        // 예외 별로 별도의 추가 처리
        if (e instanceof SendException sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}
