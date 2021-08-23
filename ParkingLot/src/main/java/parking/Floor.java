import exception.InvalidInputException;

import java.util.Arrays;

public enum Floor {
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4),
    FIFTH(5);

    private final int floor;

    Floor(final int floor) {
        this.floor = floor;
    }

    public int value() {
        return floor;
    }

    public static Floor findByFloor(int inputFloor) {
        return Arrays.stream(Floor.values())
                .filter(f -> f.floor == inputFloor)
                .findAny()
                .orElseThrow(() -> new InvalidInputException(InvalidInputException.ErrorCode.FLOOR));
    }

}
