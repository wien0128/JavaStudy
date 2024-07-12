package thisIsJava.exceptionEx;

// 상위 예외 클래스는 아래쪽 catch에 작성

public class ExceptionMultiple1 {
    public static void main(String[] args) {
        String[] arr = {"100", "1oo"};

        for (int i = 0; i <= arr.length; i++) {
            try {
                int value = Integer.parseInt(arr[i]);
                System.out.println("arr[" + i + "] = " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out of Bounds " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Runtime Exception " + e.getMessage());
            }
        }
    }
}
