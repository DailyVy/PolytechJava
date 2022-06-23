// 파일을 저장해보자

import java.io.FileWriter;
import java.io.IOException;

public class Stream0609 {
    public static void main(String[] args) {  // {throws IOException
        FileWriter fout = null; // 일단 null부터 주세요.

        // todo 파일 입출력은 try catch
        try {
            // fout은 출력 스트림
            fout = new FileWriter("result.txt"); // 결과를 result.txt에 저장
            // 1부터 100까지 저장
            for(int i = 1; i <= 100; i++) {
                fout.write(i + " line\n");
            }
            fout.close(); // 입력 다했으면 스트림을 꺼 주세요!
        }
        catch (IOException e) {
            System.out.println("파일 출력 오류");
        }
     }
}
