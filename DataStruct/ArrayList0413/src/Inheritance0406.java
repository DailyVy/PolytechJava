import java.util.ArrayList;
import java.util.LinkedList;

enum Gender {Male, Female} // enum 써먹기
enum Etype {Professor, Student, Manager} // 고용타입

class Person {
    String name;
    int age;
    Gender gender;

    Person() {
        name = "Yuna Kim";
        age = 33;
        gender = Gender.Female;
    }

    // 생성자는 리턴 타입이 없다. class 이름과 같아야 한다.
    Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void showInfo() {
        System.out.println("Hello, I am " + name + " and gender is " + gender);
    }
}

class Employee extends Person {
    // Person() 생성자 안만들어 줬더니 에러나서 class Person()내에 Person() 생성자 만들어줌

    int salary; // Person 에 없는 특징 추가

//    Employee (){ } // Prof class 에러방지 위한 기본 생성자 집어넣기

    // Employee() 생성자 만들기
    Employee(String name, int age, Gender gender, int salary){
        super(name, age, gender); // 아빠클래스 Person으로 부터 받아 초기화 가능
        this.salary = salary;
    }

    // showInfo() 메소드 오버라이딩
    void showInfo() {
//        super.showInfo(); // 아빠 클래스 접근하기 => 보여준거일 뿐 잘 안씀
        System.out.printf("[%s] %d세 %s : %d\n", name, age, gender, salary);
    }

    // Employee 만의 것 만들기 ==> 일하자(doWork)
    // 클래스는 멤버 변수와 메서드로 이루어져있음
    void doWork() {
        System.out.println(name + " is working hard");
    }
}

// Employee 상속한 Prof 클래스 만들기
class Prof extends Employee {
    Etype type;

    Prof(String name, int age, Gender gender, int salary) {
        super(name, age, gender, salary);
        type = Etype.Professor;
    }
    // 메소드 오버라이딩
    void doWork() {
        System.out.println(name + " is teaching students now");
    }
}

// Employee 상속한 Student class만들기
class Student extends Employee {
    Etype type;

    Student(String name, int age, Gender gender, int salary) {
        super(name, age, gender, salary);
        type = Etype.Student;
    }
    // 메소드 오버라이딩
    void doWork() {
        System.out.println(name + " is taught now");
    }
}
// Manager class만들기
class Manager extends Employee {
    Etype type;

    Manager(String name, int age, Gender gender, int salary) {
        super(name, age, gender, salary);
        type = Etype.Manager;
    }
    // 메소드 오버라이딩
    void doWork() {
        System.out.println(name + " manages professors and students");
    }
}

class Boss extends Person {

    int MAX_EMPLOY = 100; // 최대 고용할 수 있는 사람 수.
    int n_curEmploy = 0; // 현재 고용자 수.
    Employee[] employees = new Employee[MAX_EMPLOY];; // 보스는 employee를 가지고 있음.

    Boss() {
        this.name = "I'm the Boss";
        this.age = 99;
        this.gender = Gender.Male;
    }

    void hire(Employee e) {
        if (n_curEmploy < MAX_EMPLOY) {
            employees[n_curEmploy] = e;
            ++n_curEmploy;
            System.out.printf("%s를 고용했고, 현재 고용인원은 %d명입니다.\n", e.name, n_curEmploy);
        }
        else {
            System.out.println("더 이상 고용할 수 없습니다.");
        }
    }

    void makeEmplyWork() {
        for (int i = 0; i < n_curEmploy; ++i) {
            employees[i].showInfo();
            employees[i].doWork(); // print를 확인해보면 같은 코드임에도 다르게 print, 즉 작동함. 이게 다형성.
        }
    }
}


public class Inheritance0406 {
    public static void main(String[] args) {
        /*Person p = new Person("최비결", 33, Gender.Female);
        p.showInfo();
        System.out.println();

        Employee e = new Employee("최비결", 33, Gender.Female, 300);
        e.showInfo(); // 메소드 오버라이딩
        e.doWork(); // Employee만의 메서드
        System.out.println();

        Prof f = new Prof("Kim Yuna", 33, Gender.Female, 300);
        f.showInfo();
        f.doWork();
        System.out.println();

        Student s = new Student("안원영", 27, Gender.Male, 200);
        s.showInfo();
        s.doWork();
        System.out.println();

        Manager m = new Manager("신주석",42, Gender.Male, 300);
        m.showInfo();
        m.doWork();
*/

        Employee e = new Employee("일하는나뭉", 30, Gender.Female, 3000);
        Prof f = new Prof("강현우", 44, Gender.Male, 2000);
        Student s = new Student("남현진", 20, Gender.Female, 500);
        Manager m = new Manager("신주석", 42, Gender.Male, 3000);
        Boss b = new Boss();

        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(f);
        employees.add(s);
        employees.add(m);
        employees.remove(); // 마지막 자료 제거.
        // employees.add(b); -> error! b.. 즉, bos는 Employee에 해당하지 않기 때문.

        for (Employee E: employees){ // employees 라는 변수에서 모든 Employee 타입인 변수 E를 가져옴.
            E.showInfo();
            E.doWork();
        }

        // 2022-04-13 MyArrayList 클래스, ArrayList 실습!
        System.out.println();

        MyArrayList<Employee> mylist = new MyArrayList<>();
//        mylist.size = 3; // 외부에서 이걸 3이라고, 즉 멤버변수에 접근하고 싶게 만들고 싶지않다!! 그래서 private을 붙여준다.
        mylist.add(f);
        mylist.add(s);
        mylist.add(m);
//        mylist.add(b); // Boss 는 Employee가 아니므로 에러!

//        System.out.println(mylist.size); // size 알고싶은데 private이라 접근 불가, ==> 메소드를 이용해서 size를 알 수 있도록 하자
        System.out.println(mylist.length()); // 클래스의 size를 리턴하는 length() 메소드

        // add(index, element) 오버로딩한 메소드 이용하여 원하는 인덱스 자리에 원소 집어넣기
        mylist.add(0, m);
        mylist.add(1, s);
        mylist.add(2, f);
        mylist.remove(1);
        System.out.println(mylist.remove(1));
//        mylist.clear();
//        mylist.get(0);

        // get 메소드로 원하는 인덱스의 값을 받아오자
        /*Employee e1 = mylist.get(0);
        e1.showInfo();*/
        for (int i = 0; i < mylist.length(); ++i) {
            mylist.get(i).showInfo();
        }

    }
}