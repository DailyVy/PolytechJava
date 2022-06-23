public class JMT2 {
    private String name;
    private String addr;
    private double score;
    FoodType type;
    // Todo: menu를 추가하겠다. list를 구현한 다음에
    private MyArrayList<Menu> menuPan = new MyArrayList<>();

    JMT2(String name,String addr, double score,FoodType ft) {
        this.name = name; // this.name 의 name은 클래스의 name, = 뒤의 name은 JMT()생성자의 파라미터
        this.addr = addr;
        this.score = score;
        this.type = ft;
    }

    void addMenu (Menu m) {
        menuPan.add(m);
    }
}
