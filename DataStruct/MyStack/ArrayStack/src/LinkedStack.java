public class LinkedStack<T> {   //역시 T 타입이 있어야겠지
    private class Node {    // T 타입의 data 와 Node 타입의 next 가 있다.
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; // top Node 만 알고있으면 된다.

    LinkedStack() {
        top = null;
    }

    boolean isEmpty() {
        if (top == null) return true; // return top == null;
        else return false;
    }
    // Linked List 는 isFull 만들지 않는다. 얜 노드 연결만 해주면 메모리가 허용하는 한 계속 만들 수 있으니까

    void push(T item) {
        Node pushNode = new Node(item);
        pushNode.next = top;
        top = pushNode;
    }
    T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return null;
        }

        T retVal = top.data;
        top = top.next;

        return retVal;
    }
    T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return null;
        }

        return top.data;
    }
    void delete() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
        }
        else {
            top = top.next;
        }
    }
}
