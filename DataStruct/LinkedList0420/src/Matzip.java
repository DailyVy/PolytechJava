public class Matzip {
    String name; // 맛집 이름
    String addr; // 맛집 주소

    // 생성자! 클래스 이름과 같고 리턴타입이 없다!
    Matzip(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    void showInfo() { // 맛집 정보 리턴하는 함수 showInfo()
        System.out.printf("%s 식당의 주소는 %s 입니다.\n", name, addr);
    }

    public static void main(String[] args) {
        Matzip m1 = new Matzip("JMT", "Daegu");
        Matzip m2 = new Matzip("평리당", "평리동");
        Matzip m3 = new Matzip("영화식당", "영천");
//        m1.showInfo();
//        m2.showInfo();
//        m3.showInfo();

        // Matzip만 들어갈 수 있는 MyLinkedList
        MyLinkedList<Matzip> matzipList = new MyLinkedList<>();
//        matzipList.add(m1);
//        matzipList.add(m2);
//        matzipList.add(m3);
        matzipList.add(0, m1);
        matzipList.add(0, m2);
        matzipList.add(2, m3);
        matzipList.remove(1); // JMT를 지워봅시다

        System.out.println(matzipList.size()); // 3

        matzipList.get(0).showInfo();
        matzipList.get(1).showInfo();
//        matzipList.get(2).showInfo(); // remove 했으니까 index 2는 없어
    }
}
