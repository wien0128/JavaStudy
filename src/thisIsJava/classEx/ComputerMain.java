package thisIsJava.classEx;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer();

        int res = computer.sum(1, 2, 3);
        System.out.println(res);

        res = computer.sum(1, 2, 3, 4, 5);
        System.out.println(res);
    }
}
