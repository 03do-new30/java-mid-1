package lang.system;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 운영체제의 환경 변수를 읽는다.
        Map<String, String> getenv = System.getenv();
        System.out.println("getenv = " + getenv);

        // 시스템 속성을 읽는다.
        // 자바가 사용하는 시스템의 기본적인 환경 설정
        Properties properties = System.getProperties();
        System.out.println("properties = " + properties);
        System.out.println("Java version: " + properties.getProperty("java.version"));

        // 배열을 고속으로 복사한다. (운영체제에게 복사를 넘김)
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        // 운영체제, 시스템 레벨에 던져서 배열을 복사한다. (for 루프를 돌려서 복사하는 것보다 빠르다. 통째로 복사해버리는 느낌.)
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        // 배열 출력
        System.out.println("originalArray = " + Arrays.toString(originalArray));
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
        System.out.println("Hello"); // 실행되지 않음
    }
}
