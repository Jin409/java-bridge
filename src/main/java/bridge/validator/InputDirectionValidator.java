package bridge.validator;

import static bridge.constant.BridgeGameConstant.DOWN_SIGN;
import static bridge.constant.BridgeGameConstant.UP_SIGN;
import static bridge.validator.ErrorStatus.INVALID_DIRECTION_SIGN_ERROR;

import java.util.Objects;

public class InputDirectionValidator {
    public static void validate(String direction) {
        if (!hasValidDirectionSign(direction)) {
            throw new IllegalArgumentException(INVALID_DIRECTION_SIGN_ERROR.getMessage());
        }
    }

    private static boolean hasValidDirectionSign(String direction) {
        return !Objects.equals(direction, UP_SIGN) && !Objects.equals(direction, DOWN_SIGN);
    }
}
