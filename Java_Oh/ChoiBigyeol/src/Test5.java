import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
    static double listAverage(ArrayList<Integer> a) {
        int sum = 0;
        for (int i = 0; i < a.size(); ++i) {
            sum += a.get(i);
        }
        return (double) sum / a.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> scoreList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("점수를 입력하세요.");
            int score = scanner.nextInt();
            scoreList.add(score);
            String yesNo;
            while (true) {
                System.out.print("계속하시겠습니까?(y/n)");
                yesNo = scanner.next();
                if (yesNo.equals("y")) break;
                else if(yesNo.equals("n")) break;
            }
            if (yesNo.equals("n")) break;
        }

        System.out.println("입력된 점수의 평균 " + listAverage(scoreList) );

        scanner.close();
    }
}
