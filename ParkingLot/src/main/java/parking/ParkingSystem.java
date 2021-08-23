import car.Car;
import common.Size;
import exception.InvalidInputException;
import parking.Position;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingSystem {
    private static final Map<Position, Car> storage = new ConcurrentHashMap<>();

    public ParkingSystem(Position position, Car car) {
        validDuplication(position, car);
        addCar(position, car);
    }

    private void validDuplication(Position position, Car car) {
        if (storage.containsKey(position) || storage.containsValue(car)) {
            throw new InvalidInputException(InvalidInputException.ErrorCode.DUPLICATION);
        }
    }

    private void addCar(Position position, Car car) {
        if (car.size() == Size.SMALL || car.size() == position.size()) {
            storage.put(position, car);
            return;
        }
        throw new InvalidInputException(InvalidInputException.ErrorCode.NOT_CORRECT_SPOT_SIZE);
    }
}
