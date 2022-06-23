import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류

        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int price = scanner.nextInt();

        for (int i = 0; i<unit.length; i++) {
            int cnt = price/unit[i];
            if (cnt == 0) continue;
            System.out.println(unit[i]+ "원 짜리 : " + cnt + "개");
            price %= unit[i];
        }
        scanner.close();
    }
}
