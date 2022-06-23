import java.nio.DoubleBuffer;
import java.util.Scanner;

public class Practice0424 {
    public static void main(String[] args) {

        /*System.out.println("Hello, World!");

        System.out.println("byte의 크기: " + Byte.SIZE);
        System.out.println("char의 크기: " + Character.SIZE);
        System.out.println("int의 크기: " + Integer.SIZE);
        System.out.println("long의 크기: " + Long.SIZE);
        System.out.println("short의 크기: " + Short.SIZE);
        System.out.println("float의 크기: " + Float.SIZE);
        System.out.println("double의 크기: " + Double.SIZE);
        */

        /*char test = 'A';

        System.out.printf("test 변수의 캐릭터 값은 %c이다. \n", test);
        System.out.printf("test 변수의 10진수 값은 %d이다. \n", (int)test);
        System.out.printf("test 변수의 16진수 값은 %x이다. \n", (int)test);

        test = 66;
        System.out.printf("test 변수의 캐릭터 값은 %c이다. \n", test);
        System.out.printf("test 변수의 16진수 값은 0x%x이다.\n", (int)test);
        */

        //성적 구간에 따라 학점을 출력하는 코다
        /*Scanner scanner = new Scanner(System.in);

        int score;

        do {
            System.out.print("성적을 입력하세요>> ");
            score = scanner.nextInt();
        } while (score < 0 || score > 100);

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
        }*/

        // F 학점부터 우선 결정
        /*Scanner scanner = new Scanner(System.in);

        int score;

        do {
            System.out.print("성적을 입력하세요>> ");
            score = scanner.nextInt();
        } while (score < 0 || score > 100);

        if (score < 60) {
            System.out.println("F");
        }
        else if (score < 70) {
            System.out.println("D");
        }
        else if (score < 80) {
            System.out.println("C");
        }
        else if (score < 90) {
            System.out.println("B");
        }
        else {
            System.out.println("A");
        }*/

        /*Scanner scanner = new Scanner(System.in);
        int num;

        do {
            num = scanner.nextInt();
        } while(num < 1 || num > 9);

        for (int i=0; i < 10; ++i) {
            System.out.printf(num + " * " + i + " = " + num * i + "\n");
        }*/

        /*Scanner scanner = new Scanner(System.in);
        int testCase;
        int a, b;

        testCase = scanner.nextInt();

        int []result = new int[testCase];

        for(int i=0; i < testCase; ++i) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            result[i] = a + b;
        }

        for (int i=0; i < testCase; ++i) {
            System.out.println(result[i]);
        }

        scanner.close();
        */

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);

        scanner.close();

    }

}
