import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PracticeML0424 {
    public static void main(String[] args) throws IOException{ // main 함수에서 예외를 throws
        // FileNotFoundException은 IOException으로부터 상속된 것,
        // 즉 FileNotFoundException도 IOException이기 때문에 IOException만 처리해줘도 무방

        // FileReader fr = new FileReader("salmon_bass_data.csv");
        // 에러발생 : java.io.FileNotFoundException;
        FileReader fr = new FileReader("./salmon_bass_data.csv");
        BufferedReader br = new BufferedReader(fr); // 한 줄씩 읽고싶을 때 BufferedReader

        // 파일이 없는 경우 error 처리 ==> try/catch
        /*try {
            fr = new FileReader("../salmon_bass_data.csv");
            br = new BufferedReader(fr);

            String line = br.readLine(); //java.io.IOException
        }
        catch(FileNotFoundException e) { // error니까 e라고 합시다
            e.printStackTrace(); // 리턴값이 없다.
        }
        catch (IOException e) {
            e.printStackTrace();
        }*/

        // readline() 은 \ 나올 때까지 읽어주는 것
        /*String line = br.readLine();
        System.out.println(line);

        line = br.readLine();
        System.out.println(line);*/

        /*String line = br.readLine(); // 컬럼명
        System.out.println(line); // Class,Length,Lightness

        String[] parse = line.split(","); // , 로 나눠진 것을 분리해서 배열에~
        System.out.println(parse[0]); // Class
        System.out.println(parse[1]); // Length

        line = br.readLine();
        parse = line.split(",");
        System.out.println(parse[1]); // 2 : Salmon,2,0.8의 2*/

        // 이제 while 문으로 전부 읽어보자
        String line= br.readLine(); // 컬럼명

        /*while(line != null) {
            // line = br.readLine();
            String[] parse = line.split(",");
            System.out.printf("[%s] [%s] [%s]\n", parse[0], parse[1], parse[2]);
            line = br.readLine();
        }*/

        /*while(line != null) {
            line = br.readLine();

            if (line == null) {
                System.out.println("It's the last line. There is nothing");
            }
            String[] parse = line.split(",");
            System.out.printf("[%s] [%s] [%s]\n", parse[0], parse[1], parse[2]);
        }*/

        // do while 로 작업해보자
        /*do {
            String[] parse = line.split(",");
            System.out.printf("[%s] [%s] [%s]\n", parse[0], parse[1], parse[2]);
            line = br.readLine();

        } while(line != null);*/

        // 이제 record길이가 얼마인지 세보자
        int cnt = 0;

        while(line != null){
            String[] parse = line.split(",");
            System.out.printf("%d번째 줄을 읽었습니다.\n", cnt);
            System.out.printf("[%s] [%s] [%s]\n", parse[0], parse[1], parse[2]);
            line = br.readLine();

            if (line != null) {
                ++cnt;
            }
        }
        System.out.println(cnt);

    }
}
