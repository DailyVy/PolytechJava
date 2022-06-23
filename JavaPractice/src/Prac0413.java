import java.util.Scanner;

public class Prac0413 {
    public static void main(String[] args) {

        int num1, num2, num3, num4, num5, num6;

        Scanner scanner = new Scanner(System.in);

        // num1, num2 는 입력받는 숫자
        do {
            num1 = scanner.nextInt();
        } while (num1 < 100 || num1 > 999);

        do {
            num2 = scanner.nextInt();
        } while (num2 < 100 || num2 > 999);

        // num3 은 num1 * num2의 1의 자리 수
        num3 = num1 * (num2 - ((num2 / 10) * 10));
        System.out.println(num3);
        // num4 는 num1 * num2 의 10의 자리 수
        int temp2, temp100;
        temp100 = num2 / 100 * 100; // num2의 100의 자리, 472 라면 400
        temp2 = (num2 - temp100) / 10; // 472 - 400, 72만 남는다. 거기에서 10으로 나눠주면 10의자리 수 등장
        num4 = num1 * temp2;
        System.out.println(num4);
        // num 5 는 num1 * num2 의 100의 자리 수
        num5 = num1 * (num2 / 100);
        System.out.println(num5);
        // num 6 은 num1 * num2
        num6 = num1 * num2;
        System.out.println(num6);
    }
}
