package exception;

public class InvaildInputException extends IllegalArgumentException {

    private ErrorCode errorCode;

    public InvaildInputException(ErrorCode errorCode) {
        super(errorCode.value());

        this.errorCode = errorCode;
    }

    public enum ErrorCode {
        NAME("이름 형식이 맞지 않습니다."),
        EMAIL("이메일 형식이 맞지 않습니다."),
        NICKNAME("닉네임 형식이 맞지 않습니다."),
        PHONE_NUMBER("전화번호 형식이 맞지 않습니다."),
        PASSWORD("비밀번호는 최소 8자 ~ 최대 30자, 최소 영문 소문자, 대문자, 특수문자를 각각 하나 이상 포함해야 합니다."),
        BIRTH("생년월일은 yyyymmdd 형식에 맞추어 작성해주세요.");

        private final String message;

        ErrorCode(final String message) {
            this.message = message;
        }

        public String value() {
            return message;
        }
    }
}
