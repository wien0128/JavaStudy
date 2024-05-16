package ex.classEx;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double res1 = calculator.areaRectangle(100);
        double res2 = calculator.areaRectangle(100, 20);

        System.out.println(res1);
        System.out.println(res2);
    }
}
