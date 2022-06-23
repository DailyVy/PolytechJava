public class Casting {
    public static void main(String[] args) {

        double a = 1.1;
        double b = 1; // double에 int값을 넣어도 에러가 나지는 않음
        double b2 = (double) 1;
        System.out.println(b);
        System.out.println(b2);

//        int c = 1.1; // 하지만 int에 double을 담으려면 에러난다 ==> 데이터의 손실이 일어나기 때문에
        double d = 1.1;
        int e = (int) 1.1; // cast to 'int'
        System.out.println(e);

        // 1 to String
        String f = Integer.toString(1);
        System.out.println(f);
        System.out.println(f.getClass()); // .getClass() 변수가 갖고 있는 값이 어떤 데이터타입인지 알려주는 메서드
    }
}
