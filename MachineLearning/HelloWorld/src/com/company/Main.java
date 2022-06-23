package com.company;

public class Main {

    public static void main(String[] args) {
//        char a = 'A';
//
//        System.out.println(a);
//        System.out.printf("캐릭터 변수 a의 십진수 값은 %d 입니다. \n", (int)a);
//        System.out.printf("캐릭터 변수 a의 16진수 값은 %#x 입니다. \n", (int)a);
//
//        a = 'B';
//        System.out.printf("B는 %d이고, 0x%x 입니다. \n", (int)a, (int)a);
//
//        a = 76;
//        System.out.printf("%c이고, 0x%x 입니다. \n", a, (int)a);
//
//        a = 0x7FFF;
//
//        int b = 0x7FFFFFFF;
//        System.out.printf("캐릭터 변수 a의 십진수 최대 값은 %d 입니다. \n", (int)a);
//        System.out.printf("int 변수 b의 십진수 최대 값은 %d 입니다.\n", b);
//
//        System.out.println(1==1); // true
//        System.out.println(1!=1); // false
//        int score = 90;
//
//        if (score >= 90)
//        {
//            System.out.println("학점 : A");
//        }
//
//        else if (score >= 80)
//        {
//            System.out.println("학점 : B");
//        }
//
//        else if (score >= 70)
//        {
//            System.out.println("학점 : C");
//        }
//
//        else if (score >= 60)
//        {
//            System.out.println("학점 : D");
//        }
//
//        else
//        {
//            System.out.println("학점 : F");
//        }
//        int score = 90;
//
//        if (score < 60)
//        {
//            System.out.println("학점 : F");
//        }
//
//        else if (score < 70)
//        {
//            System.out.println("학점 : D");
//        }
//
//        else if (score < 80)
//        {
//            System.out.println("학점 : C");
//        }
//
//        else if (score < 90)
//        {
//            System.out.println("학점 : B");
//        }
//
//        else
//        {
//            System.out.println("학점 : A");
//        }

//        float bmi = 15.9f; // 아니면 double bmi = 15.9
//
//        if (bmi < 18.5) // 18.5 미만의 경우
//        {
//            if (bmi < 16)
//            {
//                System.out.println("깡마름");
//            }
//            else if (bmi < 17)
//            {
//                System.out.println("마름");
//            }
//            else
//            {
//                System.out.println("저체중");
//            }
//        }
//        else // 18.5 이상인 경우
//        {
//            if (bmi < 25)
//            {
//                System.out.println("보통체중");
//            }
//            else if (bmi < 30)
//            {
//                System.out.println("비만 위험군");
//            }
//            else
//            {
//                System.out.println("비만");
//            }
//        }
        double bmi = 17;

        if (bmi < 16)
        {
            System.out.println("깡마름");
        }
        else if (bmi < 17)
        {
            System.out.println("마름");
        }
        else if (bmi < 18.5)
        {
            System.out.println("저체중");
        }
        else if (bmi < 25)
        {
            System.out.println("보통체중");
        }
        else if (bmi < 30)
        {
            System.out.println("비만 위험군");
        }
        else
        {
            System.out.println("비만");
        }
    }
}
