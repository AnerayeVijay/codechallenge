import org.junit.jupiter.api.Test

class ReverseDigitTest {

    @Test
    fun `should reverse digits`() {
        val digit = 10221
        val actual = reverseDigit(digit)
        assert(actual == 12201)
    }


}
