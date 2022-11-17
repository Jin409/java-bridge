package bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BridgeMakerTest {
    BridgeRandomNumberGenerator bridgeRandomNumberGenerator;
    BridgeMaker bridgeMaker;

    @BeforeEach
    void setUp() {
        bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
        bridgeMaker = new BridgeMaker(bridgeRandomNumberGenerator);
    }

    @Test
    @DisplayName("인자로 주어진 크기에 따라 알맞은 크기의 다리의 배열을 반환한다.")
    void IsReturnRightSizeOfList() {
        //given
        int size = 3;

        //when
        List<String> result = bridgeMaker.makeBridge(size);

        //then
        assertEquals(size, result.size());
    }
}
