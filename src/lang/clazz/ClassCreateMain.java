package lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
        // Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");

        // 동적인 객체 생성
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance(); // 현재는 기본 생성자로 생성됨
        String result = hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("result = " + result);
    }
}
