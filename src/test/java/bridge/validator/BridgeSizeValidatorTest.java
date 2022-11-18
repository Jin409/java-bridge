package bridge.validator;

import static bridge.validator.ErrorStatus.INVALID_BRIDGE_SIZE_RANGE_ERROR;
import static bridge.validator.ErrorStatus.INVALID_BRIDGE_SIZE_TYPE_ERROR;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatNoException;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BridgeSizeValidatorTest {
    @Test
    @DisplayName("정수가 아닌 경우 예외를 반환한다.")
    void IsReturnExceptionWitInvalidTypeInput() {
        //given
        String invalidTypeInput = "h";

        //when, then
        assertThatThrownBy(() -> BridgeSizeValidator.validate(invalidTypeInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(INVALID_BRIDGE_SIZE_TYPE_ERROR.getMessage());
    }

    @Test
    @DisplayName("범위에 맞지 않는 경우 예외가 발생한다.")
    void IsReturnExceptionWithInvalidRangeInput() {
        //given
        String invalidRangeInput = "0";

        //when, then
        assertThatThrownBy(() -> BridgeSizeValidator.validate(invalidRangeInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(INVALID_BRIDGE_SIZE_RANGE_ERROR.getMessage());
    }

    @Test
    @DisplayName("조건에 맞는 경우 유효성 검사를 통과한다.")
    void IsReturnNoExceptionWithValidInput() {
        //given
        String validInput = "19";

        //when, then
        assertThatNoException().isThrownBy(() -> BridgeSizeValidator.validate(validInput));
    }
}
