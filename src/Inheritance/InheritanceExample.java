package Inheritance;

public class InheritanceExample {
    static class Animal {
        String name;
        public void cry() {
            System.out.println(name + " is crying.");
        }
    }
    static class Dog extends Animal {
        String breed;

        Dog(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }
        public void bark() {
            System.out.println(name + "(" + breed + ") is barking.");
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog("코코", "허스키");
        dog.cry();
        dog.bark();
        Animal animal = dog;
        animal.cry();
    }
}
