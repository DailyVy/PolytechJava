import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dividend;
        int divisor;

        // todo : while 문 사용하기 => 0으로 나누면 다시 입력받도록
        while (true) {
            System.out.print("나뉨수를 입력하시오:");
            dividend = scanner.nextInt();
            System.out.print("나눗수를 입력하시오:");
            divisor = scanner.nextInt();
            try {
                System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
                break;
            }
            catch (ArithmeticException e) {
                System.out.println(divisor + "으로 나눌 수 없습니다! 다시 입력하세요!");
            }
        }
        scanner.close();
    }
}
