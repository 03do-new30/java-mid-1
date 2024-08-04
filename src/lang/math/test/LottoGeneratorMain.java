package lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNumbers = lottoGenerator.generate();
        System.out.print("로또 번호: ");
        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                System.out.println(lottoNumbers[i]);
            } else {
                System.out.print(lottoNumbers[i] + " ");
            }
        }
    }
}
