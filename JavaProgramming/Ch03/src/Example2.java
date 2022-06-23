import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        // -1이 입력될 때까지 입력된 수의 평균 구하기, while
        int sum = 0;
        int cnt = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");

        while(true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;
            cnt++;
        }

        // todo. -1만 넣었을 경우의 예외처리
        if (cnt == 0) {
            System.out.println("아무 것도 입력하지 않았습니다.");
        }
        else {
            System.out.println("정수의 개수는 " + cnt + "개이며 평균은 " + (double)sum/cnt + "입니다.");
        }
        scanner.close();
    }
}
