package Interface;

interface Bird {
    String STATIC_VARIABLE = "STATIC";
    void fly(int x, int y, int z);
    default void printBreed() {
        System.out.println("나는 새 중에 " + getBreed() + " 입니다.");
    }
    String getBreed();
    static void staticMethod() {
        System.out.println("This is static method");
    }
    abstract void abstractMethod();
}

interface Pet {
    String getHome();
}

class Pigeon implements Bird, Pet{
    private int x, y, z;
    @Override
    public void fly(int x, int y, int z) {
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;
        this.z = z;
        printLocation();
    }
    @Override
    public String getBreed() {
        return "비둘기";
    }
    @Override
    public void abstractMethod() {
        System.out.println("this is abtract method implemented from Pigeon");
    }
    public void printLocation() {
        System.out.println("현재 위치 (" + x + ", " + y + ", " + z + ")");
    }
    @Override
    public String getHome() {
        return "도곡동";
    }
}

public class Example {
    public static void main(String[] args) {
        Bird bird = new Pigeon();
        bird.fly(1, 2, 3);
        bird.printBreed();
        bird.abstractMethod();
        Bird.staticMethod();
        System.out.println(Bird.STATIC_VARIABLE);
    }
}
