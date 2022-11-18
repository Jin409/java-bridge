package bridge.controller;

import bridge.model.BridgeGame;
import bridge.view.InputView;
import bridge.view.OutputView;

public class BridgeGameController {
    private BridgeGame bridgeGame;
    private final InputView inputView;
    private final OutputView outputView;

    public BridgeGameController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        outputView.printStartMessage();
        setForGame();
    }

    public void setForGame() {
        String bridgeSize = inputView.readBridgeSize();
        bridgeGame = new BridgeGame(Integer.parseInt(bridgeSize));
    }
}
