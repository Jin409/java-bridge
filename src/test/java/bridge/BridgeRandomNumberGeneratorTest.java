package bridge;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BridgeRandomNumberGeneratorTest {
    @Test
    @DisplayName("0과 1 사이의 숫자만 반환한다.")
    void IsReturnNumberOfValidRange() {
        //given
        BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();

        //when
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            result.add(bridgeRandomNumberGenerator.generate());
        }
        Set<Integer> compareResult = Set.of(
                0, 1
        );

        //then
        assertThat(result).isEqualTo(compareResult);
    }
}
