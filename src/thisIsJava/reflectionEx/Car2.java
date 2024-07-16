package thisIsJava.reflectionEx;

public class Car2 {
    // 필드
    private String model;
    private String owner;
    
    // 생성자
    public Car2() {}
    public Car2(String model) {
        this.model = model;
    }

    // 메소드
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
