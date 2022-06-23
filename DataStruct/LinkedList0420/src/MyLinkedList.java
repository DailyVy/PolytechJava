public class MyLinkedList<T>{
    private class Node {
        T data;
        Node next;

        // Node의 생성자
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private int size;
    private Node head; // 첫번째 노드 head라고 많이 표현한다 (cf. 마지막은 tail), 연결리스트에서는 첫번째 노드만 알고 있으면 된다.
    // Array List와 달리 배열 x, 연결로 이루어짐

    // 생성자를 만들자, 처음에 size는 0, head는 안들어 있다.
    MyLinkedList() {
        head = null;
        size = 0;
    }

    // add 메서드를 만들어봅시다.
    // 1. head == null 일 때는 head=node
    // 2. head != null 일 때는 그 다음 node의 next가 null 인 게 나올 때까지 찾아야함

    // head는 node의 주소를 가지고 있다. temp도 head의 주소를 가리키고 있다. 복사한 게 아님
    // head = head.next 해버리면 head의 정보를 잃어버리기 때문에 임시변수 temp를 생성한 것이다.
    // size는 if, else 둘다 증가해야 한다. 그러니까 if, else문 바깥에 ++size;
    // next는 노드 그 자체를 가리킨다.
    void add(T element) { // 인자는 T타입의 원소를 받아야 한다.
        // 2교시에 작성한 add
        Node insertNode = new Node(element); // data로 element를 넣어줬어, 메모리는 new Node할 때 잡힌다.

        if (head == null) {
            head = insertNode; // m1, null
        }
        else {
            Node temp = head;

            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = insertNode;
        }
        // 1교시에 작성한 add
        /*if (head == null) {
            head = new Node(element);
        }
        else {
            Node temp =head; //임시 노드 생성
            // qna : 이 부분 이해가 필요하다.
            // 맨 마지막 노드를 찾는다.
            // 마지막 노드의 next는 null 이다.
            while(temp.next != null) {
                temp = temp.next; // temp의 next가 null인걸 만날 때 까지 temp = next이다....?
            }
            // temp.next가 새로운 노드가 되도록 한 것
            // 마지막 노드의 next가 새로운 노드가 되어야 한다.
            temp.next = new Node(element);
        }*/
        ++size;
    }

    // 리스트의 크기(리스트에 몇 개 들어가 있는지) 리턴하는 size()
    // size는 private이라서 이렇게 접근할 수 밖에 없다.
    int size() {
        return this.size;
    }

    // 리스트의 요소를 반환하는 Get() 구현, 원하는 인덱스에 있는 데이터를 알고 싶다!, 그 데이터는 T타입이지
    // 교수님이 만든 get
    /*T get (int index) {
        Node temp = head;
        // 몇 번 가야하는 지 알고있어서 for문을 사용한다.
        for (int i = 0; i < index; ++i) {
            temp = temp.next;
        }
        return temp.data;
    }*/
    // 교과서에서 처럼 getNode 함수 만들어서 클래스 내부에서 써먹어보자
    private Node getNode (int index) { // todo 예외처리는?
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node temp =head;
        for (int i = 0; i <index; ++i) {
            temp = temp.next;
        }
        return temp; // temp는 index번째 node이다.
    }
    // 새로운 get 함수 -> getNode를 써먹어보자
    T get(int index) {
        Node temp = getNode(index);
        return temp.data;
    }
    // 이제 이걸 이용해서 index번호를 받아 add할 수 있는 add()함수를 만들어보자. method overload
    void add(int index, T element) {
        //예외 처리
        if (index <0 || index > size) { // 이때 size는 등호 없어야돼, size=index라면 그다음에 추가하면 되니까
            throw new IndexOutOfBoundsException();
        }
        // 새로운 노드 추가
        Node insertNode = new Node(element);

        if (index == 0) {
            insertNode.next = head; // next에 원래 head 연결
            head = insertNode; // 이제 head는 새로 추가한 노드!
        }
        else { // index-1 을 찾아야 한다!
            // previous node 의 next를 새 노드의 next에 복사하고, prevNode의 next를 새 노드에 연결한다.
            Node prevNode = getNode(index-1);
            insertNode.next = prevNode.next;
            prevNode.next = insertNode;
        }
        ++size; // if든 else든 둘 다 하나씩 늘어나~
    }

    // 이제 remove메서드 구현, 삭제한 원소 return -> 즉 T타입 리턴
    T remove(int index) {
        // 예외처리
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        T element = get(index);

        // 삭제하는 코드 짜기
        if (index == 0) {
            head = head.next;
        }
        else {
            Node prevNode = getNode(index-1);
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
