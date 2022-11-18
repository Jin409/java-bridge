package bridge.model;

import bridge.BridgeMaker;
import bridge.BridgeRandomNumberGenerator;
import java.util.List;

public class BridgeGame {
    private Round round;
    private Bridge bridge;
    private int roundCount;

    public BridgeGame(int size) {
        bridge = makeBridge(size);
        round = new Round();
        roundCount = 1;
    }

    private Bridge makeBridge(int size) {
        List<String> path = new BridgeMaker(new BridgeRandomNumberGenerator()).makeBridge(size);
        return new Bridge(path);
    }

    public void move() {
    }

    public void retry() {
    }
}