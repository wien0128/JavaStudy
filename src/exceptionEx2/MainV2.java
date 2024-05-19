package exceptionEx2;

import java.util.Scanner;

// 예외 발생 시 main 밖으로 던짐
// 따라서, 예외 메시지와 스택 트레이스를 출력 후 종료

// 예외 처리를 도입했지만 여전히 예외 발생 시 종료 됨
// disconnect()를 호출 후 종료해야 함

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
        NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
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

        System.out.println("프로그램을 정상 종료합니다.");
    }
}
