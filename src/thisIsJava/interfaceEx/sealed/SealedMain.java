package thisIsJava.interfaceEx.sealed;

public class SealedMain {
    public static void main(String[] args) {
        ImplClass implClass = new ImplClass();

        InterfaceA ia = implClass;
        ia.methodA();

        System.out.println();

        InterfaceB ib = implClass;
        ib.methodA();
        ib.methodB();

        System.out.println();

        InterfaceC ic = implClass;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
