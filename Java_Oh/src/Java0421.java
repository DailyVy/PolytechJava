class Human {
    int age;
    String name;

    // 기본 생성자
    Human() {}
    // 메소드 오버로딩
    Human(int age, String name) {
        this.age = age; // 속성에 해당하는 것을 지칭할 때는 this!
        this.name = name;
    }
}

public class Java0421 {
    public static void main(String[] args) {
        Human obj1 = new Human();
        Human obj2 = new Human();
        Human obj3 = new Human(33, "최비결");

        obj1.age = 20;
        obj1.name = "홍길동";

        obj2.age = 50;
        obj2.name = "강호동";

        System.out.println(obj3.name + "의 나이는 " + obj3.age);
    }

}
