package thisIsJava.genericEx;

public class Box<T> {
    public T content;

    public boolean compare(Box<T> other) {
        // Object의 equals() 메소드로 content 필드값 비교
        boolean result = content.equals(other.content);
        return result;
    }
}
