public class main_0503 {
    public static void main(String[] args) {
        // ArrayList로 구현하기
        ArrayStack <String> stack = new ArrayStack<>(5);
        stack.push("강현우");
        stack.push("최비결");
        stack.push("안원영");
        stack.push("최민석");
        stack.push("허진행");
        stack.push("신주석"); // push가 되지 않는다.

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop()); // null

        System.out.println(stack.pop()); // 허진행 pop
        stack.delete(); // 최민석 delete
        System.out.println(stack.peek()); // 안원영

        // LinkedList로 구현하기
        LinkedStack <String> stack2 = new LinkedStack<>();
        stack2.push("강현우");
        stack2.push("최비결");
        stack2.push("안원영");
        stack2.push("최민석");
        stack2.push("허진행");
        stack2.push("신주석");

//        System.out.println(stack2.pop());
//        System.out.println(stack2.pop());
//        System.out.println(stack2.pop());
//        System.out.println(stack2.pop());
//        System.out.println(stack2.pop());
//        System.out.println(stack2.pop());
//        System.out.println(stack2.pop());

        System.out.println(stack2.pop()); // 신주석 pop
        stack2.delete(); // 허진행 delete
        System.out.println(stack2.peek()); // 최민석
    }
}
