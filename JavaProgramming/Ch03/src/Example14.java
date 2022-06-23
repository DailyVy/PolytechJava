import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        // 예외 처리 (exception)
        // try - catch - finally

        Scanner scanner = new Scanner(System.in);
        int dividend; // 나뉨수
        int divisor; // 나눗수 ==> 이게 0이면 에러 발생하겠지 모 ArithmeticException: / by zero

        System.out.print("나눔수를 입력하시오: ");
        dividend = scanner.nextInt();
        System.out.print("나눗수를 입력하시오: ");
        divisor = scanner.nextInt();
        try{
            System.out.println(dividend+"를 " + divisor + "로 나누면 몫은 "
                    + dividend/divisor + "입니다.");
        }
        catch (ArithmeticException e) { // 객체 e에 예외 정보가 넘어옴
            System.out.println("0으로 나눌 수 없습니다.");
        }
        finally { // finally 는 무조건 실행
            System.out.println("이 문장은 예외발생 유무에 관계없이 실행됩니다.");
        }
        scanner.close();

    }
}
