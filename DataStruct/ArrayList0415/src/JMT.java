enum FoodType {Korea, Japan, China, SE_Asia, EU, US}

class Menu { // JMT 에서만 쓸 거라서 따로 만들지 않고 여기에 class 만듦
    String name;
    int price;

    Menu (String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class JMT {
    private String name; // private으로 해도 같은 파일내에 있어서 main에서 접근이 가능하다.
    private String addr; // 단 다른 클래스 파일로 만들면 접근 불가~~~
    private double score;
    FoodType type;
    // Todo: menu를 추가하겠다. list를 구현한 다음에
    private MyArrayList<Menu> menuPan = new MyArrayList<>();

    JMT(String name,String addr, double score,FoodType ft) {
        this.name = name; // this.name 의 name은 클래스의 name, = 뒤의 name은 JMT()생성자의 파라미터
        this.addr = addr;
        this.score = score;
        this.type = ft;
    }

    void addMenu (Menu m) {
        menuPan.add(m);
    }

    public static void main(String[] args) { // main 은 다른 아이다!! JMT 클래스에 있는 것 같지만 다른 편입니다~ => 그래서 private으로 선언되면 여기에서 접근할 수 없다.
        // 맛집을 집어넣을 리스트가 필요하다. ==> MyArrayList 라는 새로운 클래스를 만들었다.
//        JMT2 matzip0 = new JMT2("kopo", "daegu", 5.0, FoodType.Korea); // 생성자 호출, 객체 생성
        JMT matzip1 = new JMT("azit", "daegu", 3.0, FoodType.Korea); // 생성자 호출, 객체 생성
        JMT matzip2 = new JMT("tiger", "prdong", 4.0, FoodType.EU); // 생성자 호출, 객체 생성
        JMT matzip3 = new JMT("haksik", "kopo", 5.0, FoodType.Korea); // 생성자 호출, 객체 생성
        JMT matzip4 = new JMT("gaya", "daegu", 4.0, FoodType.China); // 생성자 호출, 객체 생성
        JMT matzip5 = new JMT("prd", "daegu", 4.5, FoodType.EU); // 생성자 호출, 객체 생성

        MyArrayList<JMT> jmtList = new MyArrayList<>(); // 타입 명시 <JMT>

        // 이제 리스트에 맛집을 넣어보자
//        jmtList.add(matzip0);
        jmtList.add(matzip1);
        jmtList.add(matzip2);
        jmtList.add(matzip3);
        jmtList.add(matzip4);
        jmtList.add(4, matzip5);

        Menu m1 = new Menu("Gimbap", 3500);
//        matzip0.menuPan.add(m1); // matzip0은 JMT클래스로 부터 만들어진 객체.
        matzip1.menuPan.add(m1); // matzip1은 JMT클래스로 부터 만들어진 객체.
        // JMT의 멤버중에 menuPan이 있고, 얘는 public이라 접근이 가능하다.
        // menuPan은 MyArrayList로 부터 만들어졌으니 add() 메소드를 사용할 수 있다.

//        jmtList.remove(3); // tiger를 지워보자

        for(int i = 0; i < jmtList.length(); i++) {
            System.out.println(jmtList.get(i).name); // name을 봅시다.
        }


    }
}
