package genericEx.method;

// 제네릭 메소드는 클래스 전체가 아닌 개별 메서드 단위로 제레닉을 도입
// 호출 직전에 타입을 명시적으로 정함

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        //타입 추론, 타입 인자 생략
        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);
    }
}
