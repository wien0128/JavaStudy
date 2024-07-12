package thisIsJava.exceptionEx;


public class ExceptionMultiple2 {
    public static void main(String[] args) {
        String[] arr = {"100", "1oo", null, "200"};
        for (int i = 0; i <= arr.length; i++) {
            try {
                int value = Integer.parseInt(arr[i]);
                System.out.println("arr[" + i + "] = " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out of Bounds: " + e.getMessage());
            // 2가지 예외를 동일하게 처리
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("Wrong Data: " + e.getMessage());
            }
        }
    }
}
