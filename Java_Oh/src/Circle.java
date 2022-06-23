/*
public class Circle {
    int radius;
    String name;

    public Circle(){}

    public Circle(int radius) {
        this.radius = radius;
    }

    public void set(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, String name){
        this.radius = radius;
        this.name = name;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        */
/*Circle pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "페퍼로니피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.name = "크리스피도넛";
        donut.radius = 2;
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);*//*


        Circle obj1 = new Circle(1);
        Circle obj2 = new Circle(2);
        Circle obj3 = new Circle(3);

        System.out.println("obj1의 radius 는 " + obj1.radius);
        System.out.println("obj2의 radius 는 " + obj2.radius);
        System.out.println("obj3의 radius 는 " + obj3.radius);

        obj1.set(4);
        obj2.set(5);
        obj3.set(6);

        System.out.println("obj1의 radius 는 " + obj1.radius);
        System.out.println("obj2의 radius 는 " + obj2.radius);
        System.out.println("obj3의 radius 는 " + obj3.radius);

        // 객체 배열 생성
        Circle [] c; // Circle 배열에 대한 레퍼런스 c 선언
        c = new Circle[5]; // 5개의 레퍼런스 배열 생성

        for(int i=0; i<c.length; ++i) {
            c[i] = new Circle(i);
        }

        for(int i=0; i<c.length; ++i) {
            System.out.print((int)(c[i].getArea()) + " ");
        }
    }
}
*/
