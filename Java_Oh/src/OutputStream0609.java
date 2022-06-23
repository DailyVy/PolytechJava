// 기존 파일에 내용을 추가해서 출력해봅시다.
import java.io.FileWriter;
import java.io.IOException;

public class OutputStream0609 {
    public static void main(String[] args) {
        FileWriter fout = null;

        try {
            fout = new FileWriter("result.txt", true); // true이면 append

            for (int i = 101; i <= 200; i++) {
                fout.write(i + " line\n"); //
            }
            fout.close();
        }
        catch (IOException e) {
            System.out.println("파일 출력 오류");
        }
    }
}
