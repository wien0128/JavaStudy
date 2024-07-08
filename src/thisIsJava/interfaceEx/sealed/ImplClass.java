package thisIsJava.interfaceEx.sealed;

public class ImplClass implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("methodA() execute");
    }

    @Override
    public void methodB() {
        System.out.println("methodB() execute");
    }

    @Override
    public void methodC() {
        System.out.println("methodC() execute");
    }
}
