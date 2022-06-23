import org.opentutorials.iot.Elevator; // import하면 org.opentutorials.iot.Elevator안쓰고 바로 Elevator 쓸 수 있다!
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHome {
    public static void main(String[] args) {

        String id = "JAVA APT 507";

        // Elevator call
        Elevator myElevator = new Elevator(id); // Elevator(변수 타입) myElevator(변수 이름) = new Elevator(주소)
        myElevator.callForUp(1); // 1층으로 호출

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off(); // 시큐리티 꺼짐

        // Light on
        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on(); // 홀 램프 켜짐

        Lighting floorLamp = new Lighting(id + " / floor Lamp");
        floorLamp.on();
    }
}