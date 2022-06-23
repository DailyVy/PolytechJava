public class Exercise10 {
    public static void main(String[] args) {
        // 배열 안에는 아마 다 0으로 채워져 있을 거야, Java의 특징~ C는 초기화 해줘야한대
        int [][] int2D = new int[4][4];

        // 임의의 위치에 삽입하기...
        for(int cnt = 0; cnt < 10; cnt++) { // 10군데만 넣을거야
            int i = (int)(Math.random()*4); // 0, 1, 2, 3 => 인덱스 난수 생성하기
            int j = (int)(Math.random()*4);
            if(int2D[i][j] != 0) {
                cnt--;
                continue;
            }
            int2D[i][j] = (int)(Math.random()*10 + 1); // 1부터 10까지..
        }
        // 배열에서 꺼내와보자~
        for(int i = 0; i<int2D.length; i++) {
            for(int j = 0; j<int2D[i].length; j++) {
                System.out.print(int2D[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
