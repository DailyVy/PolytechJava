public class Main0610 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        MyTree<String> tree = new MyTree<>();

        // insert 해봅시다.
        /*tree.insert("A");
        tree.insert("B");
        tree.insert("C");
        tree.insert("D");
        tree.insert("E");

        tree.preorder();
        System.out.println();
        tree.inorder();
        System.out.println();
        tree.postorder();*/


        tree.insert("-");
        tree.insert("*");
        tree.insert("/");
        tree.insert("A");
        tree.insert("B");
        tree.insert("C");
        tree.insert("D");

        tree.preorder();
        System.out.println();
        tree.inorder();
        System.out.println();
        tree.postorder();
    }
}
