package SampleAccessEx;

class Sample {
    public int a; // 모든 클래스
    private int b; // 동일 클래스
    int c; // 디폴트, 동일 패키지 내
    protected int d; // 동일패키지와 자식클래스
}

public class AccessEx extends Sample{
    static int num = 10;
    static int num2 = 20;

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.a = 10;
//        sample.b = 10; // b는 private이므로 같은 클래스 내에서만 접근 가능하다.
        sample.c = 10;
        sample.d = 10;
    }
}
