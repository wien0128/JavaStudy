package thisIsJava.lambdaEx.sec04;

public class CalcMain {
    public static void main(String[] args) {
        Person p = new Person();

        // 실행문이 두 개 이상일 경우
        p.action((x, y) -> {
            double res = x + y;
            return res;
        });

        //p.action((x, y) -> {
        //    return (x + y);
        //});
        // 리턴이 하나만 있을 경우 (연산)
        p.action((x, y) -> (x + y));

        //p.action((x, y) -> {
        //    retrun sum(x, y);
        //});
        // 리턴이 하나만 있을 경우 (메소드 호출)
        p.action((x, y) -> sum(x, y));
    }

    public static double sum(double x, double y) {
        return x + y;
    }
}
