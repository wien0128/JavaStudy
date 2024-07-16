package thisIsJava.regexEx;

import java.util.regex.Pattern;

public class PatternEx {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";
        boolean res = Pattern.matches(regExp, data);
        
        if (res) {
            System.out.println("정규식과 일치");
        } else {
            System.out.println("정규식과 불일치");
        }

        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@mycompanycom";
        res = Pattern.matches(regExp, data);
        if (res) {
            System.out.println("정규식과 일치");
        } else {
            System.out.println("정규식과 불일치");
        }
    }
}
