public class MyLinkedList<T>{
    private class Node {
        T data;
        Node next;

        // 생성자
        Node(T data){
            this.data = data;
            this.next = null; // next field는 없으니까 null
        }
        // 생성자 오버로딩
        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // LinkedList에 있어야 할 것
    // 우리는 head와 size만 알고있다.
    private int size;
    private Node head; // 첫번째 Node의 레퍼런스, LinkedList의 제일 앞에 있는 노드를 head라고 한다.

    // 생성자
    MyLinkedList() {
        head = null;
        size = 0;
    }

    // add(e), add(index, e), get(index), remove(index), clear(), size()

    // add(e)
    void add(T element) {
        // 일단 추가해 줄 노드부터 생성
        Node insertNode = new Node(element);
        // 만약 head가 없다면 추가한 노드가 head가 된다
        if (head == null) {
            head = insertNode;
        }
        // todo. 여기 다시 해보기
        // 만약 head가 존재한다면 Link의 마지막 노드를 찾은 다음 마지막에 연결해줘야 한다.
        // 그러니까 모조리 노드를 다 훑은 다음 next가 null이 나올 때!!!
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            // 이제 temp 가 마지막 노드가 되었다.
            // 그럼 temp.next가 insertNode를 가리켜야겠지
            temp.next = insertNode;
        }
        ++size;
    }

    // length()
    int length() {
        return size;
    }

    // get(index)
    //
    T get(int index) {
        // 1. 그냥 get함수를 작성하기
        /*Node temp = head;
        // 1-1. 예외처리
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        // 1-2. 노드를 찾아라
        // 몇 번 가는지 알고 있어서 for문을 사용한다.
        // index만큼 link를 따라가서 해당 데이터를 return한다.
        // index 보다 작아야 한다.
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;*/

        // 2. getNode() 함수를 이용하여 작성하기
        Node retVal = getNode(index);
        return retVal.data;
    }

    // 교과서의 getNode() : Data를 리턴하지 않고 Node를 리턴한다.
    private Node getNode(int index) {
        Node temp = head;
        // 예외처리
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        //
        for (int i = 0; i < index ; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // add(index, element)  오버로딩
    void add(int index, T element) {
        // 1. 예외처리 : index > size 에서 이미 head == null 은 처리됨
        if (index < 0 || index > size) { // index == size여도 된다. 마지막에 추가하는 거니까
            throw new IndexOutOfBoundsException();
        }
        // 2. index가 0이라면?
        if (index == 0) {
            // 일단 insertNode의 next가 head여야 한다. 그리고 insertNode가 head가 되어야 함
            Node insertNode = new Node(element, head);
            head = insertNode;
        }
        // 3. index가 0이 아니라면?
        else {

            // prevNode를 찾아야 한다. ==> getNode이용
            Node prevNode = getNode(index-1);
            // prevNode에 있던 next를 insertNode의 next에 복사해준 후
            // prevNode의 next는 insertNode를 가리키면 된다.
            Node insertNode = new Node(element, prevNode.next);
            prevNode.next = insertNode;
        }
        ++size;
    }

    // remove(index) : T타입 리턴
    T remove(int index) {
        // 1. 예외처리
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // 2. 일단 먼저 우리가 리턴할 거 데이터 받아오자
        T retValue = get(index);
        // 3. 만약 index == 0, 즉 삭제하고 싶은게 head라면?
        if (index == 0) {
            head = head.next;
        }
        else {
            // prevNode의 next가 지우고 싶은 노드의 next를.... 복사한다.
            // prevNode의 next는 next의 next를 가리켜야 한다.
            Node prevNode = getNode(index - 1);
            prevNode.next = prevNode.next.next;
        }

        --size;

        return retValue;
    }

    // clear()
    void clear() {
        size = 0;
        head = null;
    }

}
