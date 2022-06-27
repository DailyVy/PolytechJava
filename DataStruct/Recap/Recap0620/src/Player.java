import java.util.ArrayList;

public class Player {
    // 이름과 돈이 있어야겠지
    String name;
    int credit;
    int betMoney; // 베팅할 금액
    // 카드를 들고 있을 수도 있어
    ArrayList<Card> cardsInHand;

    Player(String name, int credit) {
        this.name = name;
        this.credit = credit;
        cardsInHand = new ArrayList<>();
    }

    // 이제 인터페이스를 하나 더 가지고 갑시다.
    //  초기화 할 때 가지고 있는 card 다 버려야 하니까
    //  BlackJack에서 초기화할 때 사용할거야
    void clearHand() {
        cardsInHand.clear();
    }

    void getCard(Card c) {
        cardsInHand.add(c);
    }

    void showPlayerInfo() {
        System.out.println("====================================");
        System.out.println("Player " + name + " / " + credit);
        for (Card c : cardsInHand) c.show(); // 손에 있는 카드 다 보여줭줭
       System.out.println(); // 줄바꿈 하나 넣어줌
    }

    void bet(int money) {
        // 플레이어는 money를 베팅할거야
        // 근데 베팅할 돈이 credit 보다 많을 수 없지
        if (money > credit) {
            System.out.println("All in");
            betMoney = credit;
        }
        else {
            betMoney = money;
        }
        // 그래서 이겼으면 credit + betMoney, 지면 credit - betMoney
    }

    // 점수 계산합시다.
    int getScore() {
        int score = 0;
        int n_Ace = 0;


        for (Card c: cardsInHand) {
            if (c.rank == 1) ++n_Ace; // 일단 Ace 몇장인지 세자
            else if(c.rank > 10) score += 10; // score는 무조건 10임(J, Q, K 다 10임)
            else score += c.rank; // 나머지는 자기 숫자만큼 더하면 됨
        }

        // Ace 카드가 한 장이라도 있다면
        // 몇 장이든 11로 사용할 수 있는 Ace는 한 장뿐
        // Ace 는 11 or 1
        if (n_Ace > 0) {
            int max = 11 + n_Ace - 1; // Ace가 n장이면 한장은 11이고 나머지(n-1)는 1이라고
            int min = n_Ace; // 최소 스코어는 그냥 Ace갯수겠지

            // 이제 나머지 카드와 ace를 더해보자
            if((score + max) < 22) score += max; // 22보다 작으면 max를 더해주고
            else score += min; // 아니면 min을 더해
        }

        return score;
    }

    void win() {
        credit += betMoney;
    }
    void lose() {
        credit -= betMoney;
    }
}
