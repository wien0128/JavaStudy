package ImmutableEx;

public final class ImmutableClass {
    private final String value;

    public ImmutableClass(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "value=" + value +
                '}';
    }
}
