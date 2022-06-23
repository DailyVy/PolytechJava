import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

import javax.swing.JOptionPane;

public class OkJavaGoInHomeInput {
    public static void main(String[] args) {

        String id = args[0];
        String bright = args[1];

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

        // 밝기 조절 가능한 조명 켜기
        DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
//        moodLamp.setBright(10); // 10 % 만큼 밝기 조절
//        moodLamp.setBright(bright); // setBright는 double형이다. ==> 형변환
        moodLamp.setBright(Double.parseDouble(bright));
         moodLamp.on();
    }
}