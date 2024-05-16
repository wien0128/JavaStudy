package NestedClassEx;

// 정적 중첩 클래스와는 다르게 내부 클래스는 바깥 인스턴스에 속한다.
public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        private int innerInstanceValue = 1;
        public void print() {
            // 자기 멤버 변수 접근 가능
            System.out.println(innerInstanceValue);
            // OuterClass 인스턴스 변수 접근 가능
            System.out.println(outInstanceValue);
            // OuterClass 클래스 변수 접근 가능
            System.out.println(InnerOuter.outClassValue);
        }
    }
}
