import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int []intArray = new int[10]; // 양의 정수 10개를 입력받을 배열 생성

        Scanner scanner = new Scanner(System.in);
        System.out.print("양의 정수 10개를 입력하시오>>");
        // 이제 정수를 받아서 배열에 입력해봅시다.
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            if (intArray[i] <= 0) { // 만약 받은 수가 음수라면 다시 반복문으로~
                System.out.print("음수를 입력함, 다른 숫자 입력하세요");
                i--;
            }
        }
        System.out.print("3의 배수는 ");
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 3 == 0) {
                System.out.print(intArray[i] + " ");
            }
        }
        scanner.close();
    }
}
