import java.util.Scanner;

public class Exercise12 {
    public static double calcIf(double x, String operator, double y) {
        if (operator.equals("+")) {
            return x + y;
        }
        else if (operator.equals("-")) {
            return x - y;
        }
        else if (operator.equals("*")) {
            return x * y;
        }
        else if (operator.equals("/")) {
            if (y == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            else {
                return x / y;
            }
        }
        else {
            System.out.println("연산자 입력오류");
            return 0;
        }
    }
    public static double calcSwitch(double x, String operator, double y) {

        switch (operator){
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                if (y == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                else {
                    return x / y;
                }
            default:
                System.out.println("연산자 입력오류");
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산>>");
        double x = scanner.nextDouble();
        String operator = scanner.next();
        double y = scanner.nextDouble();

        System.out.println(calcIf(x, operator, y));
        System.out.println(calcSwitch(x, operator, y));

        scanner.close();
    }
}
