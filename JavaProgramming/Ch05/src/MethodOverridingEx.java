class Shape {

    protected String name;
    public Shape next; // Linked list인가 보다...
    public Shape() {next = null;} // 생성자 ==> 필드 초기화

    public void paint() {
        draw();
    }

    public void draw() {
        System.out.println(name);
    }
}

class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends Shape {
    protected String name;
    @Override
    public void draw() {
        name = "Circle";
        super.name = "Shape"; // 정적바인딩 ==> super 이용
        super.draw();
        System.out.println(name);
//        System.out.println("Circle");
    }
}

public class MethodOverridingEx {
    static void paint(Shape p) {
        p.draw();
    }
    public static void main(String[] args) {
        // todo. Linked List 메서드 오버라이딩
        Shape start, last, obj;

        // Linked List 로 도형 생성하여 연결
        start = new Line();
        last = start;
        obj = new Rect();
        last.next = obj;
        last= obj;
        obj = new Line();
        last.next = obj;
        last = obj;
        obj = new Circle();
        last.next = obj;
        last = obj;

        Shape p = start;
        while (p != null) {
            p.draw();
            p = p.next;
        }



//        // 정적바인딩 ==> super 키워드 이용
//        Shape b = new Circle(); // 업캐스팅
//        b.paint();
//        //원래는 동적바인딩에 의해서 Circle만 나올텐데, super.name 으로 Shape 집어넣고 super.draw()로 부모클래스의 메서드 사용
    }
}
