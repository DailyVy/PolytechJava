public class Datatype {
    public static void main(String[] args) {
        System.out.println(6); // Number
        System.out.println("six"); // String

        System.out.println("6"); // String 6

        System.out.println(6+6); // 12
        System.out.println("6"+"6"); // 66 여기서 + 는 결합연산자(문자열)

        System.out.println(6*6); // 36
//        System.out.println("6"*"6"); // 에러 생김!! 문자열은 * 연산을 할 수 없다.

        System.out.println("1111".length()); // 4, length()는 문자열의 길이를 알려주는 메소드
//        System.out.println(1111.length()); // 숫자의 길이를 알려주는 메소드는 없다.
    }
}
