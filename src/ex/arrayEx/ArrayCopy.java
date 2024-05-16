package ex.arrayEx;

public class ArrayCopy {
    public static void main(String[] args) {

        String[] oldStr = {"JAVA", "Array", "Copy"};
        String[] newStr = new String[5];

        System.arraycopy(oldStr, 0, newStr, 0, oldStr.length);

        for (String s : newStr) {
            System.out.println(s);
        }
    }
}
