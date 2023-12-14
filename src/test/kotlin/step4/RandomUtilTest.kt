package step4

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import step4.util.RandomUtil

class RandomUtilTest {
    @Test
    fun `Random 값 출력 정상 동작 확인`() {
        val randomUtil = RandomUtil()
        repeat(100) {
            val randomNumber = randomUtil.getRandomNumber()
            Assertions.assertThat(randomNumber in 0..9).isTrue()
        }
    }
}