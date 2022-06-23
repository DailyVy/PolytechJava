/*
// Scanner 를 사용하기 위해 import
import java.util.Scanner;

// ABC 클래스 생성
class ABC{
    int n = 100; // 속성
    String a = "Hello"; // 속성

    void methodA(){ // 기능
        System.out.println("methodA");
    }
    void ABC(){

    }
}*/

public class Java0324 {
    public static void main(String[] args) {

        /*****************************비교 연산자와 논리 연산자********************************/
        // 비교 연산
        System.out.println('a' > 'b'); // false 97 > 98
        System.out.println(3 >= 2); //true
        System.out.println(-1 < 0); //true
        System.out.println(3.45 <= 2); // false
        System.out.println(3 == 2); // false
        System.out.println(3 != 2); // true
        System.out.println(!(3 != 2)); // false

        // 비교 연산과 논리 연산 복합
        System.out.println((3 > 2) && (3 > 4)); // false
        System.out.println((3 != 2) || (-1 > 0)); // true
        System.out.println((3 != 2) ^ (-1 > 0)); // true

        /*****************************대입 연산자와 증감 연산자********************************/

        int a = 3, b = 3, c = 3;

        // 대입 연산자 사례
        a += 3; // 6
        b *= 3; // 9
        c %= 2; // 1
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);

        int d = 3;
        // 증감 연산자 사례
        a = d++; // a = 3, d = 4
        System.out.println("a=" + a + ", d=" + d);
        a = ++d; // a = 5, d = 5
        System.out.println("a=" + a + ", d=" + d);
        a = d--; // a = 5, d = 4
        System.out.println("a=" + a + ", d=" + d);
        a = --d; // a = 3, d = 3
        System.out.println("a=" + a + ", d=" + d);


        /*****************************식과 연산자********************************/
/*

        int n = 1;
        System.out.println(n++); // 1
        System.out.println(n); // 2

        int m = 1;
        System.out.println(++m); // 2

        int a = 1;
        int b = 5;
        System.out.println((a++) + b); // 6
        System.out.println(a + b); // 7

*/
        /***************************Scanner 클래스 객체 생성******************************/

        /*
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next(); // 문자열 읽기
        System.out.print("이름은 " + name + ", ");

        String city = scanner.next(); // 문자열 읽기
        System.out.print("도시는 " + city + ", ");

        int age = scanner.nextInt(); // 정수 읽기
        System.out.print("나이는 " + age + "살, ");

        double weight = scanner.nextDouble(); // 실수 읽기
        System.out.print("체중은 " + weight + "kg, ");

        boolean single = scanner.nextBoolean(); // 논리값 읽기
        System.out.print("독신 여부는 " + single + "입니다.");

        scanner.close(); // scanner 닫기

*/

        /***********************객체를 생성해보자**********************/
        /*
        ABC obj = new ABC(); // 생성자(ABC()) 출할 때는 new 키워드! obj는 ABC클래스의 객체!
        System.out.println(obj.n); // 속성 100
        obj.methodA(); // 기능 methodA

        ABC obj2 = new ABC();
        obj2.n = 1000; // 100대신 1000을 집어넣어 보았다.
        System.out.println(obj2.n); // 1000
        System.out.println(obj.n); // 100, obj.n 값은 변하지 않음
        */

        /***********************print와 println 차이**********************/
        /*
        System.out.println("hello_ln\n");
        System.out.print("hello");
        System.out.print("hello");
        */

        /***********************논리 리터럴 boolean**********************/
        /*
//        boolean c = 1; // Error
//        int n = null; // Error
        String str = null; // String 은 null 할당 가능

        float a = 1.2345f;
        double b = 1.23456;
        */

        /***********************원의 면적 구하기 예제**********************/
        /*
        final double PI = 3.14; // 3.14d, 3.14D
        double radius = 10.0;
        double circleArea = radius * radius * PI;

        System.out.println("반지름이 " + radius + "인 원의 면적은 " + circleArea);
        */
        /*****************************형변환(자동, 강제-캐스팅)*********************************/

        /*
        long m = 25; // 25는 int(4byte) 타입. 25가 long(8byte) 타입으로 자동 변환되는 사례
        // 원래 long타입 초기화할때는 L을 붙여줘야 하는데 위에서 자동으로 컴파일러가 25L 로 집어넣는다.

        double d = 3.14 * 10; // 실수 연산을 하기 위해 10이 10.0으로 자동 변환!

        int n =300;
//        byte b = n; // byte는 1byte! 컴파일 오류!
        byte b = (byte) n; // 값 손실
        System.out.println(b); // 44 가 뜬다.

        double c = 1.9;
        int c_int = (int) c; // 강제 타입 변환
        System.out.println(c_int); // 1
        */

        /************************타입변환 예제 실습*********************/
/*
        byte b = 127;
        int i = 100;

        System.out.println(b+i); // 227
        System.out.println(10/4); // 2.5(X) -> 2
        System.out.println(10.0/4); // 2.5
        System.out.println((char)0x12340041); // -> A
        System.out.println((byte)(b+i)); //227은 아니다! -> -29
        System.out.println((int)2.9 + 1.8); // 2+1.8 = 3.8? -> 3.8
        System.out.println((int)(2.9 + 1.8)); // 4.7 ==> 4
        System.out.println((int)2.9 + (int)1.8); //3
        */

    }
}

