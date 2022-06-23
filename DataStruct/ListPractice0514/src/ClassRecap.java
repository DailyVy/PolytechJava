enum Gender {male, female};
enum Etype {singer, athlete, manager}

class Person {
    String name;
    int age;
    Gender gender;

    Person() {
    }

    Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void showInfo() {
        System.out.println("이름은 " + this.name +"이고, 나이는 "
                + this.age + "살, 성별은 " + this.gender +"이다.");
    }
}

class Entertainment extends Person {
    int salary;

    Entertainment() {
    }

    Entertainment(String name, int age, Gender gender, int salary){
        super(name, age, gender);
        this.salary = salary;
    }

    @Override
    void showInfo() {
        System.out.printf("[%s] %d세, %s : [%d]\n", this.name, this.age, this.gender, this.salary);
    }
    // Entertainment만의 메소드
    void doWork() {
        System.out.println(this.name + "은/는 지금 열심히 일하는 중!");
    }

}

class Singer extends Entertainment {
    Etype job;

    Singer(String name, int age, Gender gender, int salary) {
        super(name, age, gender, salary);
        this.job = Etype.singer;
    }

    @Override
    void doWork() {
        System.out.println(this.name + "은/는 음반 녹음 중입니다!");
    }
}

class Athlete extends Entertainment {
    Etype job;

    Athlete(String name, int age, Gender gender, int salary) {
        super(name, age, gender, salary);
        this.job = Etype.athlete;
    }

    @Override
    void doWork() {
        System.out.println(this.name + "은/는 지금 국제경기에 참가 중입니다.");
    }
}

class Manager extends Entertainment {
    Etype job;

    Manager(String name, int age, Gender gender, int salary) {
        super(name, age, gender, salary);
        this.job = Etype.manager;
    }

    @Override
    void doWork() {
        System.out.println(this.name + "은/는 지금 스케쥴 관리하느라 바빠요.");
    }
}

class Boss extends Person {
    int MAX_EMPLOY = 5; // 최대 고용인원 수
    int n_curEmploy = 0;
    // 고용인원들을 관리할 배열
    Entertainment[] enter = new Entertainment[MAX_EMPLOY];

    Boss() {
        this.name = "최비결";
        this.age = 33;
        this.gender = Gender.female;
    }
    // 고용하는 메서드
    void hire(Entertainment e){
        if(n_curEmploy < MAX_EMPLOY) {
            enter[n_curEmploy] = e;
            n_curEmploy++;
        }
        else{
            System.out.println("더 이상 고용할 수 없습니다");
        }
    }
    // 일을 시키자 ==> Entertaiment들이 doWork할 수 있도록
    void makeWorkE() {
        for(int i = 0; i < n_curEmploy; i++) {
            enter[i].showInfo();
            enter[i].doWork();
        }
    }

}

public class ClassRecap {
    public static void main(String[] args) {
        /*********************************클래스 상속, 다형성...***********************************/
        Person p = new Person("민선예", 34, Gender.female);
        p.showInfo();

        Boss b = new Boss();
        b.showInfo(); // Person의 메서드

        Singer s1 = new Singer("IU", 30, Gender.female, 3000);
        Singer s2 = new Singer("태연", 34, Gender.female, 3500);
        Athlete a1 = new Athlete("김연경", 35, Gender.female, 4000);
        Athlete a2 = new Athlete("김연아", 33, Gender.female, 4500);
        Manager m1 = new Manager("강동원", 43, Gender.male, 2500);

        b.hire(s1);
        b.hire(s2);
        b.hire(a1);
        b.hire(a2);
        b.hire(m1);
//        b.hire(s1); // 더 이상 고용불가!! MAX_EMPLOY가 5이기 때문

        b.makeWorkE();

        /********************************선형리스트************************************/
        System.out.println("========================선형리스트=========================");

        MyArrayList<Entertainment> entertainer = new MyArrayList<>();

        entertainer.add(s1);
        entertainer.add(a1);
        entertainer.add(a2);
        entertainer.add(m1);
        entertainer.add(0, s2);
        entertainer.remove(4);
//        entertainer.clear();

        for (int i = 0; i < entertainer.size(); i++) {
            entertainer.get(i).showInfo();
        }

        System.out.println(entertainer.size());

        /********************************연결리스트************************************/
        System.out.println("========================연결리스트=========================");

        MyLinkedList<Entertainment> star = new MyLinkedList<>();

        star.add(m1);
        star.add(a2);
        star.add(a1);
        star.add(0, s1);
        star.add(1, s2);
        star.remove(2);
//        star.clear();

        for (int i = 0; i < star.length(); i++) {
            star.get(i).showInfo();
        }

        System.out.println(star.length());
    }
}
