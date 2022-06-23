public class Example12 {
    static int[] makeArray(){
        int temp[] = new int[4];
        for(int i = 0; i < temp.length; i++) {
            temp[i] = i+1;
        }
        return temp;
    }
    static int[] makeArray2(){
        return new int [3];
    }
    int [][] make2DArray(){
        return new int[3][4];
    }
    public static void main(String[] args) {

        int []intArray = makeArray();
        for (int k:intArray){
            System.out.print(k + " ");
        }

        int []intArray2 = makeArray2();
        intArray2[0] = 1;
        intArray2[1] = 2;
        intArray2[2] = 3;
//        intArray2[3] = 4;
    }
}
