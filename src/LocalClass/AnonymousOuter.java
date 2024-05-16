package LocalClass;

// 익명 클래스
// - 이름 없는 지역 클래스를 선언과 동시에 생성
// - 부모 클래스 상속 도는 인터페이스 구현해야 함
// - 단 한번만 인스턴스 생성, 여러 번 생성이 필요하면 지역 클래스로
// - 지역 클래스와 마찬가지로 final, effectively final인 지역 변수만 접근 가능
// - 이벤트 리스너, 콜백 객체 정의시 사용

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;
        // Printer 인터페이스를 상속, 구현, 생성을 동시에 함
        Printer printer = new Printer() { // 익명 클래스
            int value = 0;
            @Override
            public void print() {
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }
        };
        printer.print();
        System.out.println("printer.class= " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
