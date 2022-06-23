public class LinkedQue<T> { // LinkedQue는 어떤 타입이 들어올지 모르니까 T타입
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedQue는 Node 타입의 front와 node를 가지고 있어야 한다.
    private Node front;
    private Node rear;

    LinkedQue() {
        front = null;
        rear = null;
    }

    boolean isEmpty() {
        // front에 아무것도 없으면 빈거지
        return (front == null);
    }

    void push(T item) {
        // 1. 노드 하나 만든다.
        // 2. T타입 item 집어넣고,
        // 3. front를 여기다 연결해준다.
        Node insertNode = new Node(item);

        // 처음에 아무것도 없을 때는
        // front도 insertNode, rear도 insertNode
        if(isEmpty()) {
            front = insertNode;
            rear = insertNode;
        }
        else {
            // rear의 next를 새로운 노드로 연결시키고
            rear.next = insertNode;
            // rear가 insertNode가 되어야함
            rear = insertNode;
            // ==> 순서가 굉장히 중요하다.
        }
    }

    T pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return null;
        }
        // pop 할 때는 front를 front의 next로 연결해야 한다.
        // 그전에 리턴할 값을 임시로 저장해놓자.
        T item = front.data;
        front = front.next;
        // 만약 front.next가 null이면 empty니까... rear도 null로 끊어준다.
        if (front == null) rear = null;

        return item;
    }

    T peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return null;
        }
        return front.data;
    }

    void delete() {
        if (isEmpty()){
            System.out.println("Queue is Empty!");
        }
        else {
            front = front.next;
            if (front == null) rear = null;
        }
    }


}
