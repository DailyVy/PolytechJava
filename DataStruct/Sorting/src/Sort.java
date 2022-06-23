import java.util.Arrays;

public class Sort {
    // 4. partition 함수 구현하기
    private int partition(int []a, int begin, int end) {
        int pivot = (begin + end) / 2;
        int L = begin;
        int R = end;
        // while loop를 줄건데 언제까지? L과 R이 만날 때까지
        //  L은 더하면서 커질거고, R은 빼면서 작아질거고 ==> !=로 줘버리면 크로스되서 안만나는 경우도 생긴대
        while (L < R) {
            // L과 pivot과 비교를 했을 때 작으면 한칸씩 오른쪽으로(L)
            //  혹시 모를 사고를 대비해서 예외처리도 넣어주자 (L<R)
            while ((a[L] < a[pivot]) && (L < R)) L++;
            // R과 pivot을 비교했을 때 크면 한칸씩 왼쪽으로(R) R이 L을 넘어가서는 안된다
            while ((a[R] >= a[pivot]) && (L < R)) R--;

            // L, R을 찾았으면 swap! L과 R의 위치를 바꿔야 한다.
            if (L < R) {
                int temp = a[L];
                a[L] = a[R];
                a[R] = temp;
            }
        } // end while

        // 더이상 L이 R보다 작지 않은 순간에 while문을 빠져나옴 (L==R)
        // 알고리즘 생각해봐. 만나면 어떻게 한다고? Pivot의 위치와 R의 위치를 바꾸고
        // 그 바뀐 위치가 Pivot의 위치가 된다.
        // pivot과 R의 위치를 바꾼다.
        int temp = a[pivot];
        a[pivot] = a[R];
        a[R] = temp;


        // 5. 단계별로 출력해보자
        // System.out.println(Arrays.toString(a));

        // todo 이거 왜..? return R인가?
        return R;
    }


    // 1. quickSort 만들기
    //  int배열 a[]를 정렬할거다.
    //  quickSort는 begin과 end가 있어야함
    //  begin부터 pivot-1까지, pivot + 1부터 end까지
    void quickSort(int [] a, int begin, int end) {
        // 3. if문 작성 (begin이 end를 만나는순간 멈춤)
        if (begin >= end) {
            return;
        }

        int pivot = 0;
        // 2. partition 함수 만들 예정임
        pivot = partition(a, begin, end); // 배열과 begin, end를 주면서 두 개를 쪼갠 위치를 pivot으로 받을거야

        quickSort(a, begin, pivot-1); // pivot을 기준으로 왼쪽 quickSort
        quickSort(a, pivot+1, end); // 오른족 quickSort
        // recursive function (재귀 함수) 함수 안에서 자기 자신을 부르는 것
        //  제일 중요한 건 종료 조건을 줘야 한다. 이게 없으면 무한 호출되서 뻗는다. ==> stackOverflow
        //  begin과 end가 같아지면 quickSort가 종료되는 거다 (원소가 하나 남았을 때!!) ==> if문을 작성해
    }
}
