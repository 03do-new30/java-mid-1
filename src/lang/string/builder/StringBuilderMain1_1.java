package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // 가변 객체!
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("after insert: " + sb);

        sb.delete(4, 8);
        System.out.println("after delete: " + sb);

        sb.reverse();
        System.out.println("after reverse: " + sb);

        // StringBuilder -> String
        String string = sb.toString(); // 불변 객체!
        // 문자열 변경이 완료되면 String으로 변환해서 사용하는 것이 좋음 (사이드 이펙트 방지)
        System.out.println("string = " + string);
    }
}
