import java.util.Scanner;

public class Book {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Book() {
        this("","");
//        System.out.println("생성자1 호출됨");
    }

    public Book(String title) {
        this(title, "작자미상");
//        System.out.println("생성자2 호출됨");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
//        System.out.println("생성자3 호출됨");
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book emptyBook = new Book();
        littlePrince.show();
        loveStory.show();
        emptyBook.show();

        Book [] book = new Book[2];

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<book.length; i++) {
            System.out.print("제목>> ");
            String title = scanner.nextLine(); // nextLine()으로 한 줄(빈칸 포함)을 하나의 문자열로 읽음
            System.out.print("저자>> ");
            String author = scanner.nextLine();
            book[i] = new Book(title, author); // 배열 원소 객체 생성
        }

        for(int i=0; i<book.length; i++) {
            System.out.print("(" + book[i].title + ", " + book[i].author + ") ");
            book[i].show();
        }

        scanner.close();
    }
}
