public class MyLinkedList<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private int size;
    private Node head;

    // 생성자 먼저!
    MyLinkedList() {
        head = null;
        size = 0;
    }

    // add함수를 만들어보자
    // head == null 이면 새로 만든 node가 바로 head!
    // head != null 이면 next에 null이 나올 때까지 찾아야 해
    // 그리고 size는 증가해야겠지
    void add(T element) {
        Node insertNode = new Node(element);

        if (head == null) {
            head = insertNode;
        }
        else {
            Node temp = head; // temp 라는 임시변수가 head와 같은 주소를 참조

            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(element);
        }
        ++size;
    }

    // 연결리스트의 크기를 리턴
    int size(){
        return this.size;
    }

    // get()
    /*T get(int index) {
        // 예외처리
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;

        for(int i = 0; i < index; ++i) {
            temp = temp.next;
        }
        return temp.data;
    }*/

    // getNode() : Node의 정보를 불러오는 메서드, 반환이 Node이다!
    private Node getNode(int index) {
        // 예외처리
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;

        for (int i = 0; i < index; ++i) {
            temp = temp.next;
        }
        return temp;
    }
    // 다시 get을 만들어보자. 리스트의 인덱스를 통해 원소의 정보를 얻자
    T get(int index) {
        Node temp = getNode(index); // getNode()는 node를 리턴하니까 타입이 Node
        return temp.data;
    }
    // 이제 getNode를 응용하여 add() method overloading
    void add(int index, T element) {
        // 일단 예외처리부터
        if (index < 0 || index > size) { // index == size라면 맨 끝에 넣으면 될 일
            throw new IndexOutOfBoundsException();
        }
        Node insertNode = new Node(element);

        // 일단 index == 0 이라면, head를 바꿔주면 된다.
        // 1. insertNode.next에 head를 넣어준뒤
        // 2. 이제 head는 insertNode가 되는거지
        if (index == 0) {
            insertNode.next = head;
            head = insertNode;
        }
        // 이제 index != 0 이라면, 원하는 인덱스의 앞!에 있는 노드를 불러오자. prevNode ==> getNode를 통해
        // 1. prevNode.next값을 insertNode.next에 넣어주고
        // 2. prevNode.next에 insertNode를 넣어주면 되겠넹
        else {
            Node prevNode = getNode(index - 1);
            insertNode.next = prevNode.next;
            prevNode.next = insertNode;
        }
        ++size;
    }
    // 이제 remove함수를 구현해봅시다. remove는 삭제할 값을 리턴할거야 그러니까 T타입
    T remove(int index){
        // 예외처리
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

//        T element = getNode(index).data; // getNode().data가 결국 get()이랑 같다.
        T element = get(index);

        // 만약 index == 0 즉, head node를 그 다음 노드로 설정하고 싶다면?
        // head = head.next; 하면 되는거 아닌가?
        if (index == 0) {
            head = head.next;
        }
        // index != 0 이라면 prevNode의 next가 현재 node의 next가 되면 된다.
        else {
            Node prevNode = getNode(index - 1);
            prevNode.next = getNode(index).next;
        }
        --size;

        return element;
    }

    // 이제 마지막으로 clear함수!!! head node가 null이 되고, size가 0이 되어야함
    void clear() {
        head = null;
        size = 0;
    }

}
