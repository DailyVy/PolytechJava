public class Exercise9 {
    public static void main(String[] args) {
        int int2D[][] = new int[4][4];

        for(int i = 0; i< int2D.length; i++) {
            for (int j = 0; j < int2D[i].length; j++){
                int2D[i][j] = (int)(Math.random()*10 + 1); // 1부터 10까지 정수 랜덤
                System.out.print(int2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
