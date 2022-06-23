import java.util.Scanner;

public class Exercise4 {

    void mid(int first, int second, int third) {
        int middle = 0;

        if (first==second || second == third || third==first) {
            System.out.println("값이 중복됩니다.");
        }
        else if (first > second) {
            if (first < third) { // first 가 second보다 크고 third보다 작을 때
                middle = first;
            }
            else if (second > third) { // first가 second보다 크고 third보다 클 때, second가 third 보다 크면
                middle = second;
            }
            else {
                middle = third; // first가 second보다 크고 third보다 클 때, second가 third보다 작다면
            }
            System.out.println("중간 값은 " + middle);
        }
        else if (second > first) {
            if (second < third) { // second가 first보다 크고 third보다 작을 때
                middle = second;
            }
            else if (third < first) { // second가 first, third보다 클 때, third가 first보다 작다면
                middle = first;
            }
            else { // second가 first, third보다 크고, first가 third보다 작다면
                middle = third;
            }
            System.out.println("중간 값은 " + middle);
        }
        else if (third > first) {
            if (third < second) { // third가 first보다 크고 second보다 작다면
                middle = third;
            }
            else if (second < first) { // third가 first, second보다 클 때 first가 second보다 크다면
                middle = first;
            }
            else if (second > first) { // third가 first, second보다 클 때, second가 first보다 크다면
                middle = second;
            }
            System.out.println("중간 값은 " + middle);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개 입력>> ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        Exercise4 test = new Exercise4();

        test.mid(first, second, third);
        scanner.close();
    }
}
