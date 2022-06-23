public class CheckPoint1 {
    public static void main(String[] args) {
        //1. 2중중첩으로 별그리기
        // 1-1. for문
        for(int i = 5; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 1-1. 번외. for문 하나
        for (int i =5; i > 0; --i) {
            System.out.println("*".repeat(i));
        }
        // 1-2. while
        int i = 5;
        while (i > 0) {
            int j = 1; // j = 0;
            while (j <= i) { // j++ < i;
                System.out.print("*");
                ++j; // 없음
            }
            System.out.println();
            i--;
        }
        // todo.do while문으로도 하기
        // 1-3. do while
        int k = 5;
        do {
            int l = 0;
            do {
                System.out.print("*");
                l++;
            }while (l < k);
            System.out.println();
            --k;
        }while (k > 0);


        // 3. 1~100까지 3의 배수의 합을 구하는 프로그램
        int sum = 0;
        for (int num = 1; num <= 100; ++num) {
            if (num % 3 == 0) {
                sum += num;
            }
        }
        System.out.println("1부터 100까지 3의 배수의 합은 " + sum); // 1683


    }
}
