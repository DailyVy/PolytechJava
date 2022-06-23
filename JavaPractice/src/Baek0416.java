import java.util.Scanner;

public class Baek0416 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int score;

        do {
            score = scanner.nextInt();
        } while (score < 0 || score > 100) ;

        if (score >= 90) {
            System.out.println("A");
        }
        else if (score >= 80) {
            System.out.println("B");
        }
        else if (score >= 70) {
            System.out.println("C");
        }
        else if (score >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
