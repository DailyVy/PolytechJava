import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        // 양수 5개를 입력받아 배열에 저장, 제일 큰 수를 출력하는 프로그램
        int []intArray = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("양수 5개를 입력하세요.");

        // 양수 5개를 입력받아 배열에 저장
        // todo. 양수만 받을 수 있도록 할 것
        /*for (int i = 0; i < intArray.length ; i++) {
            intArray[i] = scanner.nextInt();
        }*/
        // 제일 큰 수 찾기
        /*int max = 0;
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] > max) {
                max = intArray[i];
            }
        }*/

        // for문 하나로 표현하기
        int max = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");
        scanner.close();

    }
}
