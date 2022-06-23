class ABCDEF {
    static int n;
}


public class Java0512 {
    public int getSum(int i, int j) {
        return i + j;
    }
    public int getSum(int i, int j, int k){
        return i + j + k;
    }
    public double getSum(int i, float j){
        return i + j;
    }
    public int getSum(double i, double j) {
        return (int)i + (int)j;
    }


    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int n = 10;

        increase(n);


        // 2교시
       Java0512 a = new Java0512();

        System.out.println(a.getSum(1, 2));
        System.out.println(a.getSum(1, 2, 3));
        System.out.println(a.getSum(1, 2.0f));
        System.out.println(a.getSum(3.0, 4.0));

        // 4교시
        System.out.println(Math.PI);

        ABCDEF obj1 = new ABCDEF();
        obj1.n = 10;

        ABCDEF obj2 = new ABCDEF();
        obj2.n = 20;

        System.out.println(obj1.n);
        System.out.println(obj2.n);

    }

    static void increase(int m) {
        m = m + 1;
    }
}
