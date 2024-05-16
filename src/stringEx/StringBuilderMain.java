package stringEx;

// 기존 불변 객체인 String은 연산할 때 마다
// 불필요한 생성 오버헤드가 발생함.
// 이를 해결하기 위해 StringBuilder라는 가변 String을 지원.
// 보통 사이드 이펙트때문에 문자열 변경이 끝나면 String으로 반환.
// StringBuilder는 내부에 final이 아닌 byte[]를 가짐

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");

        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);
        
        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
