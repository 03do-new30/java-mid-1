package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";

        // String은 불변 객체이므로 변경이 필요한 경우 새로운 결과를 만들어 반환한다.
        String str2 = str1.concat(" java");
        System.out.println("str = " + str1);
        System.out.println("str2 = " + str2);
    }
}
