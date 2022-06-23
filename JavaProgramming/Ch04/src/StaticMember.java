import java.util.Scanner;
 class CurrencyConverter{
    private static double rate; // 1$에 대한 원화
    public static double toDollar(double won){ // static 메서드
        return won/rate; // 원화를 달러로 변환
    }
    public static double toKWR(double dollar){
        return dollar*rate;
    }
    public static void setRate(double r){
        rate = r;
    }
}
public class StaticMember {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("환율(1달러)>> ");
        double rate = scanner.nextDouble();
        CurrencyConverter.setRate(rate);
        System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
        System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "입니다.");
        scanner.close();
    }
}
