public class ArrayPassingEx {
    // 전역변수로 선언하면 요렇게 된다.
    static char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ',
            'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.'};

    static void replaceSpace() {
        for (int i = 0; i < c.length; i++) {
            if(c[i] == ' '){
                c[i] = ',';
            }
        }
    }

    static void printCharArray() {
        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        printCharArray();
        replaceSpace();
        printCharArray();
    }
}
