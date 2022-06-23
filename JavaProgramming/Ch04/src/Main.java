import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*// 1. 배열에 대한 레퍼런스 선언
        Circle [] c; // Circle 클래스의 배열에 대한 레퍼런스 변수 c 선언
//        Circle [5] c; // 배열의 크기를 지정하면 컴파일 오류 발생!! => 변수 c만 선언할 뿐 배열을 생성한 것은 아니기 때문
        // ==> 배열이 Circle 타입을 담는거야

        // 2. 레퍼런스 배열 생성
        c = new Circle[5]; // 배열의 원소는 객체가 아니라 레퍼런스!

        // 3. 객체생성
        for (int i=0; i < c.length; i++) {
            c[i] = new Circle(i); // radius ==> 배열원소 Circle의 객체가 되겠지(속성, 기능)
        }

        // 4. 배열의 원소 객체 접근
        for (int i=0; i < c.length; i++) {
            System.out.println(c[i].getArea() + " ");
        }*/


//        Circle []circles; // 배열 레퍼런스 선언
//        circles = new Circle[5]; // 레퍼런스 배열 생성
//        Circle [] circles = new Circle[5];
//
//        for (int i=0; i < circles.length; i++) {
//            circles[i] = new Circle(i); // 반지름이 0~4인 Circle 객체 5개
//        }
//        // Circle 객체의 모든 면적 출력하기
//        for (int i=0; i <circles.length; i++) {
//            System.out.println((int)circles[i].getArea());
//        }


//        TV myTV = new TV("LG", 2017, 32);
//        myTV.show();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>> ");
//        int math = scanner.nextInt();
//        int science = scanner.nextInt();
//        int english = scanner.nextInt();
//
//        Grade me = new Grade(math, science, english);
//        System.out.println("평균은 " + me.average());
//        scanner.close();


//        Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
//        song.show();

        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);
        Rectangle u = new Rectangle(10, 9, 4, 4);
        Rectangle v = new Rectangle(0, 0, 3, 3);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");

        if(v.contains(r)) System.out.println("v는 r을 포함합니다.");
        else System.out.println("v는 r을 포함하지 않습니다.");


    }
}
