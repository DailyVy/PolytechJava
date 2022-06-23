import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력>> ");
        double o1 = scanner.nextDouble();
        double o2 = scanner.nextDouble();
        double r = scanner.nextDouble();

        System.out.print("점 입력>> ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // 원의 방정식 이용
        boolean result = (Math.pow(x - o1, 2) + Math.pow(y - o2, 2)) < Math.pow(r, 2);

        if (result) {
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다.");
        }
        else {
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 없다.");
        }

    }
}
