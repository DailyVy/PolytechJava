public class Exercise13 {
    public static void main(String[] args) {

        for(int i = 1; i < 100; i++) {
            int tens = i / 10;
            int units = i % 10;
            if (units == 3 || units == 6 || units == 9) {
                System.out.print(i + " 박수 ");
                System.out.print("짝");
                if (tens == 3 || tens == 6 || tens == 9) {
                    System.out.print("짝");
                }
                System.out.println();
            }
        }

    }
}
