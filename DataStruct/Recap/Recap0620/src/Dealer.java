import java.util.Collections;
import java.util.LinkedList;

public class Dealer extends Player {
    // 딜러는 deck 을 가지고 있다. (카드)
    private LinkedList<Card> deck;
    Dealer(String name,int credit) {
        super(name, credit); // 이거 안해주면 에러나.. Player에 기본생성자가 없거든 ==> Player의 생성자 호출
        deck = new LinkedList<>();
    }

    void makeDeck() {
        deck.clear(); // 기존에 있는 덱 없애주고

        // Card클래스에 정의되있는 SUIT enum으로부터 하나씩 꺼내서 for문
        for (Card.SUIT suit: Card.SUIT.values()) {
            for (int i=1; i <= 13; i++) {
                Card c = new Card(suit, i);
                deck.add(c);
            }
        }

        // 근데 이거 순서대로 들어가면 안되니까 shuffle할거야
        // 컬렉션에 존재
        Collections.shuffle(deck);
    }

    Card deal() {
        return deck.pop();
    }

    void dealerRule() {
        if (getScore() < 17) getCard(deal());
        // getScore는 Player로 부터 받은거! 그대로 쓸수 있다
        // deal() 은 Dealer 클래스에 있으니까 그대로 쓸 수 있다.
    }
}
