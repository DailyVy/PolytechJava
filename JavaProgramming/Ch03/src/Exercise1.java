public class Exercise1 {
    public static void main(String[] args) {
        int sum=0, i = 0;
        while(i<100) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);

        // for문
        int sum2 = 0;
        for(int j = 0; j < 100; j += 2) {
            sum2 += j;
        }
        System.out.println(sum2);

        // do-while문
        int sum3 = 0, k = 0;
        do {
            sum3 += k;
            k += 2;
        } while(k < 100);
        System.out.println(sum3);
    }
}
