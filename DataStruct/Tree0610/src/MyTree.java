import java.util.LinkedList;
import java.util.Queue;

public class MyTree<T> { // 어떤 원소가 들어갈지 모르니까 T타입 원소를 받을거야
    private class Node {
        T data;
        Node left;
        Node right;

        Node(T data){
            this.data = data;
            left = null;
            right = null;
        }
    } // class Node

    // 트리는 root node가 필요하다.
    private Node root; // Node 타입의 root
    private int n_node; // tree에 몇 개 들어와있는지 체크하는 number of node
    MyTree() {
        root = null;
        n_node = 0;
    }

    void insert (T data) {
        Node insertNode = new Node(data);

        // root가 비어있으면 insertNode가 root가 되면 됨
        if (root == null) root = insertNode;
        else {
            // BFS해서 빈자리 나오면 넣는다. ==> Queue가 필요
            //  Queue에 노드 집어넣고 방문처리하고 자식 노드 있으면 Queue에 넣어 ==> Queue가 빌때까지
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()) {
                // poll : 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환하고, 해당 요소를 큐에서 제거합니다
                Node curNode = q.poll();

                // 만약 왼쪽이 비어있으면
                if (curNode.left == null) {
                    curNode.left = insertNode;
                    // 달았으니까 이제 탐색 끝내면 됨
                    break;
                }
                // 왼쪽이 찼고 오른쪽이 비어있으면?
                else if (curNode.right == null) {
                    curNode.right = insertNode;
                    break;
                }
                // 왼쪽, 오른쪽에 자식이 두개 다 있으면?
                else {
                    // 노드 두개 다 집어넣고 나온다.
                    q.add(curNode.left); // 왼쪽 집어넣고 ==> 왼쪽을 먼저 봐야하니까 항상 왼쪽 먼저 넣어
                    q.add(curNode.right); // 오른쪽 집어넣고
                    // 그러고 다시 while문 돌면서 비어있는 곳 탐색
                }
                n_node++; // node 추가 했으니 갯수 늘린다.
            } // while문 끝
        }// else문 끝
    } // insert 함수 끝

    // 외부에서 사용할 preorder 함수
    void preorder() {
        preorder(root);
    }
    // 내부에 구현되어있는 preorder함수
    private void preorder(Node startNode) { // root부터 시작하겠지 뭐
        if (startNode != null) { // recursive call이 끝나는 시점, Null이 되는 시점
            System.out.print(startNode.data.toString()); // startNode의 data를 toString으로 찍어봅시당
            // recursive call
            preorder(startNode.left);
            preorder(startNode.right);
        }
    }


    // 외부에서 사용할 inorder 함수
    void inorder() {
        inorder(root);
    }
    // 내부에 구현되어있는 inorder 함수
    private void inorder(Node startNode) { // root부터 시작하겠지 뭐
        if (startNode != null) { // recursive call이 끝나는 시점, Null이 되는 시점
            inorder(startNode.left);
            System.out.print(startNode.data.toString()); // startNode의 data를 toString으로 찍어봅시당
            inorder(startNode.right);
        }
    }

    // 외부에서 사용할 postorder 함수
    void postorder() {
        postorder(root);
    }
    // 내부에 구현되어있는 postorder 함수
    private void postorder(Node startNode) { // root부터 시작하겠지 뭐
        if (startNode != null) { // recursive call이 끝나는 시점, Null이 되는 시점
            postorder(startNode.left);
            postorder(startNode.right);
            System.out.print(startNode.data.toString()); // startNode의 data를 toString으로 찍어봅시당
        }
    }
}
