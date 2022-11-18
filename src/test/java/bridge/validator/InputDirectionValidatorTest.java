package bridge.validator;

import static bridge.validator.ErrorStatus.INVALID_DIRECTION_SIGN_ERROR;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatNoException;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputDirectionValidatorTest {

    @Test
    @DisplayName("입력값이 U 혹은 D가 아닌 경우 예외가 발생한다.")
    void IsReturnExceptionWithInvalidDirectionSignInput() {
        //given
        String invalidDirectionSignInput = "F";

        //when, then
        assertThatThrownBy(() -> InputDirectionValidator.validate(invalidDirectionSignInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(INVALID_DIRECTION_SIGN_ERROR.getMessage());
    }

    @Test
    @DisplayName("입력값이 문자열이 아닌 경우 예외가 발생한다.")
    void IsReturnExceptionWithInvalidTypeInput() {
        //given
        String invalidDirectionSignInput = "3";

        //when, then
        assertThatThrownBy(() -> InputDirectionValidator.validate(invalidDirectionSignInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(INVALID_DIRECTION_SIGN_ERROR.getMessage());
    }

    @Test
    @DisplayName("입력값이 조건에 맞는 경우 유효성 검사를 통과한다.")
    void IsReturnExceptionNoExceptionWithValidInput() {
        //given
        String validInput = "U";

        //when, then
        assertThatNoException().isThrownBy(() -> InputDirectionValidator.validate(validInput));
    }
}
