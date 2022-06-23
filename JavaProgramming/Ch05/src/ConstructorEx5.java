class A {
    public A() {
        System.out.println("생성자 A");
    }
    public A(int x) {
        System.out.println("매개변수 생성자 A" + x);
    }
}
class B extends A{
    public B() {
        super(30);
        System.out.println("생성자 B");
    }
    public B(int x) {
        System.out.println("매개변수 생성자 B" + x);
    }
}
public class ConstructorEx5 {
    public static void main(String[] args) {
        B b;
        b = new B(); // 매개변수 생성자 A 30 \n 생성자 B
    }
}
