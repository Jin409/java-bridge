package bridge.controller;

import bridge.view.InputView;
import bridge.view.OutputView;

public class BridgeGameController {
    private final OutputView outputView;
    private final InputView inputView;

    public BridgeGameController(
            OutputView outputView,
            InputView inputView
    ) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    public void start() {
        outputView.printStartMessage();
    }

    private void setForGame() {
        int bridgeSize = inputView.readBridgeSize();
    }

    private void run() {
        String direction = inputView.readMoving();
    }
}
