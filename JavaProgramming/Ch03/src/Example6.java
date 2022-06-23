import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        // exit를 입력하면 while 문을 벗어나는 break문 만들기

        Scanner scanner = new Scanner(System.in);
        System.out.println("exit를 입력하면 종료합니다.");
        while(true) {
            System.out.print(">>");
            String sth = scanner.nextLine();
            if(sth.equals("exit")) {
                break;
            }
        }
        System.out.println("종료합니다.");
        scanner.close();
    }
}
