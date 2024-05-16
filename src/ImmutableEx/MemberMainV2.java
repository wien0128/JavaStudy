package ImmutableEx;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableClass address = new ImmutableClass("Tom");
        MemberV2 memberA = new MemberV2("멤버A", address);
        MemberV2 memberB = new MemberV2("멤버B", address);

        System.out.println("MemberA = " + memberA);
        System.out.println("MemberB = " + memberB);

        memberB.setAddress(new ImmutableClass("부산"));
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
