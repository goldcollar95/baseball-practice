package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;



class RefereeTest {
    private Referee referee;

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @Test
    void 스트라이크3() {

        String result = referee.compare(Arrays.asList(1,2,3), Arrays.asList(1,2,3));
        assertThat(result).isEqualTo("0 볼 3 스트라이크");
    }

    @Test
    void 낫싱() {

        String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(7, 8, 9));
        assertThat(result).isEqualTo("낫싱");
    }

    @Test
    void 볼3() {

        String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 1));
        assertThat(result).isEqualTo("3 볼 0 스트라이크");
    }

    @Test
    void 볼2_스트라이크1() {

        String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 2));
        assertThat(result).isEqualTo("2 볼 1 스트라이크");
    }

}