package stringEx;

// 짧은 문자열 연산의 경우 +로 충분하지만
// 다음과 같이 오버헤드가 심각할 경우 StringBuilder 사용
//

public class LoopStringMain {
    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        String result = "";
//
//        for (int i = 0; i < 100000; i++) {
//            result += "Hello Java ";
//        }
//
//        long endTime = System.currentTimeMillis();
//
//        System.out.println("result = " + result);
//        System.out.println("time = " + (endTime - startTime) + "ms");


//        long startTime = System.currentTimeMillis();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < 100000; i++) {
//            sb.append("Hello Java ");
//        }
//
//        String result = sb.toString();
//        long endTime = System.currentTimeMillis();
//
//        System.out.println("result = " + result);
//        System.out.println("time = " + (endTime - startTime) + "ms");


        long startTime2 = System.currentTimeMillis();
        String sb2 = new String("Hello Java ");

        sb2 = sb2.repeat(100000);
        System.out.println(sb2.length());

        long endTime2 = System.currentTimeMillis();

        System.out.println("time = " + (endTime2 - startTime2) + "ms");
    }
}
