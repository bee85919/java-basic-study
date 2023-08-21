package Inheritance;

public class Overloading {

    static int add(int x, int y, int z) {
        int result = x + y + z;
        return result;
    }

    static long add(int a, int b, long c) {
        long result = a + b + c;
        return result;
    }

    static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20, 30));
        System.out.println(add(10, 20, 30L));
        System.out.println(add(10, 20));
    }
}
