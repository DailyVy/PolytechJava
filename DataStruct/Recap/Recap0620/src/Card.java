public class Card {
    enum SUIT {SPADE, HEART, DIAMOND, CLUB}; // 무늬

    SUIT suit;
    int rank; // qna. rank는 숫자.. 실제 JQK는 10인데.. 이것도 enum으로 해도 돼, String으로 해도되고

    Card(SUIT suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    void show() {
        String alphabet = ""; // decoration 해보겠습니ㅏㄷ.

        if(rank == 1) alphabet = "A"; // rank ==1 이면 Ace임 ==> "A"
        else if (rank == 11) alphabet = "J";
        else if (rank == 12) alphabet = "Q";
        else if (rank == 13) alphabet = "K";
        else alphabet = Integer.toString(rank); // 나머지 숫자는 String으로 바꿈

        System.out.print("[" + suit + ", " + alphabet + "]");
    }
}
