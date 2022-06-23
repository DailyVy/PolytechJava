import java.util.Arrays;

class Answer2 {
    // 1번 문제
    enum MySize {XS, S, M, L, XL, XXL} // enum타입은 숫자로 바꿀 수 있다. 0, 1, 2, 3, 4, 5

    int[] solution1(String[] shirtSize) {

        int[] result = new int[MySize.values().length]; // enum size는 values().length, values()는 enum타입의 모든 요소를 리턴

        /*for (int i = 0; i < shirtSize.length; ++i) {
            if (shirtSize[i] == "XS") result[0]++;
            else if (shirtSize[i] == "S") result[1]++;
            else if (shirtSize[i] == "M") result[2]++;
            else if (shirtSize[i] == "L") result[3]++;
            else if (shirtSize[i] == "XL") result[4]++;
            else if (shirtSize[i] == "XXL") result[5]++;
        }*/

        // enum 코드로 바꿔보자 ==> enum 선언하고 오기
        for (int i = 0; i < shirtSize.length; ++i) {
//            MySize temp = MySize.valueOf("XL"); // valueOf 는 String 주면 매칭되는 타입을 enum타입으로 돌려줌
            MySize temp = MySize.valueOf(shirtSize[i]); // enum타입으로 숫자를 바꿀거야
            result[temp.ordinal()]++; // XS -> 0, S -> 1, 이런식으로 integer 타입으로 바꿈, Enum클래스 내부 상수들의 index를 리턴
        }
        return result;
    }

    // 2번 문제
    int[] solution2(int[] original) {
        int len = original.length;

        int[] result = new int[len];

        for (int i = 0; i < len; ++i) {
            result[i] = original[len - 1 - i];
        }
        return result;
    }

    // 3번 문제
    int solution3(int n) {
        // 원래 예외처리 해줘야함 , 음수항은 존재하지 않기 때문에
        int sum = 0;

        for (int i = 1; i <= n; ++i) {
            int ai = 4 * i - 2;
            sum += ai;
        }
        return sum;
    }

    // 4번 문제
    int solution4(int[] original) { // cf. unsigned int 하면 음수 X
        int result = 0;
        int len = original.length;

        // 배열을 입력, 어떤 수 x를 줬을 때 x가 배열안에서 몇 번 등장하는지 카운트하는 함수 만들자 private로!
        // 아래에서 함수 작성하고 오세용 private int countSame()

        int count = countSame(original, original[0]); // 제일 첫번째 함수가 몇개나 있니?
        int max = count; // 제일 첫번째거를 기준으로 삼자
        int min = count;

        for (int i = 1; i < original.length; ++i) {
            count = countSame(original, original[i]);
            if (count >= max) {
                max = count;
            }
            else if (count <= min) {
                min = count;
            }
        }

        result = max / min;

        // 함수 사용 안하려면 2중 for문
        // 똑같은 배열만들어서 카운팅해서 argmax, argmin 찾아도 됨 (shirtsize 처럼)

        return result;
    }

    // int x가 int 배열 arr에서 몇 번 등장하는지 리턴
    private int countSame(int[] arr, int x) {
        int count = 0;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }
}


public class MidTerm {
    public static void main(String[] args) {

        // 1번 문제 테스트
        Answer2 ans = new Answer2();
        String [] param1 = {"XXL", "XXL", "S", "M"};
        int [] ans1 = ans.solution1(param1);
        // java에서 배열출력하는 방법
        System.out.println(Arrays.toString(ans1));

        // 2번 문제 테스트
        int [] param2 = {1, 2, 3, 4, 5, 9999};
        int [] ans2 = ans.solution2(param2);
        System.out.println(Arrays.toString(ans2));

        // 3번 문제 테스트
        int param3 = 5;
        int ans3 = ans.solution3(param3);
        System.out.println(ans3);

        // 4번 문제 테스트
        int [] param4 = {99999, 1, 1, 2, 2, 2, 3, 3, 3, 3, 1, 1, 1, 1, 4, 4};
        int ans4 = ans.solution4(param4);
        System.out.println(ans4 + "배 입니다.");
    }
}
