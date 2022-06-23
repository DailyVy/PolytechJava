import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개?");
        int intNum = scanner.nextInt();

        int [] intArray = new int[intNum];

        for(int i = 0; i < intNum; i++) {
            intArray[i] = (int)(Math.random()*100 + 1);
            // todo. 배열에는 같은 수가 없어야 한다.
            if (i > 0 && intArray[i] == intArray[i-1]) {
                i--;
                continue;
            }
            System.out.print(intArray[i] + " ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }
        scanner.close();
    }
}
