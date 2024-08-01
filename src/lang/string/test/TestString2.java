package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;
        for (String string : arr) {
            int length = string.length();
            sum += length;
            String s = String.join(":", string, String.valueOf(length));
            System.out.println(s);
        }
        System.out.println("sum = " + sum);
    }
}
