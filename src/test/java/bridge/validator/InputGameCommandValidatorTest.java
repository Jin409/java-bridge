package bridge.validator;

import static bridge.validator.ErrorStatus.INVALID_GAME_COMMAND_SIGN_ERROR;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputGameCommandValidatorTest {
    @Test
    @DisplayName("입력값이 R 혹은 Q 가 아닌 경우 예외가 발생한다.")
    void IsReturnExceptionWithInvalidGameCommandSignInput() {
        //given
        String invalidGameCommandSignInput = "K";

        //when, then
        assertThatThrownBy(() -> InputGameCommandValidator.validate(invalidGameCommandSignInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(INVALID_GAME_COMMAND_SIGN_ERROR.getMessage());
    }

    @Test
    @DisplayName("입력값이 문자열이 아닌 경우 예외가 발생한다..")
    void IsReturnExceptionWithInvalidTypeInput() {
        //given
        String invalidGameCommandSignInput = "3";

        //when, then
        assertThatThrownBy(() -> InputGameCommandValidator.validate(invalidGameCommandSignInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(INVALID_GAME_COMMAND_SIGN_ERROR.getMessage());
    }

    @Test
    @DisplayName("입력값이 조건에 맞는 경우 유효성 검사를 통과한다.")
    void IsReturnNoExceptionWithValidInput() {
        //given
        String validInput = "R";

        //when, then

    }
}
