import java.util.Scanner;

public class Exercise10 {
    public static boolean circle(double x1, double y1, double r1, double x2, double y2, double r2 ) {
        if (Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)) < (r1 + r2)) {
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        // 점과 점사이의 거리가 r과의 거리보다 작으면 되잖아?
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        boolean result = circle(x1, x2, r1, x2, y2, r2);
        if (result) {
            System.out.println("두 원은 서로 겹친다.");
        }
        else {
            System.out.println("두 원은 겹치지 않는다.");
        }
    }
}
