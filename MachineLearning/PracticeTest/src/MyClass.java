import java.util.ArrayList;

class Answer {

    // 문제 1번
    int [] solution1 (String[] shirt_size) {
        int len = shirt_size.length;
        System.out.println("입력 배열의 길이는 " + len + " 입니다.");

        int [] result = new int[6]; // 사이즈는 항상 6이다.

        /* 코드 작성하기 */
        String[] shirt = {"XS", "S", "M" , "L", "XL", "XXL"};

        for (int i = 0; i < shirt.length; ++i) {
            int cnt = 0;
            for (int j = 0; j < len; ++j) {
                if (shirt_size[j] == shirt[i]) {
                    ++cnt;
                }
            }
            result[i] = cnt;
        }

        return result;
    }
    // 문제 2번
    int [] solution2 (int[] original) {
        int len = original.length;
        System.out.println("입력 배열의 길이는 " + len + " 입니다.");

        int [] result = new int[len];
        /* 코드 작성하기 */
        for (int i = 0; i < len; ++i) {
            result[i] = original[len-1-i];
       }
        return result;
    }
    // 문제 3번
    int solution3 (int n) {
        System.out.println(n + "항 까지의 합을 구합니다.");

        int result = 0;

        /* 코드 작성하기 */
        // 등차수열 2, 6, 10, 14 의 일반항은 4n-2
        for (int i = 1; i <= n ; ++i) {
            int a_n = (4*i) - 2;
            result += a_n;
        }

        return result;
    }

    // 문제 3번, 첫째항, 공차, n항 입력받기
    double solution3 (double a, double d, int n) {

        System.out.println("첫째항이 " + a + " 이고, 공차가 " + d + "인 " + n + "항 까지의 합을 구합니다.");

        double result = 0;
        // 등차수열 일반항 an = a + (n-1)*d
        for (int i = 1; i <= n ; ++i) {
            double an = a + ((i-1) * d);
            result += an;
        }
        return result;
    }

    // 문제 4번
    int solution4 (int[] original) {
        int len = original.length;
        System.out.println("입력 배열의 길이는 " + len + " 입니다.");

        int result = 0;

        /* 코드 작성하기 */
        // 이건 가장 작은 원소, 큰 원소 비교한 거 ==> 문제 잘못 품
        /*int min_hit = 0;
        int max_hit = 0;
        int minValue = original[0];
        int maxValue = original[0];

        for(int i = 0; i < len; ++i) {
            // 최소값 찾기
            if (original[i] <= minValue) {
                minValue = original[i];
            }
            // 최대값 찾기
            else if (original[i] >= maxValue) {
                maxValue = original[i];
            }
        }
        // 이제 min_hit, max_hit count
        for (int i = 0; i < len; ++i) {
            if (original[i] == minValue) {
                ++min_hit;
            }
            if (original[i] == maxValue) {
                ++max_hit;
            }
        }

        result = max_hit/min_hit;*/
        // 이게 진짜 답안! 가장 적은 원소, 가장 많은 원소 비교
        ArrayList <Integer> cntList = new ArrayList();
        for (int i=0; i < len; ++i) {
            int cnt=0;
            for(int j=0; j< len;++j) {
                if(original[i] == original[j]) {
                    cnt++;
                }
            }
            cntList.add(i, cnt);
        }
        int minValue = cntList.get(0);
        int maxValue = cntList.get(0);

        for (int i = 1; i < cntList.size(); ++i) {
            if (minValue >= cntList.get(i)) {
                minValue = cntList.get(i);
            }
            else if(maxValue <= cntList.get(i)){
                maxValue = cntList.get(i);
            }
        }

        result = maxValue/minValue;

        return result;
    }
}

public class MyClass {
    public static void main(String[] args) {
        System.out.println("AI-Enginnering - 최비결");

        Answer ans = new Answer();

        // 문제 1번 테스트
        String[] param1 = {"XL", "XXL", "S", "M", "M"};
        int[] result_1 = ans.solution1(param1);

        System.out.print("[");
        for (int i = 0; i < result_1.length; ++i) {
            System.out.print(result_1[i] + ", ");
        }
        System.out.println("]");

        // 문제 2번 테스트
        int[] param2 = {4, 5, 2, 6, 7};
        int[] result_2 = ans.solution2(param2);

        System.out.print("[");
        for (int i = 0; i < result_2.length; ++i) {
            System.out.print(result_2[i] + ", ");
        }
        System.out.println("]");


        int[] test2 = {4, 5, 1, 2, 5, 8, 6, 7};
        int[] result_test2 = ans.solution2(test2);

        System.out.print("[");
        for (int i = 0; i < result_test2.length; ++i) {
            System.out.print(result_test2[i] + ", ");
        }
        System.out.println("]");

        // 문제 3번 테스트
        int param3 = 1;
        int result_3 = ans.solution3(param3);

        System.out.println(param3 + "항 까지의 합은 " + result_3 + " 입니다.");

        int test3 = 10;
        double result_test3 = ans.solution3(1, 1, test3);
        System.out.println(test3 + "항 까지의 합은 " + result_test3 + " 입니다.");

        // 문제 4번 테스트
        int[] param4 = {1, 1, 1, 2, 2, 2, 2, 2, 2, 2,2,2,2,2,2, 3};
        int result_4 = ans.solution4(param4);

        System.out.println("가장 작은 원소와 가장 큰 원소는 " + result_4 + " 배 차이 입니다.");
    }
}
