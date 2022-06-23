import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// todo. 다음에 그냥 ArrayList에 넣어야지...
class Phone {
    String name;
    String tel;
}
// todo. 이름(name), 전화번호(tel) 필드와 생성자 등을 가진
//  Phone 클래스를 작성하고 실행 예시와 같이 작동하는 PhoneBook 클래스를 작성하라
/*
인원수>>3
이름과 전화번호 (이름과 번호는 빈 칸없이 입력)>> 황기태 777-7777
이름과 전화번호 (이름과 번호는 빈 칸없이 입력)>> 나명품 999-9999
이름과 전화번호 (이름과 번호는 빈 칸없이 입력)>> 최자바 333-1234
저장되었습니다...
검색할 이름 >> 황기순
황기순 이 없습니다.
검색할 이름 >> 최자바
최자바의 번호는 333-1234 입니다.
검색할 이름 >> 그만 // 그만을 입력하면 프로그램 종료
* */
// todo. PhoneBook클래스에서 저장할 사람의 수를 입력받고 Phone 객체 배열을 생성한다.
//  한 사람의 정보는 하나의 Phone 객체에 저장한다. ==> 7번 정답
//  문자열 a와 b가 같은지 비교할 때 a.equals(b)가 참인지로 판단한다.

public class PhoneBook {
    Phone[] phones; //
    int numPerson;
//    boolean checkEnd = false;

    PhoneBook(int numPerson) {
        this.numPerson = numPerson;
        // 만약 numPerson이 0이하의 수라면
        if (numPerson < 1) {
            System.out.println("사람 수는 1명 이상의 값을 입력해주십시오.");
            throw new IndexOutOfBoundsException();
        }
        // Phone 객체 배열 생성
        this.phones = new Phone[this.numPerson];
        for (int i = 0; i < phones.length; ++i) {
            phones[i] = new Phone();
        }
    }

    void input(int index, String name, String tel) {
        phones[index].name = name;
        phones[index].tel = tel;
    }

    // 여기 수정합시당
    void view(String findName) {
        boolean checkFind = false;
        int findNameIndex = 0;
        for (int i =0; i < phones.length; ++i) {
            if (phones[i].name.equals(findName)) {
                checkFind = true;
                findNameIndex = i;
            }
        }
        if (checkFind) {
            System.out.println(phones[findNameIndex].name + "의 번호는 " + phones[findNameIndex].tel + "입니다.");
        }
        else {
            System.out.println(findName + " 이  없습니다.");
        }
    } // view 끝

    void run() {
        numPerson = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수 >> ");
        try {
            numPerson = scanner.nextInt();
            // 객체 배열 생성
            PhoneBook phoneBook = new PhoneBook(numPerson);

            // 이제 인원수 만큼 돌면서 입력받자고
            for (int i = 0; i < phones.length; i++) {
                System.out.print("이름과 전화번호 (이름과 번호는 빈 칸없이 입력)>> ");
                String inputName = scanner.next();
                String inputTel = scanner.next();
                input(i, inputName, inputTel);
            }
            System.out.println("저장되었습니다...");

            while (true) {
                System.out.print("검색할 이름 >> ");
                String findName = scanner.next();

                if (findName.equals("그만")) break;
                else {
                    view(findName); // 보여주는 거 실행해
                }
//                if (checkEnd) break;
            }
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("잘못입력하였습니다.");
        }
    } // run 끝


        public static void main (String[]args){
            PhoneBook phoneBook = new PhoneBook(3);
            phoneBook.run();
        } // main 끝

    } // PhoneBook 클래스 끝