package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String result = "";
        for (int i = 0; i < 100000; i++) {
            // 루프 내에서 문자열을 더하는 경우에는 최적화가 이루어지지 않는다
            // 런타임 시점에 어떤 문자가 더해질지 알 수 있기 때문이다. 컴파일러의 소관이 아님.
            result += "Hello Java ";

            // 아래와 같은 동작을 할 것
            // result = new StringBuilder().append(result).append("Hello Java ").toString();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms"); // 2616ms
    }
}
