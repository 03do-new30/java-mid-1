package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
         Random random = new Random(); // seed를 안주면 System의 나노초 등을 섞어서 시드를 만들게 된다.
//        Random random = new Random(1); // seed가 같으면 random의 결과가 같다.

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10);// 0~9까지 출력
        System.out.println("0 ~ 9: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1; // 1~10까지 출력
        System.out.println("1 ~ 10: " + randomRange2);
    }
}
