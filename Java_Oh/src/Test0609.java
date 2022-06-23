// 코드를 짠 순간 정수, 실수, 문자 등 결정이 난다.
// qna 만약 코드 짤 때 모른다면..?
//  어떨 떄는 정수, 어떨 때는 실수 ... 이럴 땐 어쩔거..? 모든 경우의 수를 다 기술해줘야지?
//  그런데 제네릭은 코드 짤 때 결정하지 말고 실행할 때 결정한다는 것
class OBJ1<T> { // 제네릭 O
    // T의 자료형을 코드를 짤 때 내리지말고 실행할 때 결정하라
    T val;
    void set(T t) {
        val = t;
    }
    T get() {
        return val;
    }
    OBJ1() {}

    OBJ1(T t) {
        this.val = t;
    }
}
class OBJ { // 제네릭 X
    int a; // 정수 저장
    float b; // 실수 저장
    char c;
    String d;
    double e;
}

public class Test0609 {
    public static void main(String[] args) {
        OBJ obj = new OBJ();
        obj.a = 10;
        obj.b = 5.0f;
        obj.c = 'c';

        // 제네릭을 이용한 경우
        OBJ1<String> obj1 = new OBJ1<String>("Hello, World!"); // 객체를 형성하는 지점에서 자료형을 결정
//        obj1.set("Hello world!");
        System.out.println(obj1.get());

        OBJ1<Integer> obj2 = new OBJ1<Integer>(20);
//        obj2.set(20);
        System.out.println(obj2.get());

        OBJ1<Float> obj3 = new OBJ1<>(5.0f);
//        obj3.set(5.0f);
        System.out.println(obj3.get());
    }
}
