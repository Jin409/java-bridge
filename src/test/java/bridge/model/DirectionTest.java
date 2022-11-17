package bridge.model;

import static bridge.constant.BridgeGameConstant.UP_SIGN;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DirectionTest {
    @Test
    @DisplayName("방향을 나타내는 숫자에 따라 알맞은 방향의 이름을 반환한다.")
    void IsReturnRightDirectionName() {
        //given
        int directionNumber = 1;

        //when
        String directionName = Direction.findDirectionNameWithDirectionNumber(directionNumber);

        //then
        assertThat(directionName).isEqualTo(UP_SIGN);
    }
}
