public class Example3 {
    public static void main(String[] args) {
        // do - while문으로 a~z까지 출력
        char alphabet = 'a';

        do {
            System.out.print(alphabet);
            ++alphabet; // alphabet = (char) (alphabet + 1);
        } while (alphabet <= 'z');
    }
}
