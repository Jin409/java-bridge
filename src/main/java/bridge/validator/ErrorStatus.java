package bridge.validator;

public enum ErrorStatus {
    INVALID_BRIDGE_SIZE_TYPE_ERROR("다리 길이는 정수만 입력 가능합니다."),
    INVALID_BRIDGE_SIZE_RANGE_ERROR("다리 길이는 3부터 20 사이의 숫자여야 합니다."),
    INVALID_DIRECTION_SIGN_ERROR("이동할 칸은 U 혹은 D 만 입력 가능합니다.");

    private final String message;

    ErrorStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "[ERROR] " + this.message;
    }
}
