import exception.InvalidInputException;

import java.util.regex.Pattern;

public class Number {
    private final String number;
    private final String NUMBER_VALIDATION = "^[0-9]{4}$";

    public Number(String number) {
        validNumber(number);
        this.number = number;
    }

    private void validNumber(String number) {
        if (Pattern.matches(NUMBER_VALIDATION, number)) {
            throw new InvalidInputException(InvalidInputException.ErrorCode.NUMBER);
        }
    }

    public String value() {
        return number;
    }

}
