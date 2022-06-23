public class Recap0620 {

    int sum(int a, int b) {
        return a + b;
    }

    int max(int [] a) {
//        int maxVal = a[0]; // 입력에 음수가 있으면 maxVal = 0 으로 초기화할 시 버그생김
        int maxVal = Integer.MIN_VALUE; // Integer의 최소값은 Integer.MIN_VALUE;
//        int maxIdx = 0;

//        for (int i=0; i < a.length; i++) {
//            if (a[i] >= maxVal) {
//                maxIdx = i;
//                maxVal = a[i];
//            }
//        }

        for (int val : a) {
            if (val >= maxVal) {
                maxVal = val;
            }
        }

        return maxVal;
    }

    int min(int [] a) {
//        int minVal = a[0]; // 입력에 음수가 있으면 maxVal = 0 으로 초기화할 시 버그생김
        int minVal = Integer.MAX_VALUE; // Integer의 최소값은 Integer.MIN_VALUE;
//        int minIdx = 0;

//        for (int i=0; i < a.length; i++) {
//            if (a[i] <= minVal) {
//                minIdx = i;
//                minVal = a[i];
//            }
//        }

        for (int val : a) {
            if (val <= minVal) {
                minVal = val;
            }
        }

        return minVal;
    }

    double arrayAvg(int [] a) {
        double avr = 0;
//        for (int i = 0; i < a.length; i++) {
//            avr += a[i];
//        }
        for (int i : a) {
            avr += i;
        }

        avr /= a.length;

        return avr;
    }

    enum Week { MON, TUE, WED, THU, FRI, SAT, SUN }
    public static void main(String[] args) {
//        Week today = Week.MON;
        Week today = Week.valueOf("TUE");
        System.out.println(today);
        // 파일에서 뭔가 읽어왔을 때 String으로 되어있다.
        // String 값을 여기 집어넣었을 때 매칭되는 enum 값이 있으면 enum 타입으로 반환

        Recap0620 t1 = new Recap0620();

        System.out.println(t1.sum(1, 2));

        int [] intArray = {-1, -2, -3, -44, -4, -5, -6, -7, -99};

        System.out.println("Array의 평균은 " + t1.arrayAvg(intArray));
        System.out.println("Array max값은 " + t1.max(intArray));
        System.out.println("Array min값은 " + t1.min(intArray));
    }
}
