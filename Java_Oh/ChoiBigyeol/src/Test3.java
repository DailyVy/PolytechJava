import java.util.Scanner;

public class Test3 {
    static double bmi(double height, double weight) {
        double mHeight = height / 100;
        double result = weight / Math.pow(mHeight, 2);
        return Math.round(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yesNo = null;

        while(true) {
            System.out.print("키를 입력하세요.");
            double height = scanner.nextDouble();
            System.out.print("몸무게를 입력하세요.");
            double weight = scanner.nextDouble();

            double bmiVal = bmi(height, weight);

            if (bmiVal < 18.5) System.out.println("BMI: " + bmiVal + ", 마른 체형");
            else if (bmiVal < 25.0) System.out.println("BMI: " + bmiVal + ", 표준 체형");
            else if (bmiVal < 30.0) System.out.println("BMI: " + bmiVal + ", 일반 비만");
            else System.out.println("BMI: " + bmiVal + ", 고도 비만");

            while (true) {
                System.out.print("계속하시겠습니까?(y/n)");
                yesNo = scanner.next();
                if (yesNo.equals("y")) break;
                else if(yesNo.equals("n")) break;
            }
            if (yesNo.equals("n")) break;
        }
        scanner.close();
    }
}
