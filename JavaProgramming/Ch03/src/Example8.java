import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        // length 필드를 이용하여 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램 작성하기
        // 5개의 정수를 입력하세요/
        Scanner scanner = new Scanner(System.in);

        int []intArray = new int[5]; // 배열 레퍼런스 변수 선언
        int sum = 0; // 평균을 구하기 위한 합계

        System.out.print("5개의 정수를 입력하세요>> ");
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            sum += intArray[i];
        }
        System.out.println("평균은 " + (double)sum/ intArray.length);
        scanner.close();
    }
}
