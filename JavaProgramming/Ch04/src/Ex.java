class StaticSample {
    public int n;
    public void g(){
        m = 20;
    }
    public void h() {
        m = 30;
    }
    public static int m;
    public static void f(){
        m = 5;
    }
}

public class Ex {
    public static void main(String[] args) {
        StaticSample s1, s2;
        s1 = new StaticSample();
        s1.n = 5;
        s1.g(); // m = 20
        s1.m = 50; // m = 50

        s2 = new StaticSample();
        s2.n = 8;
        s2.h(); // m = 30
        s2.f(); // m = 5

        System.out.println(s1.m); // 5

        StaticSample.m = 10; // m = 10 ==> m 은 static 이라 클래스명.m 이 가능
        // 마찬가지로 f()도 static이라 클래스명.m이 가능

        System.out.println(StaticSample.m); // 10
        StaticSample.f(); // m = 5
        System.out.println(StaticSample.m); // 5
    }
}
