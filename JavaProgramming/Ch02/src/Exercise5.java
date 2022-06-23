import java.util.Scanner;

public class Exercise5 {

    void triangle(int a, int b, int c) {
        // 일단 max값을 찾자
        int max = 0, len1 = 0, len2 =0;

        if (a >= b && a >= c) {
            max = a;
            len1 = b;
            len2 = c;
        }
        else if (b >= a && b >= c) {
            max = b;
            len1 = a;
            len2 = c;
        }
        else {
            max = c;
            len1 = a;
            len2 = b;
        }

        if (len1 + len2 > max) {
            System.out.println("삼각형이 됩니다.");
        }
        else {
            System.out.println("삼각형이 될 수 없습니다.");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // todo : 원래는 a, b, c 가 정수가 아닐 때도 생각해야해...
        System.out.print("정수 3개를 입력하시오>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        Exercise5 test = new Exercise5();
        test.triangle(a, b, c);
        scanner.close();
    }
}
