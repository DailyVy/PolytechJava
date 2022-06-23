import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

enum FishType {Salmon, Bass}

public class SalmonBass {
    public static void main(String[] args) throws IOException { // try ~ catch 대신 throws IOException
        FileReader fr = new FileReader("salmon_bass_data.csv");
        BufferedReader br = new BufferedReader(fr); // 자바에서 한 줄씩 읽고싶을 때 BufferedReader사용
        String line = br.readLine(); // 맨 위에 컬럼명을 읽어올거야

        int num_data = 318; // 데이터 개수 318개 (컬럼명을 제외한 데이터 길이)
        int index = 0;
        // length를 저장할 int 배열
        int[] length_arr = new int[num_data];
        // type을 저장할 FishType 배열 => 정답임
        FishType[] label = new FishType[num_data];


        // length 를 배열에 넣어준다.
        while (line != null) {
            line = br.readLine();
            if (line == null) break; // 만약 라인이 null 이면 멈춘다.

            String[] parse = line.split(","); // csv 파일이잖아. ","로 나눠져 있는데 이걸 기준으로 나눠서 배열에 넣어줄거야

            // label에는 Salmon인지 Bass인지 들어가겠지
            label[index] = FishType.valueOf(parse[0]);
            // 그냥 parse[1] 하면 String이라서... Integer로 변환해야해, length_arr는 int 배열이야
            length_arr[index] = Integer.parseInt(parse[1]);
            ++index;
        }
//        System.out.println(Arrays.toString(label)); // label 안에 잘 들어갔는지 보자
//        System.out.println(label.length); // 318개 잘들어갔네

        // 인덱스, FishType, 길이 보기기
//       for (int i = 0; i < num_data ; ++i) {
//            System.out.printf("%d : [%s %d]\n", i, label[i], length_arr[i]);
//        }

        // 길이 모델을 써서 길이 x 보다 크면 bass, 이하면 salmon
//        int model_length = 10;
//        int n_hit = 0, n_miss = 0;
//
//        for (int i = 0; i < num_data; i++) {
//            FishType model_decision;
//
//            if (length_arr[i] > model_length) {
//                model_decision = FishType.Bass;
//            } else {
//                model_decision = FishType.Salmon;
//            }
//
//            if (model_decision == label[i]) {
//                n_hit++;
//            } else {
//                n_miss++;
//            }
//        }
//
//        System.out.printf("hit = %d, miss = %d\n", n_hit, n_miss);

/*************************************실습 : 분류율 가장 높은 x찾기*****************************************/

        int n_hit , n_miss; // 맞추는 개수, 틀리는 개수
        int x = 0; //가장 높은 분류율을 보이는 x
        int hit_max = 0, miss_min = 0;
        // 배열의 최소, 최댓값 구하기
        // 1. Stream 이용
        // 배열의 최솟값을 구하기 위해 배열을 Stream 형태로 만들어주고
        // 최소값을 구한 뒤 그 값을 int형태로 꺼내온다(getAsInt())
//        int min = Arrays.stream(length_arr).min().getAsInt(); // 2
//        int max = Arrays.stream(length_arr).max().getAsInt(); // 26
//
//        // 2. for문 이용
        int min = length_arr[0], max = length_arr[0];
        for (int i = 0; i < length_arr.length; i++) {
            if (min > length_arr[i]) {
                min = length_arr[i];
            }
            if (max < length_arr[i]) {
                max = length_arr[i];
            }
        }
//        System.out.println(min + " " + max);
        for (int len = min; len <= max; len++) {
            n_hit = 0;
            n_miss = 0;
            for (int i =0; i < num_data; i++) {
                FishType model_decision;

                if(length_arr[i] > len) {
                    model_decision = FishType.Bass;
                }
                else {
                    model_decision = FishType.Salmon;
                }

                if(model_decision == label[i]) {
                    n_hit++;
                }
                else {
                    n_miss++;
                }
            }
            if (n_hit > hit_max) {
                hit_max = n_hit;
                miss_min = n_miss;
                x = len;
            }
        }

        System.out.println("최적의 길이는 " + x + " 그 때 맞춘 개수는 " + hit_max + ", 틀린 개수는 " + miss_min);
        System.out.printf("분류율은 %.2f%%", (double)hit_max/(hit_max + miss_min) * 100);
        System.out.println();
//
/*************************************실습 : 히스토그램으로 x찾기*****************************************/

        // max값이 26인데 우리는 인덱스로 길이를 판단할거야, 그러니까 배열 길이는 27이어야 인덱스는 26까지 가
        int [] salmonHist = new int[max+1];
        int [] bassHist = new int[max+1];
        int count;

        // salmonHist에 salmon의 길이별 개수를 넣어주자
        for(int i = 0; i < salmonHist.length; i++) { // 길이를 돌립시다.
            count = 0; // 카운트 초기화
            for (int j = 0; j < num_data; j++) { // length_arr랑 label을 전부 다 볼거야
                if(label[j] == FishType.Salmon) { // 만약 FishType이 Salmon이고
                    if(length_arr[j] == i) { // length_arr가 인덱스 즉 길이랑 같다면
                        count++; // 카운트를 해준다.
                    }
                }
                salmonHist[i] = count; // 그 카운트 값을 넣어주자
            }
        }
        System.out.println(Arrays.toString(salmonHist));

        // bassHist에 bass의 길이별 개수를 넣어주자
        for(int i = 0; i < bassHist.length; i++) {
            count = 0;
            for (int j = 0; j < num_data; j++) {
                if (label[j] == FishType.Bass) {
                    if(length_arr[j] == i) {
                        count++;
                    }
                }
            }
            bassHist[i] = count;
        }
        System.out.println(Arrays.toString(bassHist));

        // salmon과 bass의 길이별로 개수를 카운트 해주었다.
        // 이제 가장 적절한 y를 찾아봅시다. ==> index로 찾아야겠지
        int y;

        // y 이상 값이 bass라고 할 때
        int max_hit = 0;
        int hit = 0;
        int len = 0;
        for(y = 0; y < salmonHist.length; y++) {
            int salmonSum = 0; // y 이하 salmon hit 합
            int bassSum = 0; // y 초과 bass hit 합
            for (int i = 0; i <= y; i++) {
                salmonSum += salmonHist[i];
            }
            for (int i = y + 1; i < bassHist.length; i++) {
                bassSum += bassHist[i];
            }
            hit = salmonSum + bassSum;
            if (max_hit < hit) {
                max_hit = hit;
                len = y;
            }
//            System.out.println(hit);
        }
        System.out.println("히스토그램으로 한 결과");
        System.out.println("최적의 길이는 " + len + " 그 때 맞춘 개수는 " + max_hit);
        System.out.printf("분류율은 %.2f%%" , (double)max_hit/num_data * 100);

    }
}
