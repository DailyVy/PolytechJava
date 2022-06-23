import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ForSorting {
    public static void main(String[] args) {
        Sort sort = new Sort();

        int [] data = {69, 10, 30, 2, 16, 8, 31, 22};

        //argMin 테스트
        /*for (int i = 0; i < data.length; ++i) {
            System.out.println(sort.argMin(data, i));
        }*/

        // argMax 테스트
        /*for (int i = 0; i < data.length; ++i) {
            System.out.println(sort.argMax(data, i));
        }*/

        // swap 테스트
        // selection sort (ascending)
        for (int i = 0; i < data.length; ++i) {
            int minIdx = sort.argMin(data, i);
            sort.swap(data, i, minIdx);
            System.out.println(Arrays.toString(data)); // 배열 한번에 봅시다. Arrays.toString(배열)
        }

        sort.selectionSort(data, false); // 내림차순으로 정렬해보자
        System.out.println(Arrays.toString(data)); // 배열 한번에 봅시다. Arrays.toString(배열)

        sort.bubbleSort(data, true); // bubble sort로 다시 오름차순 해보자
        System.out.println(Arrays.toString(data)); // 배열 한번에 봅시다. Arrays.toString(배열)


        Sort sort2 = new Sort();
        int [] test = {25};
        System.out.println(sort2.argMax(test, 0));
    }



}
