import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Scanner에서 문자를 바로 입력받는 기능은 없다고 한다.
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String temp = scanner.next(); // 문자열로 입력받은 뒤
        char alphabet = temp.charAt(0); // 첫번째 문자를 꺼내오기

//        System.out.println(alphabet + " " + (int)alphabet); // a 97

        for(int i = alphabet; i >= 97; i--) { // 마지막이 a일 때가지
            for(int j = 97; j<=i; j++) { // a부터 출력하도록
                System.out.print((char)j);
            }
            System.out.println();
        }

        scanner.close();
    }
}
