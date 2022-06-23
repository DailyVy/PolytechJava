import java.util.Arrays;

public class Main0608 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Sort s = new Sort();
        int[] data = {69, 10, 30, 2, 16, 8, 31, 22};

        s.quickSort(data, 0, data.length-1); // data배열 집어넣고 0부터 인덱스 끝까지 quickSort실행
        System.out.println(Arrays.toString(data)); // 최종 결과만 보자
    }
}
