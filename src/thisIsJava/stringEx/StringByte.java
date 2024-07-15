package thisIsJava.stringEx;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringByte {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String data = "자바";

        // String -> byte Array (UTF-8)
        byte[] arr1 = data.getBytes();
        System.out.println("arr1: " + Arrays.toString(arr1));

        // byte Array -> String (UTF-8)
        String str1 = new String(arr1);
        System.out.println("str1: " + str1);

        // String -> byte Array (EUC-KR)
        byte[] arr2 = data.getBytes("EUC-KR");
        System.out.println("arr2: " + Arrays.toString(arr2));

        // byte Array -> String (UTF-8)
        String str2 = new String(arr2, "EUC-KR");
        System.out.println("str2: " + str2);
    }
}
