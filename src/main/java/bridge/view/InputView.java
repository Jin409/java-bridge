package bridge.view;

import bridge.validator.BridgeSizeValidator;
import bridge.validator.InputDirectionValidator;
import bridge.validator.InputGameCommandValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String READ_BRIDGE_SIZE_MESSAGE = "다리의 길이를 입력해주세요.";
    private static final String READ_MOVING_MESSAGE = "이동할 칸을 선택해주세요. (위: U, 아래: D)";
    private static final String READ_GAME_COMMAND_MESSAGE =
            "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)";

    public String readBridgeSize() {
        System.out.println(READ_BRIDGE_SIZE_MESSAGE);
        String bridgeSize = Console.readLine();
        BridgeSizeValidator.validate(bridgeSize);
        return bridgeSize;
    }

    public String readMoving() {
        System.out.println(READ_MOVING_MESSAGE);
        String direction = Console.readLine();
        InputDirectionValidator.validate(direction);
        return direction;
    }

    public String readGameCommand() {
        System.out.println(READ_GAME_COMMAND_MESSAGE);
        String gameCommand = Console.readLine();
        InputGameCommandValidator.validate(gameCommand);
        return gameCommand;
    }
}
