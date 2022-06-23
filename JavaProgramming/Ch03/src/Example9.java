public class Example9 {
    public static void main(String[] args) {
        // for - each문
        // for(변수:배열레퍼런스) {반복 작업문}
        // for 조건문에 값이 있으면 true, 없으면 false
        int []n = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int k : n) {
            sum += k;
        }
        System.out.println("합은 " + sum);
        // 문자열 배열
        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        for(String s:names) {
            System.out.print(s + " ");
        }
        System.out.println();
        // enum 타입
        enum Week {월, 화, 수, 목, 금, 토, 일}
        // enum변수명.values() : enum 클래스가 가지고 있는 모든 상수값을 배열의 형태로 리턴
        // .valueOf(String args) : String값을 enum에서 가져옴.
        for (Week day: Week.values()) {
            System.out.print(day + "요일 ");
        }
    }
}
