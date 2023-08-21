package Inheritance;
public class AccessModifierTest {
    public void call() {
        AccessModifier accessModifierTest = new AccessModifier();
        accessModifierTest.messageDefault();
        accessModifierTest.messageProtected();
        accessModifierTest.messageOutside();
    }
    public static void main(String[] args) {
        AccessModifierTest accessModifierTest = new AccessModifierTest();
        accessModifierTest.call();
    }
}