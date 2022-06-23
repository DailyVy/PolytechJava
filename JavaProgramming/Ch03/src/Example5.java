import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        // continue, break문
        // 5개의 정수를 입력받고 그 중 양수들만 합하여 출력하는 프로그램

        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요");

        for(int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            if (number <= 0) {
                continue;
            }
            else{
                sum += number;
            }
        }
        System.out.println("양수의 합은 " + sum);

        scanner.close();
    }
}
