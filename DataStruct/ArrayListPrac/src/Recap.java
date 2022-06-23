import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;

enum Gender {male, female};
enum Etype {Singer, Athlete, Manager}

class Person {
    String name;
    int age;
    Gender gender;

    Person() {}

    Person(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void showInfo(){
        System.out.println("이름은 " + this.name + "이고, 나이는 "
                + this.age + "살, 성별은 " + this.gender + "이다." );
    }
}

// Person을 상속한 Employee 클래스
class Employee extends Person {
    int salary;
    // 생성자 구현

    Employee() {}

    Employee(String name, int age, Gender gender, int salary) {
        super(name, age, gender); // 자식 클래스에서 부모 클래스 개체를 가져오는데 사용하는 참조 변수
        this.salary = salary;
    }
    //메소드 오버라이딩
    void showInfo(){
//        super.showInfo(); // 상위 클래스의 method 사용 가능
        System.out.printf("[%s] %d세, %s : [%d]\n", this.name, this.age, this.gender, this.salary);
    }
    // Employee 만의 메소드
    void doWork() {
        System.out.println(name + " is working hard now!");
    }
}

class Singer extends Employee {
    Etype type;

    Singer(String name, int age, Gender gender, int salary) {
        super(name, age, gender, salary);
        type = Etype.Singer;
    }

    void doWork(){
        System.out.println(name + "은/는 노래를 합니다");    }
}

class Athlete extends Employee {
    Etype type;

    Athlete(String name, int age, Gender gender, int salary) {
        super(name, age, gender, salary);
        type = Etype.Athlete;
    }

    void doWork(){
        System.out.println(name + "은/는 운동을 합니다");
    }
}

class Manager extends Employee {
    Etype type;

    Manager(String name, int age, Gender gender, int salary) {
        super(name, age, gender, salary);
        type = Etype.Manager;
    }

    void doWork(){
        System.out.println(name + "은/는 스케쥴 관리를 합니다");
    }
}

class Boss extends Person {
    int MAX_EMPLOY = 3; // 최대 고용인원 수
    int n_curEmploy = 0; // 현재 고용인원 수
    Employee[] employees = new Employee[MAX_EMPLOY]; // Employee 객체를 저장할 배열 employees, 마치 int[] intArray처럼~ 타입이 Employee임

    Boss() {
        this.name = "Choi Bigyeol";
        this.age = 33;
        this.gender = Gender.female;
    }

    void hire(Employee e) {
        if (n_curEmploy < MAX_EMPLOY) {
            employees[n_curEmploy] = e;
            ++n_curEmploy;
        }
        else {
            System.out.println("We cannot hire anymore!");
        }
    }

    void makeWorkE() {
        for(int i=0; i<n_curEmploy; i++) {
            employees[i].showInfo();
            employees[i].doWork();
        }
    }
}

public class Recap {
    public static void main(String[] args) {
        /*Person p = new Person("Kim yuna", 33, Gender.female);
        p.showInfo();

        Employee e = new Employee("IU", 30, Gender.female, 4000);
        e.showInfo();
        e.doWork();*/

        Singer s = new Singer("BoA", 37, Gender.female, 4000);
        Athlete a = new Athlete("김희진", 32, Gender.female, 5000);
        Manager m = new Manager("김동현", 27, Gender.male, 2000);

        Boss b = new Boss();

        // 이제 Employee를 고용해보자
        b.hire(s);
        b.hire(a);
        b.hire(m);

        // Employee들이 일하는 지 봅시다.
//        b.makeWorkE(); // 다형성(Polymorphism) : 같은 모양의 코드가 다른 동작을 하는 것
        // => 동적 바인딩때문에 가능 : 코드가 실행되는 시점에 바인딩이 일어남, 컴파일 때는 모른다~

        // 추가 고용을 해보자~ MAX_EMPLOY = 3; 상태
        Singer s2 = new Singer("태연", 34, Gender.female, 3500);
        Athlete a2 = new Athlete("민병헌", 37, Gender.male, 2500);
        Manager m2 = new Manager("곽민정", 30, Gender.female, 2300);

//        b.hire(s2); // We cannot hire anymore!
//        b.hire(a2); // We cannot hire anymore!

//        System.out.println("\n================Linear List==============\n");
        // 선형리스트를 이용해보자. 자바에서의 선형리스트는 ArrayList
        /*ArrayList aList = new ArrayList(); // ArrayList에 타입을 명시 안해줬으므로 객체로 인식
        aList.add(s);
        aList.add(a);
        aList.add(m);
        aList.add(1, s2);

//        for (int i=0; i < aList.size(); i++) {
//            System.out.println(aList.get(i).getClass());
//            // System.out.println(aList.get(i).name);
//            // aList의 타입을 명시하지 않았으므로 s, a, m 은 객체로 인식! 따라서 클래스의 메서드를 사용할 수 없다.
//        }
        // for each문으로 위와 똑같은 코드를 작성해보자
        for(Object o:aList) {
            System.out.println(o.getClass());
        }

        // Employee 타입 명시한 ArrayList
        ArrayList<Employee> AElist = new ArrayList<>();
        AElist.add(s);
        AElist.add(a);
        AElist.add(m);
        AElist.add(1, s2);

        AElist.remove(0);

//        for(int i=0; i<AElist.size(); i++) {
//            System.out.println(AElist.get(i).name);
//            System.out.println(AElist.get(i).getClass());
//        }
        // for each 문 사용
        for(Employee e:AElist){
            e.showInfo();
            e.doWork();
        }
*/
//        System.out.println("\n================연결리스트==============\n");
        // 연결리스트를 사용해보자
        // ArrayList와 LinkedList는 List를 상속받았기 때문에
        // ArrayList처럼 LinkedList도 add존재
        // 그러나 메소드 오버라이딩되어 있어 ArrayList랑 다르게 동작
        /*LinkedList<Employee> list = new LinkedList<>(); // type을 명시하지 않음 ==> Object 타입

        list.add(s);
        list.add(a);
        list.add(m);
        list.addFirst(s2); // addFirst하면 가장 앞에 삽입 가능!!
        list.add(2, a2);
        list.add(4, m2);

        list.removeFirst();
        list.removeLast();
        list.remove(1);
        list.remove(); // 0번째 인덱스 제거

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i).name);
            list.get(i).showInfo();
        }
        for(Employee e2 : list) {
            e2.doWork();
        }

        LinkedList olist = new LinkedList();
        olist.add(s2);
        olist.add(a2);
        olist.add(m2);

        for(Object o: olist) {
            System.out.println(o.getClass());
        }*/


        // 자바의 선형리스트말고 직접 MyArrayList를 구현하여 선형리스트처럼 사용해보자
        MyArrayList<Employee> myList = new MyArrayList<>();

        myList.add(s);
        myList.add(a);
        myList.add(m);
        myList.add(1, s2);
        myList.add(3, a2);
        myList.add(m2);

        myList.remove(5);
        myList.remove(3);
        myList.remove(0);

        myList.clear();

        System.out.println(myList.size());

        for(int i=0; i < myList.size(); ++i) {
            myList.get(i).showInfo();
        }
    }
}
