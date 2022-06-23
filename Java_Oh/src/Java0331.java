import java.util.Scanner;

public class Java0331 {
    public static void main(String[] args) {
/*        char grade;
        int score;
        Scanner scanner = new Scanner(System.in);

        // 점수가 1~100점만 입력받을 수 있도록, 잘 못 입력하면 계속 반복
        do {
            System.out.print("Write your score(0~100): ");
            score = scanner.nextInt();
        } while (score > 100 || score < 0);


        // if문 으로 작성하기
        *//*if (score >= 90) {
            grade = 'A';
        }
        else if (score >= 80) {
            grade = 'B';
        }
        else if (score >= 70) {
            grade = 'C';
        }
        else if (score >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }*//*

        // switch 문으로 작성하기
        switch (score/10)
        {
            case 10: // score 는 100
            case 9: // score는 90~99
                grade = 'A';
                break;
            case 8: // score는 80~89
                grade = 'B';
                break;
            case 7: // score는 70~79
                grade = 'C';
                break;
            case 6: // score는 60~69
                grade = 'D';
                break;
            default: // score는 60 미만
                grade = 'F';
        }

        System.out.println("Grade is " + grade);
        scanner.close(); // scanner 객체 닫기*/

/*
        //for문
        int i;
        for(i = 4; i >= 0; i--)
        {
            System.out.println(i);
        }
        System.out.println(i);
        // for문의 후처리식은 증감식만 넣는 거 아니다
        for(int j = 0; j < 5; System.out.println(j)){
            j++;
        }
        // 후처리식 안에는 여러 문장을 넣어도 된다.
        // 이걸 사용하면 구구단 출력시 2중 for문 말고 for문 하나로 출력할 수 있다.
        for(int k = 0; k < 5; System.out.println(k), System.out.println("Java")){
            k++;
        }
*/

       /* int sum = 0;
        for (int m = 0; m < 101; m++)
        {
            sum += m;
        }
        System.out.println(sum);*/


        int count = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요. ");

        int n = scanner.nextInt();

        while (n != -1)
        {
            sum += n;
            count++;
            n = scanner.nextInt();
        }
        if (count==0)
        {
            System.out.println("입력된 수가 없습니다.");
        }
        else
        {
            System.out.println("정수의 개수는 " + count + "개이며");
            System.out.println("평균은 " + (double)sum/count +"입니다.");
        }
        scanner.close();

    }
}
