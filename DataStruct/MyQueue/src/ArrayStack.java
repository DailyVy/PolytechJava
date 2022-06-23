public class ArrayStack<T> { // Stack에 어떤 자료가 들어갈지 모름 => T타입(String, 객체, Integer 등)
    private int top; // 배열이 어디까지 차있는지 확인할 거야
    private int stackSize; // stack size가 얼마인지
    private T[] stack; // T타입의 stack이라는 이름의 배열 => 배열의 크기는 stackSize

    ArrayStack(int stackSize) { // 생성자를 만들 때 스택사이즈를 받아오자
        top = -1; // stack이 비어있는 걸 표현하기 위해 -1, 하나를 집어넣으면 0(제일 위에 차있는 배열의 인덱스)
        this.stackSize = stackSize;
        stack = (T[]) new Object[stackSize]; // Object타입이면 안되니까 T타입으로 강제 캐스팅, 문법적으로 new T가 안된대
    }

    boolean isEmpty() {
        if (top == -1) return true;
        else return false;
    }

    boolean isFull() {
        if (top == stackSize-1) return true;
        else return false;
    }

    void push(T item) { // 리턴 타입은 없고 T타입의 값을 받자
        if (isFull()) {
            System.out.println("Stack is Full!"); // 혹은 exception을 발생시켜 프로그램을 종료시켜도 된다.
        }
        else {
            stack[++top] = item; // 먼저 ++하고 집어넣어야 해
        }
    }
    T pop() { //stack이 비어있는데 pop되면 안되겠지
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return null;
        }
        return stack[top--]; // return 후 top을 하나 줄여줌
    }
    T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return null;
        }
        return stack[top];
    }
    void delete() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
        }
        else {
            stack[top--] = null;
        }
    }
}
