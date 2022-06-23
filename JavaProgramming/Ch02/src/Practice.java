import java.util.Scanner;

public class Practice {
    /*    public static int sum(int n, int m) {
            return n + m;
        }*/
    public static void main(String[] args) {

/*        int i = 4;
//         아래의 코드 수정
        if (i % 2 == 0) {
            if (i % 3 == 0)
                System.out.println("6의 배수");
        }
        else {
            System.out.println("홀수");
        }*/
/*        if (i % 2 != 0)
        {
            System.out.println("홀수");
        }
        else if (i % 2 == 0 && i % 3 == 0)
        {
            System.out.println("6의 배수");
        }*/

/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which do you want for coffee? ");
        String order = scanner.next();

        int price = 0;

        switch (order)
        {
            case "에스프레소":
            case "카푸치노":
            case "카페라떼":
                price = 3500;
                break;
            case "아메리카노":
                price = 2000;
                break;
            default:
                System.out.println(order + " is out of stock for the moment");
        }
        if (price != 0)
        {
            System.out.println(order + " is " + price + " won" );
        }
        scanner.close();
*/

/*        Scanner scanner = new Scanner(System.in);
        int score;
        char grade;

        do {
            System.out.print("점수를 입력하세요(0~100): ");
            score = scanner.nextInt();
        } while(score>100 || score<0);

        switch (score/10)
        {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("Grade is " + grade);
        scanner.close();*/



/*        Scanner scanner = new Scanner(System.in);
        int score;
        int year;

        do {
            System.out.print("점수를 입력하세요(0~100): ");
            score = scanner.nextInt();
        } while (score > 100 || score < 0);

        do {
            System.out.print("학년을 입력하세요(1~4): ");
            year = scanner.nextInt();
        } while (year > 4 || year < 1);

        if (score >= 60)
        {
            if (year != 4)
            {
                System.out.println("합격입니다.");
            }
            else if (score >= 70)
            {
                System.out.println("합격입니다.");
            }
            else
            {
                System.out.println("불합격입니다.");
            }
        }
        else
        {
            System.out.println("불합격입니다. ");
        }

        scanner.close();*/



/*        Scanner scanner = new Scanner(System.in);
        int score;
        char grade;

        do {
            System.out.print("점수를 입력하세요(0~100): ");
            score = scanner.nextInt();
        } while (score > 100 || score < 0);

        if(score >= 90)
        {
            grade = 'A';
        }
        else if(score >= 80)
        {
            grade = 'B';
        }
        else if(score >= 70)
        {
            grade ='C';
        }
        else if(score >= 60)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }
        System.out.println("Grade is " + grade);
        scanner.close();*/

/*        Scanner scanner = new Scanner(System.in);

        System.out.print("자연수를 입력하세요. ");
        int number = scanner.nextInt();

        if (number % 3 == 0)
        {
            System.out.println(number + "은 3의 배수입니다.");
        }
        else
        {
            System.out.println(number + "은 3의 배수가 아닙니다.");
        }
        scanner.close();*/

/*        Scanner scanner = new Scanner(System.in);
        int score;

        do {
            System.out.print("Write your score : ");
            score = scanner.nextInt();
        } while (score > 100 || score < 0);

        if (score >= 80)
        {
            System.out.println("Congratulation!");
        }

        scanner.close();*/


/*        int x = 2, y = 10, z = 0;
        z = x++ * 2 + --y - 5 + x*(y%2));
        System.out.println(z); //
        System.out.println(--y+(y+1));
        System.out.println(x++ + (x+1));
        System.out.println(x);

        System.out.println(8>>2);
        System.out.println(-16>>2);

        int opr = 4;
        System.out.println(opr++);*/

/*        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요. ");
        int time = scanner.nextInt();
        int second = time % 60; // 60으로 나눈 나머지 초
        int minute = (time / 60) % 60; // 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
        int hour = (time/60) / 60; // 60으로 나눈 몫을 다시 60으로 나누면 시간

        System.out.print(time + "초는 ");
        System.out.print(second + "시간, ");
        System.out.print(minute + "분, ");
        System.out.print(hour + "초입니다.");
        scanner.close();*/

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("두 개의 정수를 공백으로 구분하여 입력하시오.");

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int sum = first + second;

        System.out.println("두 정수의 합은 " + sum + "입니다.");*/

/*        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요. ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String city = scanner.next();
        int age = scanner.nextInt();
        double weight = scanner.nextDouble();
        boolean isSingle = scanner.nextBoolean();

        scanner.close();

        System.out.println("이름은 " + name + "이고, 사는 곳은 " + city + "입니다." + " 나이는 " + age +
                "살 이며, 체중은 " + weight + "kg 입니다. 독신 여부는 " + isSingle + "입니다.");*/

/*        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();
        System.out.println(fullName);

//        String name = scanner.next();
//        String city = scanner.next();
//        int age = scanner.nextInt();
//        double weight = scanner.nextDouble();
//        boolean inSingle = scanner.nextBoolean();
//
//        System.out.println(name);
//        System.out.println(city);
//        System.out.println(age);
//        System.out.println(weight);
//        System.out.println(inSingle);
        scanner.close();*/


/*        byte b = 127;
        int i = 100;
        System.out.println(b+i); // 227
        System.out.println(10/4); //2
        System.out.println(10.0/4); // 2.5
        System.out.println((char)0x12340041); // 해당하는 유니코드값이 나오겠지?
        System.out.println((byte)(b+i)); // 227? 255 까지는 바이트 가능하지 않나? ==> -128~127 임^^;
        System.out.println((int)2.9 + 1.8); // 3.8
        System.out.println((int)(2.9 + 1.8)); //4
        System.out.println((int)2.9 + (int)1.8); // 3

        System.out.println((byte)(128+128));*/

        /*int n = 300;
        byte b = (byte)n;
        System.out.println(b);
*/
        /*final double PI = 3.141592;

        double radius = 10.0;
        double circleArea = radius * radius * PI;

        System.out.println("원의 면적 = " + circleArea);
*/
/*        int i = 20;
        int s;
        char a;

        s = sum(i, 10);
        a = '?';
        System.out.println(a); // ?
        System.out.println("Hello"); // Hello
        System.out.println(s); // 30*/

        Scanner scanner = new Scanner(System.in);

        String in = scanner.next();

//        if(in.equals("가위")) {
//            System.out.println(1);
//        }
//        else if(in.equals("바위")) {
//            System.out.println(2);
//        }
//        else if(in.equals("보")) {
//            System.out.println(3);
//        }
//        else {
//            System.out.println(0);
//        }

        // page 109. 14번
        switch (in) {
            case "가위":
                System.out.println(1); break;
            case "바위":
                System.out.println(2); break;
            case "보":
                System.out.println(3); break;
            default:
                System.out.println(0);
        }
        scanner.close();

    }
}
