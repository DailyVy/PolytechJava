import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class Day {
    private String work;
    public void set(String work) {this.work = work;}
    public String get() {return work;}
    public void show() {
        if (work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}
// todo. Day 객체 배열과 적절한 필드, 메소드를 작성
//  생성자, input(), view(), finish(), run() 메서드를 만들고
//  main에서 호출하여 실행하고 run()에서 메뉴를 출력하고 처리한다.
/*
이번달 스케쥴 관리 프로그램.
할일(입력:1, 보기:2, 끝내기:3) >> 1
날짜(1~30)? 1
할일(빈칸없이입력)?자바공부

할일(입력:1, 보기:2, 끝내기:3) >> 2
날짜(1~30)? 1
1일의 할 일은 자바공부 입니다.

할일(입력:1, 보기:2, 끝내기:3) >> 1
프로그램을 종료합니다.
*/
public class MonthSchedule {
    int lastDay;
    Day [] planner;
    int doOption; // 할일 옵션
    int theDay; // 날짜 지정

    // 생성자, 객체 배열 생성
    MonthSchedule(int lastDay) {
        this.lastDay = lastDay;
        this.planner = new Day[this.lastDay+1];
        for(int i = 0; i < planner.length; ++i) {
            planner[i] = new Day();
        }
    }
    // input()
    void input(int theDay) {
        Scanner scanner = new Scanner(System.in);
        this.theDay = theDay;
        System.out.print("할일(빈칸없이입력)?");
        String work = scanner.next();
        planner[this.theDay].set(work);
        scanner.close();
    }
    // view()
    void view(int theDay){
        this.theDay = theDay;
        System.out.print(this.theDay + "일의 할 일은 ");
        planner[this.theDay].show();
    }
    // finish() 함수 : 프로그램 종료
    void finish() {
        System.out.println("프로그램을 종료합니다.");
    }

    // run() 함수 ==> 메뉴 실행
    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이번 주 스케쥴 관리 프로그램");
        boolean finishCheck = false; // finish() 실행여부 판단

        while (true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
            this.doOption = scanner.nextInt();

            switch (doOption) {
                case 1:
                    System.out.print("날짜(1~" + lastDay +")? ");
                    theDay = scanner.nextInt();

                    // 날짜 예외처리
                    if (theDay < 1 || theDay > lastDay) {
                        throw new IndexOutOfBoundsException();
                    }

                    input(theDay);
                    break;
                case 2:
                    System.out.print("날짜(1~" + lastDay +")? ");
                    theDay = scanner.nextInt();

                    // 날짜 예외처리
                    if (theDay < 1 || theDay > lastDay) {
                        throw new IndexOutOfBoundsException();
                    }

                    view(theDay);
                    break;
                case 3:
                    finish();
                    finishCheck = true;
                    break;
            }
            if (finishCheck) break;
        }
        scanner.close();
    }

    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
        // todo. 배열에 실수 넣었을 때 예외처리 ==> try catch문 사용하면 되지 않을까..?
    }
}
