package bridge.validator;

import static bridge.validator.ErrorStatus.BRIDGE_SIZE_RANGE_ERROR;
import static bridge.validator.ErrorStatus.BRIDGE_SIZE_TYPE_ERROR;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BridgeSizeValidatorTest {
    @Test
    @DisplayName("정수가 아닌 입력값에 대하여 알맞은 예외를 반환한다.")
    void isReturnRightExceptionWithInvalidTypeInput() {
        //given
        String invalidTypeInput = "p";

        //when, then
        Assertions.assertThatThrownBy(() -> BridgeSizeValidator.validate(invalidTypeInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(BRIDGE_SIZE_TYPE_ERROR.getMessage());
    }

    @Test
    @DisplayName("범위에 맞지 않는 입력값에 대하여 알맞은 예외를 반환한다.")
    void isReturnRightExceptionWithInvalidRangeInput() {
        //given
        String invalidRangeInput = "30";

        //when, then
        Assertions.assertThatThrownBy(() -> BridgeSizeValidator.validate(invalidRangeInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(BRIDGE_SIZE_RANGE_ERROR.getMessage());
    }

    @Test
    @DisplayName("유효한 입력값에 대하여 유효성 검사가 통과한다.")
    void isReturnNoExceptionWithValidInput() {
        //given
        String validInput = "3";

        //when, then
        Assertions.assertThatNoException().isThrownBy(() -> BridgeSizeValidator.validate(validInput));
    }
}
