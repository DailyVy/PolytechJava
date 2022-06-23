import java.util.Scanner;

public class PracCh03 {
    public static void main(String[] args) {

        // 예제 3-1. 1~10 합 출력 : for
        /*int sum = 0;

        for (int i = 1; i < 11 ; i++) {
            sum += i;
            System.out.print(i + "+");
        }
        System.out.print("=" + sum);*/
        // 예제 3-2. -1이 입력될 때까지 입력된 수의 평균 구하기 : while
        /*Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
        int num = scanner.nextInt();
        while (num != -1) {
            sum += num;
            count++;
            num = scanner.nextInt();
        }
        if(count == 0) {
            System.out.println("입력된 수가 없습니다.");
        }
        else {
            System.out.println("정수의 개수는 " + count + "개이며, 평균은 " + (double)sum/count + "입니다.");
        }
        scanner.close();*/
        // 예제 3-3. a 부터 z까지 출력 : do while
        /*char c = 'a';

        do{
            System.out.print(c);
            c++; // 답안에서는 c = (char) (c + 1); 이라고 썼다.
        } while(c <= 'z');*/
        // 예제 3-4. 1단~ 9단 구구단 출력 : 2중 중첩 for문
        /*for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + i*j + '\t');
            }
            System.out.println();
        }*/
        // 예제 3-5. 5개의 정수 입력받아서 양수들만 합해서 출력 : continue 이용
        /*Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요. ");
        for(int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (num <= 0){
                continue;
            }
            else {
                sum += num;
            }
        }
        System.out.println("양수의 합은 " + sum);
        scanner.close();*/
        // 예제 3-6. exit 입력하면 while문 벗어나는 break 문
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("exit를 입력하면 종료합니다.");

        while (true) {
            System.out.print(">>");
            String s = scanner.nextLine();
            if (s.equals("exit")) { // 문자열 비교 시 equals()를 사용
                break;
            }
        }
        System.out.println("종료합니다...");
        scanner.close();*/
        // checkpoint
        // 1. 2중 중첩 이용하여 for, while, do-while 각각 작성 ==> for문 하나만 썼는데..?
        /*for(int i = 5; i > 0; i--) {
            System.out.println("*".repeat(i));
        }*/
        // 3. 1부터 100가지 3의 배수의 합을 구하는 프로그램 작성
        /*int sum = 0;
        int num = 3;
        for(int i = 1; num*i <= 100; i++){
            int result = num*i;
            sum += result;
        }
        System.out.println(sum);*/

    }
}
