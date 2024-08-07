package enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 외부에서 임의로 인스턴스를 생성할 수 있다는 문제가 있다.
/*         ClassGrade newClassGrade = new ClassGrade(); // 생성자를 private으로 막아야 함.

        int result = discountService.discount(newClassGrade, price);
        System.out.println("newClassGrade 등급의 할인 금액: " + result);
*/
    }
}
