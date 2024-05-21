package genericEx.animalHospital;

// Animal 타입의 자식 타입이 들어 오길 기대했지만
// Animal에 대한 정보는 어디에도 없기에 컴파일러는 최상위 부모 타입 Object로 설정
// 따라서 Object가 제공하는 메소드만 호출 가능
// 또 다른 문제론 Integer, Object 같은 관계 없는 타입을 인자로 받을 수 있음.
// 우리는 최소한 Animal 혹은 자식을 타입 인자로 제한하고 싶음

public class AnimalHospitalV2<T> {
    private T animal;
    public void set(T animal) {
        this.animal = animal;
    }
    public void checkup() {
        // 제네릭 타입은 메서드를 정의하는 시점에 추론 불가능.
        // 따라서 Object의 기능만 사용 가능
        animal.toString();
        animal.equals(null);

        // 컴파일 오류
        //System.out.println("동물 이름: " + animal.getName());
        //animal.sound();
    }
    public T getBigger(T target) {
        // 컴파일 오류
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
