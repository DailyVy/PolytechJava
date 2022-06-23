public class Example18 {
    public static void main(String[] args) {
        // 문자열을 정수로 변환할 때 발생하는 NumberFormatException을 처리하는 프로그램을 작성하라
        String[] stringNumber = {"23", "12", "3.141592", "998"};

        int i = 0;
        for (i=0; i<stringNumber.length; ++i) {
            try {
                int j = Integer.parseInt(stringNumber[i]); // 정수로 변환
                System.out.println("정수로 변환된 값은 " + j);
            }
            catch (NumberFormatException e) {
                System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
            }
        }

    }
}
