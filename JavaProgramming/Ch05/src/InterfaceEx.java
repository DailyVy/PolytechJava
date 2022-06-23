interface PhoneInterface { // 인터페이스는 변수 넣지 못한다.(필드, 멤버변수)
    final int TIMEOUT = 10000; // 상수필드, public static 생략함
    void sendCall(); // 추상 메서드 public abstract 생략
    void receiveCall(); // 추상 메서드 public abstract 생략
    // todo 추상메서드는 public abstract 로 정해져 있고 생략가능
    //  default, protected, private 인터페이스 내에 코드 작성해야함


    default void printLogo() { // default 메서드
        System.out.println("** Phone **");
    }
}

interface MobilePhoneInterface extends PhoneInterface{
    void sendSMS(); // 추상메서드
    void recieveSMS(); // 추상메서드
}

interface MP3Interface {
    void play(); // 추상메서드
    void stop(); // 추상메서드
}
// 클래스
class PDA {
    public int calculate(int x, int y) {
        return x + y;
    }
}

// SmartPhone 클래스는 PDA를 상속받고,
// MobilePhoneInterface와 MP3Interface에 선언된 추상 메서드를 모두 구현한다.
// 다중상속
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
    // MobilePhoneInterface 추상 메서드 모두 구현

    @Override
    public void sendCall() {
        System.out.println("따르릉따르릉~");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화왔어요");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자갑니다.");
    }

    @Override
    public void recieveSMS() {
        System.out.println("문자왔어요.");
    }

    // MP3Interface의 모든 추상 메서드 구현

    @Override
    public void play() {
        System.out.println("음악 연주합니다.");
    }

    @Override
    public void stop() {
        System.out.println("음악 중단합니다.");
    }

    // 추가로 작성한 메서드
    public void schedule() {
        System.out.println("일정관리합니다.");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLogo(); // 얜 default였거든
        phone.sendCall();
        phone.play();
        System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
        phone.schedule();
    }
}
