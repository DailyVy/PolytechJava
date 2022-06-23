import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        // qna : if문으로 어떻게 해야하는가
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오>>");
        int price = scanner.nextInt();

        int money50000 = price / 50000;
        price = price - (50000 * money50000);
        int money10000 = price/ 10000;
        price = price - (10000 * money10000);
        int money1000 = price / 1000;
        price = price - (1000 * money1000);
        int money500 = price / 500;
        price = price - (500 * money500);
        int money100 = price / 100;
        price = price - (100 * money100);
        int money50 = price / 50;
        price = price - (50 * money50);
        int money10 = price / 10;
        price = price - (10 * money10);
        int money1 = price;

        System.out.println(
                "오만원권" + money50000 + "매\n"
                + "만원권" + money10000 + "매\n"
                + "천원권" + money1000 + "매\n"
                + "백원" + money100 + "개\n"
                + "오십원" + money50 + "개\n"
                + "십원" + money10 + "개\n"
                + "일원" + money1 + "개"
        );
        scanner.close();

    }
}
