import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요>>");
        int num = scanner.nextInt();
        for(int i = num; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
