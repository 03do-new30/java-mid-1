package lang.string.test;

public class TestString8 {
    public static void main(String[] args) {
        String input = "hello java spring jpa java";
        String replaced = input.replace("java", "jvm");
        System.out.println("replaced = " + replaced);
    }
}
