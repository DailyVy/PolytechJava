public class Exercise7 {
    public static void main(String[] args) {
        int [] intArray = new int[10];
        int sum = 0;
        System.out.print("랜덤한 정수들 : ");
        for(int i=0; i<intArray.length; i++) {
            // Math.random() : double형으로 0.0이상 1.0미만 사이의 값을 반환하는 함수
            intArray[i] = (int)(Math.random()*10 + 1);
            sum += intArray[i];
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.println("평균은 " + (double)sum/intArray.length);
    }
}
