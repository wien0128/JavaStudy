package LocalClass;

// 지역 클래스 & 지역 변수 캡처
// 지역 클래스: 내부 클래스의 한 종류, 보통 메소드 안에 정의
// - 선언된 영역 내부에서만 생성 및 사용 가능, 외부에서 접근 불가
// - 접근 제한자 사용 불가, [final, abstract] 같은 제한자는 사용 가능
// - 지역 클래스는 final 또는 effectively final(값 변경 없는 변수)만 접근 가능
// - 캡슐화 향상, 상태 캡처, 특정 상황 동작 구현, 임시적인 사용

// 지역 변수 캡처: 지역 변수와 인스턴스의 생명 주기 차이를 극복하는 방법
// - 지역 클래스와 람다식이 지역 변수를 인스턴스 변수로 "캡처"하는 것
// - 캡처는 final 또는 effectively final만 가능
//   - 지역 변수의 값이 변경되거나 제거되는 등 값의 일관성을 위함
//   - 지역 변수의 값과 인스턴스에 캡처한 변수의 값이 달라지는 문제를 막기 위함(동기화 문제)
// - 비동기 프로그래밍 지원, 함수형 프로그래밍 지원, 모듈성 향상

interface Printer { // - 중첩 클래스는 인터페이스 구현, 부모 클래스 상속 가능
    void print();
}

public class LocalOuter1 {
    private int outInstanceVar = 3;
    public void process(int paramVar) { // 파라미터도 지역 변수이다
        int localVar = 1;
        class LocalPrinter implements Printer {
            int value = 0;
            @Override
            public void print() {
                System.out.println("value=" + value); // 인스턴스 변수
                System.out.println("localVar=" + localVar); // 지역 변수 캡처1, 캡처된 변수에 접근
                System.out.println("paramVar=" + paramVar); // 지역 변수 캡처2
                System.out.println("outInstanceVar=" + outInstanceVar); // 바깥 클래스 참조를 통한 변수
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuter1 localOuter = new LocalOuter1();
        localOuter.process(2);
    }
}
