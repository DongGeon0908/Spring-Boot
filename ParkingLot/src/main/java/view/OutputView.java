import car.Car;
import parking.Position;

public class OutputView {

    public static void takeOutCarMessage(Car car) {
        System.out.println("출차하셨습니다.");
        System.out.println(car.toString());
    }

    public static void findByMyCarMessage(Position position) {
        System.out.println("조횐 자동차 정보입니다.");
        System.out.println(position.toString());
    }

    public static void exitMessage() {
        System.out.println("감사합니다. 안녕히 가세요!");
        System.exit(0);
    }
}
