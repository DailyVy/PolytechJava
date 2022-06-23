public class MyArrayList<T> { // 무슨 타입이 들어갈지는 모르겠는데 T타입이 들어갈 거다
    // 멤버 변수
    private int size; // 외부에서 이 멤버변수에 접근하지 못하게 할 거다. ==> 바로 이게 은닉!! (클래스 특징 중 하나!)
    private T[] array; // 리스트에 T 타입이 들어올 거다.
    private int MAX_SIZE = 2;

    public MyArrayList() {
        array = (T[]) new Object[MAX_SIZE]; // T타입으로 캐스팅을 한다. array는 object타입으로~
        size = 0;
    }

    void add(T element) { // 이 클래스에 들어오는 거는 전부다 타입이 T다! 그래서 element도 타입이 T다.
        // size 가 MAX_SIZE를 넘어갈 경우 예외처리로 에러 발생시킴
        if (size >= MAX_SIZE) {
            // 예외처리 말고 Array size를 늘이고 싶은 경우는??
            /*// 기존의 데이터를 복사해 두고 Array를 더 큰 사이즈로 새로 만들자
            // 임시 Array 만들자 (copy Array) ==> 3번 for문 실습으로
            T[] temp = (T[]) new Object[MAX_SIZE];
            // 더 큰 Array 만들기
            array = (T[]) new Object[MAX_SIZE * 2];*/

            // 예외처리
//             throw new IndexOutOfBoundsException();

            // 1. 다른 방법으로 Array를 늘려보자
            /*T[] temp = (T[]) new Object[MAX_SIZE];
            System.arraycopy(array, 0, temp, 0, size);
            array = (T[]) new Object[MAX_SIZE*2];
            System.arraycopy(temp, 0, array, 0, size);
            MAX_SIZE *= 2;*/

            // 2. System.arraycopy 한번만 사용해서 해보자
/*            T[] bigger = (T[]) new Object[MAX_SIZE * 2];
            System.arraycopy(array, 0, bigger, 0, size);
            array = bigger;
            MAX_SIZE *= 2;*/

            // 3. 이거 for문으로도 해보자
            // 임시 Array 만들자 (Copy Array)
            T[] tempArr = (T[]) new Object[MAX_SIZE*2];
            // 임시 Array에 기존에 있던 값 저장
            for (int i = 0; i < size; i++) {
                tempArr[i] = array[i];
            }
            array = tempArr;
            MAX_SIZE *= 2;
        }
        array[size] = element; // array의 size위치에 element 추가
        ++size;
    }

    int length() {
        return size;
    }

    // 메소드 오버로딩, index 번째에 element를 집어넣자
    void add(int index, T element){
        /*if (index < 0 || index > size || size >= MAX_SIZE ) { // 예외처리
            throw new IndexOutOfBoundsException();
        }*/
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size >= MAX_SIZE) {
            T[] temp = (T[]) new Object[MAX_SIZE];
            System.arraycopy(array, 0, temp, 0, size);
            array = (T[]) new Object[MAX_SIZE*2];
            System.arraycopy(temp, 0, array, 0, size);
            MAX_SIZE *= 2;
        }
        // element shift
        for (int i = size-1; i >= index ; --i) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        ++size;
    }

    T get(int index) { // T타입을 리턴
        // 예외처리
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    T remove(int index) { // T타입을 리턴하는 건? index에 해당하는거 받고 리스트에서 제거
        T element = get(index);
        // index < 0, index >= size 면 말이 안된다. 예외처리 구현하기
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // 삭제한 자리만큼 당겨준다.
        for (int i = index; i < size-1 ; ++i) {
            array[i] = array[i+1];
        }
        --size; // 삭제해줬으니 size가 작아져야겠지

        return element;
    }

    //모든 요소 삭제
    void clear() {
        size = 0;
    }
}
