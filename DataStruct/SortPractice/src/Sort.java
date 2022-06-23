import java.util.Arrays;

public class Sort {
    private void swap(int[]a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private int partition(int[]a, int begin, int end, boolean ascending) {
//        int pivot = (begin + end) / 2;
        int pivot_loc = (begin + end) / 2;
        int pivot = a[pivot_loc];
        int L = begin;
        int R = end;
        System.out.println(pivot);
        System.out.println(pivot_loc);

//        if (ascending) {
//            while (L < R) {
//                while ((a[L] < pivot) && (L < R)) L++;
//                while ((a[R] >= pivot) && (L < R)) R--;
//                if (L < R) swap(a, L, R);
//            }
//            swap(a, pivot_loc, R);
//        }
//        else {
//            while (L < R) {
//                while ((a[L] > pivot) && L < R) L++;
//                while ((a[R] <= pivot) && L < R) R--;
//                if (L < R) swap(a, L, R);
//            }
//        }
        while (L < R) {
            if (ascending) {
                while ((a[L] < pivot) && (L < R)) L++;
                while ((a[R] >= pivot) && (L < R)) R--;
            }
            else {
                while ((a[L] > pivot) && (L < R)) L++;
                while ((a[R] <= pivot) && (L < R)) R--;
            }
            if (L < R) swap(a, L, R);

        }


//        swap(a, pivot_loc, R);
        System.out.println(pivot);
        System.out.println(Arrays.toString(a));
//        System.out.println(a[R]);


        return R;
    }

        // ascending 이 True면 오름차순, False면 내림차순
    void quickSort(int []a, int begin, int end, boolean ascending) {

        if (begin >= end) {
            return;
        }
        int pivot = 0;
        pivot = partition(a, begin, end, ascending);
        quickSort(a, begin, pivot-1, ascending);
        quickSort(a, pivot+1, end, ascending);
    }
}
