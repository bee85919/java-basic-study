package Inheritance;

public class Overloading2 {
    // 아래의 예제는 오버로딩이 아닌 것을 보여주는 예제임

    int add(int x, int y, int z) {
        int result = x + y + z;
        return result;
    }

    long add(int a, int b) {
        long result = a + b;
        return result;
    }

    public static void main(String[] args) {
        Overloading2 overloading = new Overloading2();

        System.out.println(overloading.add(10, 20, 30));
        System.out.println(overloading.add(10, 20));
    }
}
