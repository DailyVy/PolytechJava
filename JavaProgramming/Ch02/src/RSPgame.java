import java.util.Scanner;

public class RSPgame {
    // todo : 예외처리 좀 더 깔끔하게 하기

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.print("철수 >> ");
        String cheolsu = scanner.next();
        System.out.print("영희 >> ");
        String yeonghee = scanner.next();

        if (cheolsu.equals("가위")) {
            if (yeonghee.equals("바위")) {
                System.out.println("영희가 이겼습니다.");
            }
            else if (yeonghee.equals("보")) {
                System.out.println("철수가 이겼습니다.");
            }
            else if (yeonghee.equals("가위")){
                System.out.println("비겼습니다.");
            }
            else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        else if (cheolsu.equals("바위")) {
            if (yeonghee.equals("보")) {
                System.out.println("영희가 이겼습니다.");
            }
            else if (yeonghee.equals("가위")) {
                System.out.println("철수가 이겼습니다.");
            }
            else if (yeonghee.equals("바위")) {
                System.out.println("비겼습니다.");
            }
            else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        else if (cheolsu.equals("보")) {
            if (yeonghee.equals("가위")) {
                System.out.println("영희가 이겼습니다.");
            }
            else if (yeonghee.equals("바위")) {
                System.out.println("철수가 이겼습니다.");
            }
            else if (yeonghee.equals("보")){
                System.out.println("비겼습니다.");
            }
            else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        else {
            System.out.println("잘못된 입력입니다.");
        }
        scanner.close();
    }
}
