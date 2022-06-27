import java.util.ArrayList;
import java.util.Scanner;

enum GameState { INIT, MAKEUP, PLAY, CAL_SCORE, END };
public class BlackJack {
    private GameState state; // GameState 타입의 변수 state
    private Dealer dealer; // game에는 dealer가 필요해
    // 플레이어는 여러 명 있을 수 있으므로 ArrayList로 만들겠다.
    private ArrayList<Player> players;
    // 한테이블에 네 명까지 가능하도록 하자
    private int MAX_PLAYERS;
    // todo. 이제 초기화하러 가자 => 생성자에

    // 생성자
    BlackJack() {
        state = GameState.INIT;
        dealer = new Dealer("Dealer", 1000000);
        players = new ArrayList<>(); // player채우는건 make할 때로 하자
        MAX_PLAYERS = 4; // maximum player는 4명
    }

    void startGame() {
        System.out.println("Let's start the game!");

        while (state != GameState.END) {
            switch (state) {
                case INIT:
                    initState();  // initState() 호출 ==> switch문 길어질까봐 함수 호출방식으로
                    break;
                case MAKEUP:
                    makeupState();
                    break;
                case PLAY:
                    playState();
                    break;
                case CAL_SCORE:
                    calState();
                    break;
            } // end switch
        } // end while

        System.out.println("Exit the game"); // while문 빠져나오면 게임 종료
    } // end startGame()


    // 게임 단계별로 private 함수로 만듦 ==> 이후 player만들러 가
    private void initState() {
        System.out.println("Initialize the game");
        dealer.makeDeck(); // dealer의 덱 생성
        dealer.clearHand();
        for (Player p : players) p.clearHand(); // 플레이어가 들고 있던 카드 없애줘

        state = GameState.MAKEUP;
    }

    private void makeupState() {
//        System.out.println("Decide players");
        Scanner sc = new Scanner(System.in);
        // 언제까지 받을건가? MAXIMUM 찰 때까지
        while(players.size() < MAX_PLAYERS) {
            // 슬롯이 몇개 비어있나? 맥시멈 - 사이즈
            int slot = MAX_PLAYERS - players.size();

            System.out.println(slot + " slot is empty now.");
            System.out.print("Do you want to join the game? (Y/N): ");
            String ans = sc.next(); // 오류 처리 안할거라고..

            if(ans.equals("N") || ans.equals("n")) break; // 추가 안해서 break

            System.out.print("User name?: ");
            String name = sc.next();
            System.out.print("User's credit? : ");
            int credit = sc.nextInt(); // todo. 예외처리 안해줘서^^;;; String 넣으면 뻗을거야..

            players.add(new Player(name, credit));
            System.out.println("Player [" + name + "] joins the game!");
        }

        if (players.size() > 0) state = GameState.PLAY;
        else state = GameState.END;

//        state = GameState.PLAY;
    }

    private void playState() {
        System.out.println("Play the game");

        // betting 금액 입력
        Scanner sc = new Scanner(System.in);

        for (Player p : players) {
            System.out.print(p.name + "! Bet your money! : ");
            int bet = sc.nextInt();
            p.bet(bet);
        }


        // 플레이어, 딜러는 카드를 두장씩 받자! 덱에서부터
        for (Player p : players) {
            p.getCard(dealer.deal());
            p.getCard(dealer.deal());
        }

        dealer.getCard(dealer.deal());
        dealer.getCard(dealer.deal());

        // info를 보여주자 (현재 상태)
        dealer.showPlayerInfo();

        for (Player p : players) p.showPlayerInfo();

        // 이제 카드를 받을지 말지 정해야 한다.
        // hit / stay
        // 순서대로 받도록 합시다.
        for (Player p : players) {
            String ans = "";
            do {
                System.out.print(p.name + ", Hit / Stay ? (h/s) : ");
                ans = sc.next();
                if (ans.equals("s")) break; // stay 했으면 다시 hit할 수 없다.

                p.getCard(dealer.deal()); // hit이면 딜러로부터 카드를 받는다.
                p.showPlayerInfo();

                // score 계산
                int score = p.getScore();
                // burst인지 아닌지 => burst면 do - while문 깨지고 그 다음 플레이어에게 넘어감
                if (score > 21) {
                    System.out.println("Burst! over 21! ");
                    break;
                }

            } while (ans.equals("h"));
        } // for문 끝, 플레이어 선택이 끝남

        dealer.dealerRule();
        dealer.showPlayerInfo();

        state = GameState.CAL_SCORE;
    }

    private void calState() {
//        System.out.println("Who wins?");
        int dealerScore = dealer.getScore();
        System.out.println("Dealer's score is ** " + dealerScore + " **");
        
        // Dealer 가 burst
        if (dealerScore > 21) {
            System.out.println("All players are win!"); // 실은 살아있는 모든 플레이어가 승리여야 하는데.. 귀찮아서 안함..
            for (Player p : players) p.win(); // win() 함수 구현해야해 ^^, lose()도.. => 돈계산해야지지
       }
        // Dealer 가 burst가 아니면
        else{
            for (Player p : players) {
                int playScore = p.getScore();
                
                // player 가 burst라면?
                if (playScore > 21) {
                    System.out.println("Player " + p.name + " lose...");
                    p.lose();
                }
                // player가 burst가 아니라면?
                //  큰 쪽이 이긴거지!, 같으면 비긴거
                else { 
                    if (playScore > dealerScore) {
                        System.out.println("Player " + p.name + " win!");
                        p.win();
                    }
                    else if (dealerScore > playScore) {
                        System.out.println("Player " + p.name + " lose...");
                        p.lose();
                    }
                    else {
                        System.out.println("Player " + p.name + " draw.");
                    }
                }
            }
        }

//        state = GameState.END;
        state = GameState.INIT; // 이제 END하지말고 초기화하겠슴다.
    }

}
