package collection.hashSet;


public class HashCodeMain {
    public static void main(String[] args) {

        // Object의 디폴트 hashCode()는 객체의 참조값 기반으로 생성.
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        // Wrapper 클래스 등 제공되는 클래스는 모두 오버라이딩되어 있음.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";
        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        // -1 값 가능
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        // 인스턴스는 다름, equals는 같음
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // 동일성(주소값) 비교
        System.out.println("(member1 == member2) = " + (member1 == member2));
        // 동등성(내용) 비교
        System.out.println("member1 equals member2 = " + member1.equals(member2));

        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
