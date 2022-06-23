public class Sort {
    // 4. 선택 정렬 구현 : argMin, argMax, swap 구현하고 오시오
    // ascend 가 true 이면 오름차순, false 면 내림차순
    void selectionSort (int []a, boolean ascend) {
//        int key = a[0]; // 0번부터 시작하잖아~ ==> 왜 안쓰징
//        ==> 원래는 T타입으로 받아서 Sorting 하고 싶었대, 뭐 나이, 성별, 뭐 이런걸 골라서 sorting 하고 싶었다고...
        int targetIdx = 0; // 바꿔야 하는 target Index ==> 젤 큰거 찾아서 바꿀건지, 젤 작은거 찾아서 바꿀건지

        for (int i = 0; i < a.length; ++i) {
            if (ascend) { // ascend == true
                targetIdx = argMin(a, i);
            }
            else {
                targetIdx = argMax(a, i);
            }
            // 이제 바꾸면 되지
            swap(a, i, targetIdx);
        }
    }

    // 5. 버블 정렬 구현
    // ascend 가 true 이면 오름차순, false 면 내림차순
    void bubbleSort(int []a, boolean ascend) {
        for (int i = a.length-1; i >= 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (ascend) { // ascend == true, 큰게 오른쪽! (오름차순)
                    // a[j]가 a[j+1]보다 크면 swap
                    if (a[j] > a[j+1]) swap(a, j, j+1);
                }
                else { // 내림차순순
                   // a[j]가 a[j+1]보다 작으면 swap
                    if (a[j] < a[j+1]) swap(a, j, j+1);
                }
            }
        }
    }

    // 1. argMin
    // start index 부터 끝까지 중에서 가장 작은 원소가 들어있는 index 를 리턴
    // index 를 돌려줄거기 때문에 리턴은 int, 인자는 배열과 starting point 를 받을거야
    int argMin(int[] a, int startIdx) {
        // 1. 예외처리 : 배열은 항상 예외처리를 해줘야한다.
        if (startIdx < 0 || startIdx >= a.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        // 2. minValue는 일단 start index의 값, minIndex는 start index
        int minValue = a[startIdx];
        int minIndex = startIdx;

        // qna. startIdx 를 이미 줬으니 startIdx + 1부터 비교하면 되긴하다.
        //  근데 만약 배열이 하나짜리라면..? ==> Index가 나가겠지 ==> 예외처리를 하나 더 해줘야함
        //  그래서 startIdx부터 비교함
        for (int i = startIdx; i < a.length; ++i) {
            if(minValue > a[i]) {
                minValue = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // 2. argMax 만들어봅시다.
    // start index 부터 끝까지 중에서 가장 큰 원소가 들어있는 index 를 리턴
    int argMax(int[] a, int startIdx) {
        // 1. 예외처리 : 배열은 항상 예외처리를 해줘야한다.
        if (startIdx < 0 || startIdx >= a.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        // 2. minValue는 일단 start index의 값, minIndex는 start index
        int maxValue = a[startIdx];
        int maxIndex = startIdx;

        for (int i = startIdx; i < a.length; ++i) {
            if(maxValue < a[i]) {
                maxValue = a[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // 3. 배열에서 i 번 index 와 j 번 index 의 원소를 바꿈
   void swap(int[] a, int i, int j) {
        // 1. 예외처리
       if (i < 0 || i >= a.length || j < 0 || j >= a.length) {
           throw new ArrayIndexOutOfBoundsException();
       }
       // 2. 바꿔보자
       int temp = a[i];
       a[i] = a[j];
       a[j] = temp;
    }
}
