public class Example4 {
    public static void main(String[] args) {
        //이중중첩으로 구구단 만들기

        for (int i = 1; i < 10; ++i) {
            for(int j = 1; j < 10; ++j) {
                int result = i * j;
                System.out.print(i + "*" + j + "=" + result + "\t");
            }
            System.out.println();
        }
    }
}
