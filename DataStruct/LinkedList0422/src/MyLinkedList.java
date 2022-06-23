public class MyLinkedList<T> { // Linked List는 T라는 타입을 받을 것이다.
    private class Node{ // Node는 T타입의 data와 다음 Node를 연결하는 next가 필요
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null; // next field는 없으니까 null
        }

        // 생성자를 한번 오버로딩 해보겠습니다.
        // parameter가 2개
        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // LinkedList는 뭐가 있어야 할까?
    private int size;
    private Node head; // LinkedList의 제일 앞에 있는 노드를 head라고 한다.

    // 생성자를 만들자
    MyLinkedList() {
        head = null;
        size = 0;
    }

    // 제일 쉬운 add부터 구현
    void add(T element) {
        // element를 넣은 새로운 Node 생성
        Node insertNode = new Node(element);

        if (head == null) {
            head = insertNode;
        }
        else {
            // temp 하나 만들자, next field가 null이 아닌동안..
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            // 맨 마지막 노드의 다음 노드가 insertNode가 되면 된다.
            temp.next = insertNode;
        }
        ++size;
    }

    int length() {
        return this.size; // this.size나 size나, cf. 파이썬은 무조건 this를 적어줘야 한다.
    }

    // getNode 메소드 구현, 이 클래스에서만 사용할 수 있는! ==> private
    // index 번째의 노드를 리턴해주는 내부 methode
    private Node getNode(int index){
        // 예외처리
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        // index 번째 노드를 찾아간다.
        Node temp = head;
        for (int i = 0; i < index; ++i) {
            temp = temp.next;
        }

        return temp;
    }
    // getNode를 이용한 get 메소드 구현
    T get(int index) {
        // Node temp = getNode(index)
        // return temp.data;
        return getNode(index).data; // 이렇게 한 줄로도 가능
    }

    // add 오버로딩
    void add(int index, T element) {
        //예외처리
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        // 일단 노드 생성

        // 1. index가 0이라면 제일 앞에 들어가야지
        // 2. 그럼 next가 기존의 head가 되어야겠지
        // 3. 그리고 새로운 head로 insertNode가 되어야 함
        if (index == 0) {
            Node insertNode = new Node(element, head);
            head = insertNode;
        }
        // 1. 추가하고 싶은 자리의 앞에 있는 노드를 불러오자
        // 2. prevNode의 next를 insertNode에 복사 붙여넣기 한다.
        // 3. prevNode.next에 insertNode를 붙여넣어준다.
        else {
            Node prevNode = getNode(index-1);
            Node insertNode = new Node(element, prevNode.next);
            prevNode.next = insertNode;
        }
        ++size;
    }

    // remove 함수, 삭제한 data를 리턴
    T remove(int index) {
        // 예외처리
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // index번 원소를 지운다 => 얘를 리턴할 것임
        T element = get(index);

        // 1. 만약 이게 head라면?
        if (index == 0) {
            head = head.next;
        }
        // 2. 이제 중간이라면? prevNode.next를 그 다음 다음걸로 바꿔줘야지 뭐
        else {
            Node prevNode = getNode(index - 1);
            prevNode.next = prevNode.next.next;
        }

        --size;

        return element;
    }

    void clear(){
        head = null;
        size = 0;
    }

}
