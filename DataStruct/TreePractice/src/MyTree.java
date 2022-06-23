import java.util.LinkedList;
import java.util.Queue;

public class MyTree<T> { // 무슨 타입이 들어오는지 모르니까
    // Linked Linst 이용할거야 ==> Node class 만들어야지
    private class Node {
        T data;
//        Node next; // 이번에는 Tree 니까 자식 노드를 가리키는 left, right 가 있을거야
        Node left;
        Node right;

        Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    } // class Node 끝

    // Tree는 root Node가 필요
    private Node root;
    private int n_node; // tree에 노드가 몇 개 달렸는지....

    // MyTree의 생성자
    MyTree() {
        root = null;
        n_node = 0;
    }

    void insert(T data) {
        Node insertNode = new Node(data);
        // root 가 비어있으면 insertNode가 root가 되면 됨
        if (root == null) {
            root = insertNode;
        }
        // root가 있다면 bfs해서 빈 자리 있으면 넣는다. ==> queue가 필요!!!
        // 자바에서 Queue는 abstract class라서 그냥 사용할 수 없어.. Linked List로 해줘야..
        // Queue에 노드 집어넣고 방품처리하고 자식 노드 있으면 Queue에 넣어 ==> Queue가 빌 때까지
        else {
            Queue<Node> q = new LinkedList<>();
            q.add(root); // 일단 root 부터 집어넣고
            // queue가 빌때까지~
            while(!q.isEmpty()) {
                Node curNode = q.poll(); // poll : 큐의 맨 앞에 있는 요소를 반환하고 해당 요소를 큐에서 제거

                if(curNode.left == null) {
                    curNode.left = insertNode;
                }
                else if(curNode.right == null) {
                    curNode.right = insertNode;
                }
                // 자식노드가 다 차있으면..?
                else {
                    q.add(curNode.left);
                    q.add(curNode.right);
                }
            }
        }
        n_node++;
    } // insert 끝

    // 이제 tree가 제대로 들어갔는지 확인해야겠지영
    // tree 순회 구현 : preorder, inorder, postorder
    // 어차피 root부터 순회할거야. 근데 root는 private이잖아?
    void preorder() { // 이건 외부에서 호출할 preorder
        preorder(root);
    }
    // 내부에서 구현하는 preorder 함수
    private void preorder(Node startNode) {
        if (startNode != null) { //recursive call이 끝나는 지점 => Null 이 되는 시점
            // toString() : Object클래스에 속해있는 메서드, 객체의 문자정보를 출력
            System.out.println(startNode.data.toString()); //startNode의 data를 toString으로
            preorder(startNode.left);
            preorder(startNode.right);
        }
    }
    void inorder() { // 이건 외부에서 호출할 preorder
        inorder(root);
    }
    // 내부에서 구현하는 preorder 함수
    private void inorder(Node startNode) {
        if (startNode != null) { //recursive call이 끝나는 지점 => Null 이 되는 시점
            // toString() : Object클래스에 속해있는 메서드, 객체의 문자정보를 출력
            inorder(startNode.left);
            System.out.println(startNode.data.toString()); //startNode의 data를 toString으로
            inorder(startNode.right);
        }
    }
    void postorder() { // 이건 외부에서 호출할 preorder
        postorder(root);
    }
    // 내부에서 구현하는 preorder 함수
    private void postorder(Node startNode) {
        if (startNode != null) { //recursive call이 끝나는 지점 => Null 이 되는 시점
            // toString() : Object클래스에 속해있는 메서드, 객체의 문자정보를 출력
            postorder(startNode.left);
            postorder(startNode.right);
            System.out.println(startNode.data.toString()); //startNode의 data를 toString으로
        }
    }

}
