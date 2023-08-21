package Constructor;

public class ConstructorExample {
    static class Person {
        String name;
        String country;
        int age;
        public Person(String name, String country, int age) {
            this.name = name;
            this.country = country;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Person minsoo = new Person("민수", "대한민국", 10);
        Person paul = new Person("Paul", "America",10);
        Person[] persons = { minsoo, paul };
        for(Person cur : persons) {
            System.out.println("<자기소개>");
            System.out.println("안녕하세요. " + cur.name + " 입니다.");
            System.out.println("저는 "+ cur.country + "에서 태어났습니다.");
            System.out.println("현재 "+ cur.age + "살 입니다.");
        }
    }
}
