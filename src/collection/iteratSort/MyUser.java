package collection.iteratSort;

public class MyUser implements Comparable<MyUser>{
    private String id;
    private int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    // 정렬을 위한 Comparable 구현, 나이 오름차순
    // 이렇게 구현한 순서를 자연 순서라 함
    @Override
    public int compareTo(MyUser o) {
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }

    @Override
    public String toString() {
        return "MyUser [id= '" + id + "', age= " + age + "]";
    }
}
