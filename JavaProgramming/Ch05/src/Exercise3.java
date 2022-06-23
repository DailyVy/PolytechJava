import java.util.Scanner;

abstract class Converter {
    abstract protected double convert(double src); // 추상메서드
    abstract protected String getScrString(); // 추상메서드
    abstract protected String getDestString(); // 추상메서드
    protected double ratio; // 비율

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(getScrString() + "을 " + getDestString() + "로 바꿉니다.");
        System.out.print(getDestString() + "을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환결과 " + res + getDestString() + "입니다.");
        scanner.close();
    }
}
class Won2Dollar extends Converter {

    Won2Dollar(double ratio) {
        this.ratio = ratio;
    }

    @Override
    protected double convert(double src) {
        return src / ratio;
    }

    @Override
    protected String getScrString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }
}

class Km2Mile extends Converter {

    Km2Mile(double ratio) {
        this.ratio = ratio;
    }

    @Override
    protected double convert(double src) {
        return src / ratio;
    }

    @Override
    protected String getScrString() {
        return "km";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }
}
public class Exercise3 {
    public static void main(String[] args) {
//        Won2Dollar toDollar = new Won2Dollar(1200);
//        toDollar.run();

        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}
