public class main0510 {
    public static void main(String[] args) {
        ArrayCQue<String> myque = new ArrayCQue<>();
        /*myque.push("강현우");
        myque.push("안원영");
        myque.push("장민규");
        myque.push("최비결");
//        myque.push("이은주"); // queSize는 5인데 front 하나는 비워두기로 했으니까 Queue is Full 이 여기서 나와야해

        System.out.println(myque.pop()); // 강현우 나와야함

        myque.push("이은주");
        System.out.println(myque.peek());
        myque.delete();
        System.out.println(myque.peek());*/

        LinkedQue<String> que2 = new LinkedQue<>();
        que2.push("강현우");
        que2.push("안원영");
        que2.push("장민규");
        que2.push("최비결");

        System.out.println(que2.pop()); // 강현우 나와야함
        System.out.println(que2.pop()); // 안원영 나와야함
//
        que2.push("이은주"); // front에 장민규, rear에 이은주
        System.out.println(que2.peek()); // 장민규
        que2.delete(); // 장민규 없어짐
        System.out.println(que2.peek()); // 최비결

    }
}
