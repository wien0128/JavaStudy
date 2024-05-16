package ImmutableEx;

public class MemberV2 {
    private String name;
    private ImmutableClass address;
    public MemberV2(String name, ImmutableClass address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public ImmutableClass getAddress() {
        return address;
    }
    public void setAddress(ImmutableClass address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "MemberV2{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
