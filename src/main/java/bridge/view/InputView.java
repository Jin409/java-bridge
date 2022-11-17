package bridge.view;

import static bridge.constant.BridgeGameConstant.DOWN_SIGN;
import static bridge.constant.BridgeGameConstant.QUIT_SIGN;
import static bridge.constant.BridgeGameConstant.RETRY_SIGN;
import static bridge.constant.BridgeGameConstant.UP_SIGN;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String READ_BRIDGE_SIZE_MESSAGE = "다리의 길이를 입력해주세요.";
    private static final String READ_MOVING_MESSAGE = "이동할 칸을 선택해주세요. (위: " + UP_SIGN + ", 아래: " + DOWN_SIGN + ")";
    private static final String READ_GAME_COMMAND_MESSAGE =
            "게임을 다시 시도할지 여부를 입력해주세요. (재시도: " + RETRY_SIGN + ", 종료: " + QUIT_SIGN + " )";

    public String readBridgeSize() {
        System.out.println(READ_BRIDGE_SIZE_MESSAGE);
        return Console.readLine();
    }

    public String readMoving() {
        System.out.println(READ_MOVING_MESSAGE);
        return Console.readLine();
    }

    public String readGameCommand() {
        System.out.println(READ_GAME_COMMAND_MESSAGE);
        return Console.readLine();
    }
}
