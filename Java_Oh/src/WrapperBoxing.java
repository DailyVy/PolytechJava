public class WrapperBoxing {
    public static void main(String[] args) {
        // Boxing
        int a = 5;
        Integer b = Integer.valueOf(a);

        // UnBoxing
        Integer c = Integer.valueOf(10);
        int d = c.intValue();

        String s = "  Hello  ";
        System.out.println(s.trim()); // trim은 공백제거해주는 메서드

        // StringBuffer클래스
        String str1 = "Hello";
        str1 = str1 + ", World!";
        System.out.println(str1);

        StringBuffer str2 = new StringBuffer("Hello");
        str2.append(", World?");
        System.out.println(str2);
    }
}
