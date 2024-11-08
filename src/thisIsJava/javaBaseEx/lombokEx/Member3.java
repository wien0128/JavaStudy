package thisIsJava.javaBaseEx.lombokEx;

//import lombok.Data;
//import lombok.NonNull;

// final 혹은 @NonNull이 붙은 코드가 있다면
// 해당 필드만 초기화 하는 생성자 추가
//@Data
public class Member3 {
    private final String id = "id";
    //@NonNull private String name;   // Null 검사 코드가 만들어짐
    private int age;
}
