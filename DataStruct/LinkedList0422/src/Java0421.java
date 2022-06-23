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

    void intro() {
        System.out.println(name + "의 나이는 " + age);
    }
}

public class Java0421 {
    public static void main(String[] args) {
        Human obj1 = new Human(20, "홍길동");
        Human obj2 = new Human(50, "강호동");
        Human obj3 = new Human(33, "최비결");
        Human obj4 = new Human(40, "강현우");


//        System.out.println(obj3.name + "의 나이는 " + obj3.age);

        MyLinkedList<Human> humanList = new MyLinkedList<>();

        humanList.add(obj1);
        humanList.add(obj2);
        humanList.add(0, obj3);
        humanList.add(2, obj4);
        humanList.remove(3);
        humanList.remove(0);

        System.out.println(humanList.length());

        for (int i = 0; i < humanList.length(); ++i) {
            humanList.get(i).intro();
        }

    }
}
