package thisIsJava.exceptionEx;

public class MySrc implements AutoCloseable {
    private String name;

    public MySrc(String name) {
        this.name = name;
        System.out.println("MySrc( " + name + ") Open.");
    }

    public String read1() {
        System.out.println("MySrc( " + name + ") Read1.");
        return "100";
    }

    public String read2() {
        System.out.println("MySrc( " + name + ") Read2.");
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("MySrc( " + name + ") Close.");
    }
}
