import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10}; // 환산할 돈의 종류
        String [] money = {"오만원권", "만원권", "천원권", "오백원", "백원", "오십원", "십원"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int price = scanner.nextInt();

        for (int i = 0; i<unit.length; i++) {
            int cnt = price/unit[i];
            if (cnt == 0) continue;
            if (i < 3) {
                System.out.println(money[i]+ " " + cnt + "매");
            }
            else {
                System.out.println(money[i]+ " " + cnt + "개");
            }
            price %= unit[i];
        }
        scanner.close();
    }
}
