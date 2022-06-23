import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score;
        while(true) {
            System.out.print("점수를 입력하세요.");
            try {
                score = scanner.nextInt();
                if(score >= 0 && score <= 100) break;
            }
            catch (InputMismatchException e) {
                System.out.println("점수는 정수로 입력하세요.");
                scanner.nextLine();
            }
        }

        if (score >= 90) System.out.println("A학점");
        else if (score >= 80) System.out.println("B학점");
        else if (score >= 70) System.out.println("C학점");
        else if (score >= 60) System.out.println("D학점");
        else System.out.println("F학점");

        scanner.close();
    }
}
