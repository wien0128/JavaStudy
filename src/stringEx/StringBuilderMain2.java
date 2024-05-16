package stringEx;

public class StringBuilderMain2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String string = sb.append("A").append("B").append("C").append("D")
                        .insert(4, "Java")
                        .delete(4, 8)
                        .reverse()
                        .toString();

        System.out.println("string = " + string);
    }
}
