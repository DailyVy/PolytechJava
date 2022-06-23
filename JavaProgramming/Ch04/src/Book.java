public class Book {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Book() {
        this("", "");
        System.out.println("생성자1 호출됨");
    }

    public Book(String title) {
//        title = t;
//        author = "작자미상";
        this(title, "작자미상");
        System.out.println("생성자2 호출됨");
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("생성자3 호출됨");
    }

    public static void main(String[] args) {
//        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
//        Book emptyBook = new Book();
//
        loveStory.show();

    }
}
