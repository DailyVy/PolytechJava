import java.util.InputMismatchException;
import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        // 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하라
        // 사용자가 정수가 아닌 문자를 입력할 때 발생하는 InputMismatchException 예외를 처리하여 다시 입력받도록 하라
        Scanner scanner = new Scanner(System.in);

        // 내가 작성 : while문으로 정수가 아닌게 들어오면 처음부터 작성
        /*System.out.println("정수 3개를 입력하세요");
        int zero, first, second;
        while(true) {
            try {
                System.out.print("0>>");
                zero = scanner.nextInt();
                System.out.print("1>>");
                first = scanner.nextInt();
                System.out.print("2>>");
                second = scanner.nextInt();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                scanner.nextLine();
            }
        }
        int sum = zero + first + second;
        System.out.println("합은 " + sum);*/

        // 책은 처음부터 입력이 아닌 정수가 아닌부분부터 입력하게 했다.
        System.out.println("정수 3개를 입력하세요.");
        int sum = 0, n = 0;
        for (int i = 0; i < 3; ++i) {
            System.out.print(i + ">>");
            try {
                n = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                scanner.nextLine();
                i--;
                continue;
            }
            sum += n;
        }
        System.out.println("합은 " + sum);
        scanner.close();
    }
}
