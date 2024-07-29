package lang.immutable.example;

public class ImmutableStudentMain {
    public static void main(String[] args) {
        ImmutableStudent studentA = new ImmutableStudent("코뉴", "ComputerScience");
        ImmutableStudent studentB = studentA;

        System.out.println("studentA와 studentB는 \"코뉴\" 라는 이름을 가진 동명이인이고, 둘 다 컴퓨터과학 전공이다.");
        System.out.println("studentA = " + studentA);
        System.out.println("studentB = " + studentB);

        System.out.println("\n어느날, studentB인 코뉴는 수학과로 전과한다.");
        studentB = studentB.withMajor("Mathematics");
        System.out.println("studentA = " + studentA);
        System.out.println("studentB = " + studentB);
    }
}
