public class Example16 {
    public static void main(String[] args) {
        // 배열의 인덱스가 범위를 벗어날 때 생기는 예외 처리 프로그램
        // 배열 크기는 3
        int intArray[] = new int[5];
        intArray[0] = 0;
        try {
            for(int i = 0; i < 5; i++) {
                intArray[i+1] = i + 1 + intArray[i];
                System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
        }

    }
}
