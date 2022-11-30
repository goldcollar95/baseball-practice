package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {
    @Test
    void 스트라이크3() {
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(1,2,3), Arrays.asList(1,2,3));
        assertThat(result).isEqualTo("0 볼 3 스트라이크");
    }
}