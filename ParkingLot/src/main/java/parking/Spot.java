import exception.InvalidInputException;

import java.util.Arrays;

public enum Spot {
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4),
    FIFTH(5);

    private final int spot;

    Spot(final int spot) {
        this.spot = spot;
    }

    public int value() {
        return spot;
    }

    public static Spot findByFloor(int inputSpot) {
        return Arrays.stream(Spot.values())
                .filter(f -> f.spot == inputSpot)
                .findAny()
                .orElseThrow(() -> new InvalidInputException(InvalidInputException.ErrorCode.SPOT));
    }

}
