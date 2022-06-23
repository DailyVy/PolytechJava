// 파일을 읽어와보자

import java.io.FileReader;
import java.io.IOException;

public class InputStream0609 {
    public static void main(String[] args) {
        FileReader fin = null;
        try {
            fin = new FileReader("result.txt");
            int c;
            while((c = fin.read()) != -1) { // 한 문자씩 파일 끝까지 읽는다.
                System.out.print((char)c); // c가 int 형인데 문자가 들어오면 ASCII에 의한 값이 리턴되니까 캐스팅
            }
            fin.close();
        }
        catch (IOException e) {
            System.out.println("파일 입력 오류");
        }
    }
}
