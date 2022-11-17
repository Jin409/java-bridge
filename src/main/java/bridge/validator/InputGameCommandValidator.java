package bridge.validator;

import static bridge.constant.BridgeGameConstant.QUIT_SIGN;
import static bridge.constant.BridgeGameConstant.RETRY_SIGN;
import static bridge.validator.ErrorStatus.INVALID_GAME_COMMAND_SIGN_ERROR;

import java.util.Objects;

public class InputGameCommandValidator {
    public static void validate(String gameCommand) {
        if (!hasValidGameCommandSign(gameCommand)) {
            throw new IllegalArgumentException(INVALID_GAME_COMMAND_SIGN_ERROR.getMessage());
        }
    }

    private static boolean hasValidGameCommandSign(String gameCommand) {
        return Objects.equals(gameCommand, RETRY_SIGN) || Objects.equals(gameCommand, QUIT_SIGN);
    }
}
