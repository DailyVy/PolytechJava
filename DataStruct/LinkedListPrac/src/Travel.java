public class Travel {
    String country;
    String location;
    int year;

    Travel(String country, String location, int year){
        this.country = country;
        this.location = location;
        this.year = year;
    }

    void showInfo() {
        System.out.printf("%d년에 내가 여행간 곳은 %s이다.\n", year, country);
    }

    // todo : 각 나라별 방문한 도시를 Array List랑 Linked List로 넣어보자

    public static void main(String[] args) {
        Travel t1 = new Travel("스위스", "유럽", 2014);
        Travel t2 = new Travel("프랑스", "유럽", 2015);
        Travel t3 = new Travel("스페인", "유럽", 2016);
        Travel t4 = new Travel("일본", "아시아", 2017);
        Travel t5 = new Travel("태국", "아시아", 2018);
        Travel t6 = new Travel("영국", "유럽", 2019);

        MyLinkedList<Travel> myTrip = new MyLinkedList<>();
        myTrip.add(t1);
        myTrip.add(t2);
        myTrip.add(t3);
        myTrip.add(0, t4);
        myTrip.add(0, t5);
        myTrip.add(1, t6);
        myTrip.remove(2); // 일본을 지워보자
        myTrip.remove(0); // 태국을 지워보자
//        myTrip.clear();

        System.out.println(myTrip.size());

        myTrip.get(0).showInfo();
        myTrip.get(1).showInfo();
        myTrip.get(2).showInfo();
        myTrip.get(3).showInfo();
//        myTrip.get(4).showInfo();
//        myTrip.get(5).showInfo();
    }
}
