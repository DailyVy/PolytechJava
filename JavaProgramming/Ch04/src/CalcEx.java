import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

class Calc {
    public static int abs(int a) {
//        if (a >= 0) return a;
//        else return -a;
        return a > 0? a:-a;
    }
    public static int max(int a, int b) {
//        if (a >= b) return a;
//        else return b;
        return a>b? a:b;
    }
    public static int min(int a, int b) {
//        if (a < b) return a;
//        else return b;
        return a>b? b:a;
    }
}

public class CalcEx {
    public static void main(String[] args) {
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10,8));
        System.out.println(Calc.min(-3, 8));
    }
}
