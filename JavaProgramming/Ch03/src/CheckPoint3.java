public class CheckPoint3 {
    char[] makeCharArray(){
        char [] c = new char[4];
        return c;
    }
    public static void main(String[] args) {
        //2. 2x3 2차원 배열 생성
        int [][]int2DArray = new int[2][3];
        //3. makeCharArray()작성하기

        //4. 비정방형 배열 생성
        int [][]intArray = new int[4][];
        intArray[0] = new int[4];
        intArray[1] = new int[1];
        intArray[2] = new int[1];
        intArray[3] = new int[4];

        int temp = 0;
        for(int i = 0; i<intArray.length; i++) {
            for(int j = 0; j < intArray[i].length; j++){
                intArray[i][j] = temp;
                System.out.print(intArray[i][j] + " ");
                temp++;
            }
            System.out.println();
        }


    }
}
