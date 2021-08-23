import exception.InvalidInputException;

import java.util.Arrays;

public enum Size {
    SMALL(1),
    MIDDLE(2),
    LARGE(3);

    private final int size;

    Size(final int size) {
        this.size = size;
    }

    public int value() {
        return size;
    }

    public static Size findBySize(int inputSize) {
        return Arrays.stream(Size.values())
                .filter(s -> s.size == inputSize)
                .findAny()
                .orElseThrow(() -> new InvalidInputException(InvalidInputException.ErrorCode.SIZE));
    }

}
