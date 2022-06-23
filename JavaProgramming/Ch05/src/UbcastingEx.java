class Person {
    /*String name;
    String id;

    public Person(String name) {
        this.name = name;
    }*/
}
class Student extends Person {
    /*String grade;
    String department;

    public Student(String name) {
        super(name);
    }*/
}

class Researcher extends Person {}
class Professor extends Researcher {}

public class UbcastingEx {
    static void print(Person p) {
        if (p instanceof Person) System.out.print("Person ");
        if (p instanceof Student) System.out.print("Student ");
        if (p instanceof Researcher) System.out.print("Researcher ");
        if (p instanceof Professor) System.out.print("Professor ");
        System.out.println();
    }

    public static void main(String[] args) {
        /*Person p;
        Student s = new Student("최비결");
        p = s; // 업캐스팅

        System.out.println(p.name);

//        p.grade = "A"; // 컴파일 오류
//        p.department = "Com"; // 컴파일 오류
        // p와 s는 같은 객체를 가리키더라도 p는 Person 타입이다.(업캐스팅)
        //  p는 Student의 객체 중 Person 객체만 접근 가능하다.
        //  s는 전부 접근 가능

        System.out.println(s.name);
        s.grade = "A";
        s.department = "AI";

        // 다운캐스팅
        //  다운캐스팅은 업캐스팅된 상황에서 사용
        Person p2 = new Student("쁨이"); // p2는 Student 객체를 생성했지만 Person의 멤버만 접근 가능
        Student s2;

        s2 = (Student)p2;
        //다운캐스팅 : Person만 접근가능하던 p2를 s2는 Student로 다운캐스팅
        // => p2가 늘어난게 아님!!! s2가 접근 가능한 것

        System.out.println(p2.name);
        s2.grade = "A"; // 오류 없엉
        // p2 는 접근안될거야
//        p2.grade = "B"; // 에러*/
        System.out.print("new Student() -> \t"); print(new Student());
        System.out.print("new Researcher() -> \t"); print(new Researcher());
        System.out.print("new Professor() -> \t"); print(new Professor());

    }
}
