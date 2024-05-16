package NestedClassEx;

// 정적 중첩 클래스(static nested class)
public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class NestedStatic {
        private int nestedInstanceValue = 1;
        public void print() {
            // 본인의 멤버 변수 접근 가능
            System.out.println(nestedInstanceValue);
            // OuterClass의 인스턴스(non-static) 멤버에는 접근 불가
            //System.out.println(outInstanceValue);
            // OuterClass의 클래스(static) 멤버는 접근 가능, private도 가능
            System.out.println(NestedOuter.outClassValue);
        }
    }
}
