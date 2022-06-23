import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 ~ 99 사이의 정수를 입력하시오>> ");
        int number = scanner.nextInt();

        int tens = number / 10;
        int units = number % 10;
        int cnt = 0;

        if (tens != 0 && (tens % 3 == 0)) {
            cnt++;
        }
        if (units != 0 && (units % 3 == 0)) {
            cnt++;
        }

        if (cnt == 0) {
            System.out.println("박수 No");
        }
        else if (cnt == 1) {
            System.out.println("박수짝");
        }
        else {
            System.out.println("박수짝짝");
        }
        scanner.close();
    }
}
