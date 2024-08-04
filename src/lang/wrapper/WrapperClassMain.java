package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // Deprecated. 미래에 삭제 예정. 대신에 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10); // -128~127을 캐싱하고 있어서 자주 사용하는 숫자 값 재사용, 불변.

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("\n내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("\n비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + newInteger.equals(integerObj));

        Integer integerObj2 = Integer.valueOf(10); // valueOf: 문자열 풀처럼 자주 사용하는 값을 저장하고 반환하는 형식
        System.out.println("==: " + (integerObj == integerObj2)); // true
        System.out.println("equals: " + integerObj.equals(integerObj2));
    }
}
