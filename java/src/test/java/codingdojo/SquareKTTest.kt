package codingdojo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SquareKTTest {

    @Test
    internal fun right_of_A_should_be_B() {
        val square = SquareKT( 'A',1)

        val rightSquare = square.right();

        assertEquals(rightSquare.letter, 'B')
    }

    @Test
    internal fun down_of_1_should_be_2() {
        val square = SquareKT( 'D',1)

        val rightSquare = square.down();

        assertEquals(rightSquare.number, 2)
    }
}

