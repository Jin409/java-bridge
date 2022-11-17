package bridge;

import static bridge.model.Direction.findDirectionNameWithDirectionNumber;

import java.util.ArrayList;
import java.util.List;

public class BridgeMaker {

    private final BridgeNumberGenerator bridgeNumberGenerator;

    public BridgeMaker(BridgeNumberGenerator bridgeNumberGenerator) {
        this.bridgeNumberGenerator = bridgeNumberGenerator;
    }

    public List<String> makeBridge(int size) {
        List<String> result = new ArrayList<>();
        while (result.size() < size) {
            int bridgeNumber = bridgeNumberGenerator.generate();
            result.add(findDirectionNameWithDirectionNumber(bridgeNumber));
        }
        return result;
    }
}
