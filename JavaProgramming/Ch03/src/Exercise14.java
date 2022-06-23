import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score [] = {95, 88, 76, 62, 55};

        Scanner scanner = new Scanner(System.in);
        System.out.print("과목 이름>>");
        String subject = scanner.nextLine();

        while(!subject.equals("그만")) {
//            int cnt = 0;
            boolean check = false;
            for(int i = 0; i<course.length; i++){
                if(course[i].equals(subject)) {
                    int n = score[i];
                    System.out.println(subject + "의 점수는 " + n + "입니다.");
//                    cnt++;
                    check = true;
                }
            }
//            if (cnt == 0)
            if (!check){
                System.out.println("없는 과목입니다.");
            }
            System.out.print("과목 이름>>");
            subject = scanner.nextLine();
        }

        scanner.close();
    }
}
