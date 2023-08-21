package Method;

public class CalculationTest {

    static class Calculation {
        int add(int x, int y) {
            int result = x + y;
            return result;
        }
        int subtract(int x, int y) {
            int result = x - y;
            return result;
        }
    }
}

class Main {
    public static void main(String[] args) {
        CalculationTest.Calculation calculation = new CalculationTest.Calculation();
        int addResult = calculation.add(100, 90);
        int subResult = calculation.subtract(90, 70);
        System.out.println("두 개를 더한 값은 " + addResult);
        System.out.println("두 개를 뺀 값은 " + subResult);
    }
}
