import java.awt.event.WindowFocusListener;

public class ArrayCQue <T> {
    private int front;
    private int rear;
    private int queSize; // queue의 size -> 배열로 구현할 거라서
    private T[] queue; // T타입의 배열, 저장할 곳!

    ArrayCQue() { // 만약 인자를 받아올거면 queSize를 받아올거임
        front = 0;
        rear = 0;
        queSize = 5;
        queue = (T[]) new Object[queSize]; // T타입으로 캐스팅
    }
    // 메서드는 stack이랑 같아요!
    // isEmpty() : front와 rear가 같을 때! Queue가 비어잇다.
    boolean isEmpty() {
        return (front == rear); // True 또는 False
    }
    boolean isFull() {
        // rear+1 에 queSize를 % 연산한 것과 front가 같으면 Queue는 Full!
        return (((rear + 1) % queSize) == front);
    }
    // push
    void push(T item) {
        if (isFull()) {
            System.out.println("Queue is Full!");
        }
        else {
            rear = (rear + 1) % queSize; // rear가 배열 끝까지 갔으면 앞으로 다시 가야하니까 모듈러스
            queue[rear] = item;
        }
        System.out.println("front = " + front + " , rear = " + rear); // 디버깅
    }
    // pop 은 T타입을 리턴, 인자는 필요없다. 항상 front에서 일어나기 때문에
    T pop() {
        // queue 비었는지 확인 ==> 예외 발생시켜도 된다.
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return null;
        }
        // pop 하면 front를 1 증가 시킨다. 그리고 모듈러스 해야지
        front = (front + 1) % queSize;
        System.out.println("front = " + front + " , rear = " + rear); // 디버깅
        return queue[front];
    }
    // peek : front에 있는 원소를 돌려받는데 삭제는 하지 않는다.
    T peek() {
        // queue 비었는지 확인 ==> 예외 발생시켜도 된다.
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return null;
        }
        // front 비어있으니까 return 할 건 +1, 근데 +1 하면 index넘어갈 수 있으니까 모듈러스
        return queue[(front+1) % queSize];
    }
    // delete : 제일 앞에 있는거 지우는 거, return 은 없다.
    void delete() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        }
        else {
            front = (front + 1) % queSize;
        }
    }

}
