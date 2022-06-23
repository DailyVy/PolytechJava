import java.util.Scanner;

public class OpenChallenge {
    public static void main(String[] args) {
        //todo. 다시 코드 짜야함
        Scanner scanner = new Scanner(System.in);


        String YesNo = "y";

        while(true){
            System.out.println("수를 결정하였습니다. 맞추어 보세요.");
            System.out.println("0-99");
            int i = 0;
            int max = 99;
            int min = 0;
            int randomVal = (int)(Math.random()*99); // 0 ~ 99사이의 랜덤 숫자

            while (YesNo.equals("y")) {
                System.out.print(++i + ">>");
                int inputVal = scanner.nextInt();
                if(inputVal>randomVal) {
                    max = inputVal;
                    System.out.println("더 낮게");
                    System.out.println(min + "-" + max);
                }
                else if (inputVal<randomVal) {
                    min = inputVal;
                    System.out.println("더 높게");
                    System.out.println(min + "-" + max);
                }
                else {
                    System.out.println("맞았습니다.");
                    System.out.print("다시 하시겠습니까(y/n)>>");
                    YesNo = scanner.next();
                    break;
                }
            }
            if (YesNo.equals("n")) break;
        }

    }
}
