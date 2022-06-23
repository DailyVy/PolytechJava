public class CheckPoint2 {
    public static void main(String[] args) {
        // 1. 10개의 정수를 저장하는 배열 tenArray 선언, 생성
        int []tenArray = new int[10];

        // 2. 배열 tenArray의 크기를 어떻게 알아낼 수 있는가?
        System.out.println(tenArray.length);

        // 3. 배열 tenArray에 1~10까지 저장한 뒤, 모든 원소의 값을 더하여 출력하는 프로그램 작성
        int sum = 0;
        for (int i=0; i<tenArray.length; i++) {
            tenArray[i] = i+1;
            sum += tenArray[i];
        }
        System.out.println("tenArray배열의 모든 원소의 합은 " + sum);
        // 다르게 출력해보자
        int sum2 = 0;
        for (int k:tenArray){
            sum2 += k;
        }
        System.out.println("tenArray배열의 모든 원소의 합은 " + sum2);
    }
}
