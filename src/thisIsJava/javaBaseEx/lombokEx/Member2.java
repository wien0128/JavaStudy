package thisIsJava.javaBaseEx.lombokEx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 모든 필드를 초기화시키는 생성자 포함
@NoArgsConstructor  // 기본 생성자 포함
public class Member2 {
    private String id;
    private String name;
    private int age;
}
