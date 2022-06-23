public class Example10 {
    public static void main(String[] args) {
        // 2차원 배열에 학년별로 1, 2학기 성적을 저장하고 4년간 전체 평점 평균을 출력하라
        // ...4학년까지인가????, 1~4학년 1,2학기
        double [][]score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
        double sum = 0;
        int cnt = 0;

        for(int year=0; year<score.length; year++){
            for(int term =0; term<score[year].length; term++){
                sum += score[year][term];
                cnt++;
            }
        }
        System.out.printf("4년 전체 평점 평균은 %.3f", sum/cnt);

    }
}
