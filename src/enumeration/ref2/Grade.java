package enumeration.ref2;

public enum Grade {
    // 상수에 괄호 열고 생성자 호출 가능하다.
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
