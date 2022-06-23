public class TV {
    String name;
    int year;
    int size;
    TV(String name, int year, int size) {
        this.name = name;
        this.year = year;
        this.size = size;
    }
    void show() {
        System.out.println(name + "에서 만든 " + year + "년형 " + size + "인치 TV");
    }
}
