package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AuthGrade[] values = AuthGrade.values();
        String[] stringValues = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            stringValues[i] = values[i].name();
        }
        System.out.print("당신의 등급을 입력하세요[" + String.join(", ", stringValues) + "]: ");

        String inputGrade = sc.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(inputGrade);
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");

        printMenu(authGrade);
    }

    private static void printMenu(AuthGrade authGrade) {
        System.out.println("==메뉴 목록==");

        if (authGrade.getLevel() > 0) {
            System.out.println("- 메인 화면");
        }

        if (authGrade.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }

        if (authGrade.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }

    }
}
