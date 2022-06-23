import java.util.Scanner;

public class Java0414 {
    // 메서드 배열 리턴
    /*// 함수를를이해해보자
    static int test(int x, int y, String z){
        // test : 함수 이름
        // (int x, int y, String z) : x, y, z는 parameter, ()는 parameter를 받지 않는 것
        // void : 돌려줄 값이 없을 대 void라고 쓴다.
        // int : 돌려줄 값이 정수형일 때 int
        int result = x + y;
        return result;
        // return 반환값; 함수의 결과(를 돌려준다. "반환값은 무조건 한 개만!"
    }*/

    public static void main(String[] args) {
        // 1교시
        // 배열의 요소 평균을 계산해보자
        /*int intArray[] = new int[5];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + intArray.length + " Integer>> ");
        for(int i = 0; i < intArray.length ; i++) {
            intArray[i] = scanner.nextInt();
        }

        for(int i = 0 ; i < intArray.length ; i++){
            sum += intArray[i];
        }

        System.out.print("Average value is " + (double) sum/intArray.length);
        scanner.close();*/

        // 2교시
        // 2차원 배열 만들기 3x3 정방형 배열
        /*int arr2[][];
        arr2 = new int[3][3];
        arr2[0][0] = 1;
        int num = 1;

        for (int i = 0; i < arr2.length ; i++){
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = num;
                num++;
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
        // 구분을 위한 공백
        System.out.println();*/
        // 비정방형 배열 만들기
        /*int iArr[][];
        iArr = new int[3][];

        iArr[0] = new int[2];
        iArr[1] = new int[1];
        iArr[2] = new int[3];
        int num2 = 1;

        for (int i = 0; i < iArr.length ; i++) {
            for (int j = 0; j < iArr[i].length ; j++) {
                iArr[i][j] = num2;
                num2++;
                System.out.print(iArr[i][j]);
            }
            System.out.println();
        }*/
        // 메서드에서 배열 리턴
        /*int num;
        num = test(1, 2, "hello"); // 메서드 호출, 함수 실행, (1)은 argument
        System.out.println(num);*/

        // 3교시
        // Java0414 우클릭 - More Run/Debug - Modify run configuration - program arguments에 hello world
        // hello와 world는 main의 파라미터인 args 에 들어가게 된다.
        String a = args[0];
        String b = args[1];
        System.out.println(a + b);
        // 예외 처리
        int num;
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        try {
            num = 5 / 0; // 이미 여기서 에러가 발생하여 ArithmeticException의 catch문으로 갔기 때문에
            arr[3] = 4; // 이 부분은 실행이 안되서 에러를 확인할 수 없다.

        }
        catch (ArithmeticException e) { // 에러(문제)를 변수 e에 저장
            System.out.println(e);
            System.out.println("에러 발생");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("에러 발생2");
        }
    }
}
