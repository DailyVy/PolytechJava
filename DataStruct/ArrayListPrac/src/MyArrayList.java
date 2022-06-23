public class MyArrayList<T> { //T는 리스트의 타입을 의미하는 기호
    private T[] array; // 접근 한정자(private)를 사용하여 은닉, cf)private, public, protected
    private int size;
    private int MAX_SIZE = 10;


    MyArrayList() {
        array = (T[]) new Object[MAX_SIZE]; // 자바에서 만들어지는 모든 클래스들은 Object 상속받음, T타입으로 캐스팅
        size = 0;
    }

    void add(T element) {
//        if(size >= MAX_SIZE) {
//            throw new IndexOutOfBoundsException();
//        }
        // 배열이 꽉 찼다면 예외처리 대신 배열 사이즈 늘려주기
        if (size >= MAX_SIZE) {
            // 2배로 긴 임시배열 생성
            T[] temp = (T[]) new Object[MAX_SIZE*2];
            // 임시배열에 array의 값 복사
            for(int i = 0; i < size; ++i) {
                temp[i] = array[i];
            }
            array = temp;
            MAX_SIZE *= 2; // MAX_SIZE 변경
        }
        array[size] = element;
        ++size;
    }

    void add(int index, T element) {
        // 예외처리
//        if (index < 0 || index > size) { // index=size라면 배열 끝에 추가하는 것과 같다.
//            throw new IndexOutOfBoundsException();
//        }

        // size >= MAX_SIZE라면? 배열 크기를 늘려주자
        // index가 size보다 크다면 강제로 size자리에 위치할 수 있도록 기존의 add(element)함수를 불러온다.
        add(element); // 여기서 size가 늘어났다.

        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        for(int i = size-1; i > index ; --i) {
            array[i] = array[i-1];
        }
        array[index] = element;
//        ++size; // add() 호출하면 ++size가 이미 됨
    }

    // 인덱스를 받아 배열의 요소를 지우는 remove 메소드, 지우는 요소를 반환
    T remove(int index) {
        T element = array[index];

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // 한 칸씩 빈칸으로 옮긴다.
        for(int i = index ; i < size -1 ; ++i){
            array[i] = array[i+1];
        }

        --size;

        return element;
    }

    // 배열의 길이를 알려주는 메소드 size작성
    int size() {
        return size;
    }

    // 객체 정보를 알려줄 Get method 구현~
    T get(int index) { // T 타입 리턴
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    void clear(){
        size = 0;
    }

}
