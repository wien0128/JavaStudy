package ImmutableEx;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        return new ImmutableObj(this.value + addValue);
    }

    public int getValue() {
        return value;
    }
}
