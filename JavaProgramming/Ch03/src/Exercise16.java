import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        String str[] = {"가위", "바위", "보"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        System.out.print("가위 바위 보!>>");
        String userVal = scanner.nextLine();
        int n = (int)(Math.random()*3); // n은 0, 1, 2중에서 랜덤하게 결정

        while(!userVal.equals("그만")) {
            if(str[n].equals("바위")) {
                if(userVal.equals("바위")){
                    System.out.println("사용자 = " + userVal + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
                }
                else if(userVal.equals("가위")) {
                    System.out.println("사용자 = " + userVal + ", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
                }
                else if(userVal.equals("보")){
                    System.out.println("사용자 = " + userVal + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
                }
                else{
                    System.out.println("잘못입력");
                    scanner.nextLine();
                }
            }
            else if(str[n].equals("가위")) {
                if(userVal.equals("가위")){
                    System.out.println("사용자 = " + userVal + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
                }
                else if(userVal.equals("바위")) {
                    System.out.println("사용자 = " + userVal + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
                }
                else if(userVal.equals("보")){
                    System.out.println("사용자 = " + userVal + ", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
                }
                else{
                    System.out.println("잘못입력");
                    scanner.nextLine();
                }
            }
            else { // str[n].equals("보") 일 때
                if(userVal.equals("보")){
                    System.out.println("사용자 = " + userVal + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
                }
                else if(userVal.equals("가위")) {
                    System.out.println("사용자 = " + userVal + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
                }
                else if(userVal.equals("바위")){
                    System.out.println("사용자 = " + userVal + ", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
                }
                else{
                    System.out.println("잘못입력");
                    scanner.nextLine();
                }
            }
            n = (int)(Math.random()*3);
            System.out.print("가위 바위 보!>>");
            userVal = scanner.nextLine();
        }
        System.out.println("게임을 종료합니다...");
    }
}
