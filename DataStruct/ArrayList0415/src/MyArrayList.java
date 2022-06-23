public class MyArrayList <T>{ // 처음에 생성할 때 타입이 만들어진다.
    private T[] array; // array 타입은 T, 접근한정자 private로 외부에서 접근 못하도록
    private int size; // 내 리스트에 몇 개 들어왔는지
    private int MAX_SIZE = 1; // 내 Array에 몇 개까지 넣을 수 있는지

    // 1. 생성자부터 만든다.
    MyArrayList() {
        array = (T[]) new Object[MAX_SIZE]; // Object로 만드는 이유? 자바에서 만들어지는 모든 클래스들은 Object를 상속받아 만들어진 것, T타입으로 캐스팅
        size = 0; // 아직 리스트에 아무것도 없으니까 0
    }

    // 2. add, 리턴 타입 이름 (인자) ==> return 없으면 void, 성공하면 true 반환하도록 boolean으로 해도 됨
    void add(T element) { // T타입의 element를 배열에 넣어줘야 하므로
        // 예외처리 ==> 배열을 2배로 늘려주자
        if(size >= MAX_SIZE) {
            T[] temp = (T[])new Object[MAX_SIZE*2];
            // temp배열에 array배열 요소를 하나씩 복사 ==> System.arraycopy()와 같은 동작
            for (int i = 0; i < size; ++i) {
                temp[i] = array[i];
            }
            MAX_SIZE *= 2; // MAX_SIZE는 두 배가 되었다.
            array = temp; // temp는 없어질 아이, array가 temp가 되었다. (temp는 멤버 변수가 아님, add() 안의 지역변수), array에 temp의 메모리 번지수가 넘어간다.

            System.out.println("여기로 오면 배열이 2배로 됐다. MAX_SIZE: " + MAX_SIZE); // 디버깅~
        }

        // element 추가해주는 코드
        array[size] = element;
        ++size;
    }

    void add(int index, T element) { // (메소드 오버로딩) index위치에 T타입의 element 추가
        // Todo : 사용자가 size보다 큰 index에 집어넣으려 하면 size자리에 강제적으로 넣게 할 것 (물리적구조 = 논리적구조 위해)
        // 예외처리 : 인덱스 음수의 경우
        if (index < 0){
            throw new IndexOutOfBoundsException();
        }
        // 1. 기존 add 호출 -> 추가한 element는 배열 맨뒤에 위치한다.
        // 이미 size가 하나 늘어났다.
        add(element);
        // 모든 원소를 우측으로 하나씩 shift
        for (int i = size-1; i > index; --i) { // int i = size -1; i >= index ; --i
            array[i] = array[i-1]; // array[i+1] = array[i]
        }
        // index 번째에 새로운 element를 넣는다.
        array[index] = element;
   }

   // get 함수를 만들어 봅시다. index에 몇 번 있는지
   T get(int index) {
        //예외처리 : 음수 인덱스 -> 만들 것
       if (index < 0 || index > size) {
           throw new IndexOutOfBoundsException();
       }
       return array[index]; // 결국 이건 주소값을 반환하더라고
   }
    // 배열의 사이즈를 리턴해주는 함수 length
   int length() {
        return size;
   }
   // 삭제 => 나는 전부 삭제로 짰네.. remove의 경우 실제 자바에서는 돌려주게 되있음 ==> remove로 다시 만들자
    void clear() {
        size = 0;
    }

    // remove 함수 만들자
    T remove (int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        T ret = array[index];

        // 하나씩 빈칸으로 옮긴다.
        for (int i = index; i < size-1; ++i) { // int = index+1; i < size ; ++i
            array[i] = array[i+1]; // array[i-1] = array[i];
        }
        --size; // 크기를 하나 줄여준다.

        return ret;
    }
}
