import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intNum;

        do {
            System.out.print("2자리수 정수 입력(10~99)>>");
            intNum = scanner.nextInt();
        } while (intNum < 10 || intNum > 99);

        int units = intNum % 10;
        int tens = intNum / 10;

        if (units == tens) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }
        else {
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
        }
        scanner.close();
    }
}
