public class Example1 {
    public static void main(String[] args) {
        // 1~10까지 덧셈표시, 합출력
        int sum = 0;

        for(int i=1; i<=10; ++i) {
            sum += i;
            if (i<=9) {
                System.out.print(i+"+");
            }
            else {
                System.out.print(i + "=" + sum);
            }
        }
    }
}
