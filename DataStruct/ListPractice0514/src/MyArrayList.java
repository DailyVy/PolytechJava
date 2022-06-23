public class MyArrayList<T> { // 리스트에 뭐가 들어갈지 모르겠다~ T타입!
    // 은닉합시다.... 접근한정자 이용해서~~~
    // private은 class 내부에서만 접근 가능
    private T[] array;
    private int size;
    private int MAX_SIZE = 3;

    MyArrayList() {
        array = (T[]) new Object[MAX_SIZE];
        size = 0;
    }
    // add() : 리스트 맨 마지막에 추가
    // T타입의 인자를 추가
    void add(T element) {
        // 1. 예외처리
        // 현재 사이즈가 최대치를 넘어설 경우 ==> 배열 두배로!!!
        if (size >= MAX_SIZE) {
            // 일단 기존의 배열을 저장할 T타입의 배열을 생성, 단 MAX_SIZE*2;
            MAX_SIZE = MAX_SIZE * 2;
            T[] temp = (T[])new Object[MAX_SIZE];
            // temp 배열에 기존 배열의 값을 저장하자
            for(int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp; // 그리고 그 temp가 array가 된다.
        }
        // 2. element추가
        array[size] = element;
        ++size;
    }
    // add() 오버로딩
    // add(index, T element)
    void add(int index, T element){
        // 1. 예외처리
        if (index < 0 || index > size) { // index == size라면 맨 마지막에 넣어주는 것과 같다.
            throw new IndexOutOfBoundsException();
        }
        // 2. index 자리에 추가
        // 어떻게할까? 일단 add함수를 불러오자
        add(element); // 맨마지막에 element를 추가했다. size도 늘어났다! element는 현재 array[size]에 위치
        // 그 다음에 index 자리로 옮기면 되지!!!
        for (int i = size-1; i > index; i--) {
            array[i] = array[i-1]; // i는 index가 되면 안된다.
        }
        array[index] = element; // 그리고 index 자리에 element를 다시 넣어주면 되지!
    }

    // get(index) : index번째 원소를 가져옴
    T get(int index) {
        // 예외처리 : 음수 인덱스와 size이상의 인덱스
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    // remove(index) : index 번째 원소 삭제
    // 지운거 리턴해줌
    T remove(int index){
        T retValue = get(index); // 리턴할 T타입의 값

        // 1. 예외처리
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size-1; i++) {
            array[i] = array[i+1]; //
        }
        --size;
        return retValue;
    }

    // size() : list 의 크기 리턴
    // size는 private으로 은닉되어 있어서...
    int size() {
        return size;
    }


    // clear() : 모든 원소 삭제
    void clear() {
        size = 0;
    }

}
