import car.Car;
import common.Size;
import parking.Floor;
import parking.ParkingSystem;
import parking.Position;
import parking.Spot;
import car.Number;

import java.awt.Menu;
import java.util.List;

public class ParkingLotController {
    private final int FLOOR_INDEX = 0;
    private final int SPOT_INDEX = 1;
    private final int SIZE_INDEX = 2;
    private final int NUMBER_INDEX = 3;

    private final ParkingSystem parkingSystem;

    public ParkingLotController(ParkingSystem parkingSystem) {
        this.parkingSystem = parkingSystem;
    }

    public void play() {
        String input = InputView.initMessage();
        Menu menu = Menu.findByMenu(input);

        if (Menu.INPUT_CAR == menu) {
            inPutCar();
        }

        if (Menu.OUTPUT_CAR == menu) {
            outPutCar();
        }

        if (Menu.FIND_CAR == menu) {
            findCar();
        }

        if (Menu.EXIT == menu) {
            OutputView.exitMessage();
        }


    }

    private void findCar() {
        String data = InputView.findCarMessage();
        Position position = parkingSystem.findByMyCar(data);
        OutputView.findByMyCarMessage(position);
    }

    private void outPutCar() {
        String data = InputView.outCarMessage();
        Car car = parkingSystem.takeOutCar(data);
        OutputView.takeOutCarMessage(car);
    }

    private void inPutCar() {
        List<String> data = InputView.addCarMessage();

        Floor floor = Floor.findByFloor(parseInt(data.get(FLOOR_INDEX)));
        Spot spot = Spot.findByFloor(parseInt(data.get(SPOT_INDEX)));
        Size size = Size.findBySize(parseInt(data.get(SIZE_INDEX)));
        Number number = new Number(data.get(NUMBER_INDEX));

        Position position = new Position(floor, size, spot);
        Car car = new Car(size, number);
        parkingSystem.isFullStorage();
        parkingSystem.validDuplication(position, car);
        parkingSystem.addCar(position, car);
    }

    private int parseInt(String data) {
        return Integer.parseInt(data);
    }
}
