package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 2;
        int j = 1;

        while (i < 10)
        {
            System.out.println("[" + i + "단]");
            while (j < 10)
            {
                System.out.printf("%d * %d = %d\n", i, j, i*j);
                ++j;
            }
            ++i;
            j = 1; // j를 다시 초기화
            System.out.println(" ");
        }
    }
}
