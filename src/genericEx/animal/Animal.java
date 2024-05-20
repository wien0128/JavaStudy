package genericEx.animal;

public class Animal {
    private String name;
    private int size;

    public Animal(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void sound() {
        System.out.println("꾸어어워웡어어엉");
    }

    @Override
    public String toString() {
        return "Animal { " +
                "name= '" + name + '\'' +
                ", size= " + size +
                '}';
    }
}
