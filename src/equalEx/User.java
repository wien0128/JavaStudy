package equalEx;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {
    private final String id;
    private final String pwd;

    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    // equals() 메소드 오버라이딩
    @Override
    public boolean equals(Object obj) {
        // 자기 자신과의 비교
        if (this == obj) return true;
        // null 검사 및 클래스 타입 비교
        if (obj == null || getClass() != obj.getClass()) return false;

        User user = (User) obj;
        // id와 pwd가 모두 같은 경우에만 true 반환
        return Objects.equals(id, user.id) && Objects.equals(pwd, user.pwd);
    }

    // hashCode() 메소드 오버라이딩
    @Override
    public int hashCode() {
        return Objects.hash(id, pwd);
    }

    public static void main(String[] args) {
        // 주소는 다르지만 값은 같음
        User u1 = new User("김현빈", "1234");
        User u2 = new User("김현빈", "1234");

        // 같은 해시 값 가짐
        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());

        // 객체의 본래 주소 값
        System.out.println("순수 객체의 주소: " + System.identityHashCode(u1));
        System.out.println("순수 객체의 주소: " + System.identityHashCode(u2));

        // 동등하다 == 내용이 같다
        System.out.println(u1.equals(u2));

        // 해시값을 기반으로 중복 불가 삽입하는 HashSet
        Set<User> users = new HashSet<>();
        users.add(u1);
        users.add(u2);

        // 같은 해시 값이기에 하나만 들어감
        System.out.println(users.size());
    }
}


