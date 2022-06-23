import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("salmon_bass_data.csv");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine(); // 컬럼명이라 버립니다~
        int num_data = 318;
        int[] length_arr = new int[num_data];
        int index = 0;
/************************** parse 배열에 해당 데이터의 length값 집어넣기************************************/
        while (line != null) // Length를 배열에 넣어준다.
        {
            line = br.readLine();
            if (line == null) break;// 만약 라인이 null 이면 멈춥니다.
            String[] parse = line.split(",");
            length_arr[index] = Integer.parseInt(parse[1]); // 이제 string아니고 integer
            ++index; // index = index + 1; 이렇게 하면 메모리를 두번 읽기 때문에
            // 파이썬에서는 index += 1이라 쓰고, C나 자바에서는 ++index; 라고 써
        }
/************************** parse 배열에 length값 잘 들어갔는지 보기************************************/
//        for (int i=0; i<num_data; i++)
//        {
//            System.out.printf("%d\n", length_arr[i]);
//        }

/************************** max, min 값 구하기  ***********************************/
        // 값의 초기화가 반드시 필요
        int min = length_arr[0], max = length_arr[0];

        for (int i = 1; i < num_data; ++i) // 왜 1부터 시작하지???
        // 이미 min, max를 length_arr[0]으로 조건을 줘서?
        // 왜 num_data 미만이지?
        // 아, 인덱스니까 317까지 있겠구나
        {
            // 비교
            if (min > length_arr[i]) // 이러면 더이상 min이 아니다
            {
                min = length_arr[i]; // min을 교체
            }

            if (max < length_arr[i]) // 이러면 더이상 max가 아니다
            {
                max = length_arr[i];
            }
        } // end for
//        System.out.printf("min = %d, max = %d\n", min, max); // min = 2, max = 26

/************************** 각 길이에 해당하는 생선의 개수 - 히스토그램 ***********************************/
        int[] histogram = new int[27]; // 길이 0 ~ 26 배열(min:2, max:26)
        int cnt;

        for (int j = 0; j < max + 1; ++j) // 길이값 max 가 26이니까 27 미만까지 볼거야
        {
            cnt = 0; // 카운트 초기화
            for (int i = 0; i < num_data; ++i) // 318개의 길이 데이터를 다 볼거야
            {
                if (length_arr[i] == j) {
                    ++cnt;
                }
                histogram[j] = cnt;
            }
        }
/************************** 길이 값 각각 보기 ***********************************/
        for (int k = 2; k < 27; ++k) {
//            System.out.printf("길이: %d는 %d개 있습니다.\n", k ,histogram[k]);
            System.out.printf("길이 %d] %s %d개\n", k, "-".repeat(histogram[k]), histogram[k]);
        }

    } // end main
}