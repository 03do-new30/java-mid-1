package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002
        System.out.println("메서드 호출 비교 1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교 2: " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
        // x와 y를 new String()으로 생성한 것을 넘겨줄지, 리터럴을(문자열 풀에 있는 것을 이용) 넘겨줄지 isSame()의 개발자는 모른다.
//        return x == y;

        // 따라서 항상 동등성 비교를 해야 한다
        return x.equals(y);
    }
}
