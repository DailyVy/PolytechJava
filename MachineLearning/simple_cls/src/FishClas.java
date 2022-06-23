import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

enum FishType {Salmon, Bass}

public class FishClas {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("salmon_bass_data.csv");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine(); // 컬럼명 읽어오기

        int index = 0;
        int num_data = 318;
        int[] length_arr = new int[num_data];
        FishType[] label = new FishType[num_data];

        while (line != null) // Length를 배열에 넣어준다.
        {
            line = br.readLine();
            if (line == null) break;// 만약 라인이 null 이면 멈춥니다.

            String[] parse = line.split(","); // 각 요소가 String 형태로 분리된다.

            label[index] = FishType.valueOf(parse[0]); // String, 내가 정의한 것(enum에서)말고 다른 거 들어오면 error임을 보여주기 위해 열거 자료형 선택
            length_arr[index] = Integer.parseInt(parse[1]); // String => int
            ++index;
        }

//        for (int i = 0; i < num_data; ++i) // 잘 들어왔는지 확인
//        {
//            System.out.printf("%d : [%s %d]\n", i, label[i], length_arr[i]);
//        }

/*************************************길이 모델 만들기*****************************************/

//        int model_length = 10; // 기준
//        int n_hit = 0, n_miss = 0; // n_hit: 맞춘 갯수, n_miss: 틀린 갯수
//
//        for(int i = 0; i < num_data; ++i)
//        {
//            FishType model_decision;// 모델 결과의 답을 결정할 거야
//
//            // 기준 길이보다 길면 Bass
//            if (length_arr[i] > model_length)
//            {
//                model_decision = FishType.Bass;
//            }
//            else
//            {
//                model_decision = FishType.Salmon;
//            }
//
//            // 이제 label과 비교해서 맞췄는지 판단!!
//            if (model_decision == label[i])
//            {
//                ++n_hit;
//            }
//            else
//            {
//                ++n_miss;
//            }
//
//
//        } // end for
//
//        System.out.printf("hit = %d, miss = %d\n", n_hit, n_miss);

/*************************************실습 : 분류율 가장 높은 x찾기*****************************************/

        int n_hit = 0, n_miss = 0; // n_hit: 맞춘 갯수, n_miss: 틀린 갯수
        int min = 2, max = 26; // 길이의 min, max
        int max_hit = 0; // maximum hit 초기화
        int hit_length = 0; // hit가 max일 때 길이값
        double accuracy = 0; // 정확도 선언


        for(int model_length = min; model_length < max +1; model_length++) // 길이 2~ 26까지
        {
            n_hit = 0;
            n_miss = 0;
            for(int i = 0; i < num_data; ++i) // 모든 데이터 값 비교 length_arr[i] label[i]
            {
                FishType model_decision;

                if(length_arr[i]> model_length) // 기준 길이보다 길면 Bass
                {
                    model_decision = FishType.Bass;
                }
                else
                {
                    model_decision = FishType.Salmon;
                }

                if(model_decision == label[i]) // 이제 label과 비교해서 판단
                {
                    ++n_hit;
                }
                else
                {
                    ++n_miss;
                }
            }
            if (max_hit < n_hit) // 그리고 나온 hit값이 max_hit보다 크면 그 값이 max_hit, 그 때 길이 값이 분류율이 제일 높은 x값
            {
                max_hit = n_hit;
                hit_length = model_length;
                accuracy = max_hit*1.0/num_data * 100;
            }

        } // end for

        System.out.printf("max_hit 개수는 %d, 그 때 길이는 %d, 이 때 정확도는 %.2f %%", max_hit, hit_length, accuracy); // 길이가 11이 나와야함

    } // end of main func.
}
