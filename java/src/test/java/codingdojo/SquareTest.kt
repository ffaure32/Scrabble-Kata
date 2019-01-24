package codingdojo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SquareTest {

    @Test
    internal fun right_of_A_should_be_B() {
        val square = Square('A', 1)

        val rightSquare = square.right();

        assertEquals(rightSquare.letter, 'B')
    }

    @Test
    internal fun down_of_1_should_be_2() {
        val square = Square('D', 1)

        val rightSquare = square.down();

        assertEquals(rightSquare.number, 2)
    }

    @Test
    internal fun test_coordinates() {
        val square = Square('A', 1)

        val coordinates = square.toCoordinates()

        assertEquals(coordinates, "A,1")
    }

    @Test
    internal fun getSquareForLetterIndex_should_return_good_square() {
        val square = Square('A', 1)

        val squareForLetterIndex = square.getNeighboor(WordDirection.HORIZONTAL, 2)
        assertEquals('C', squareForLetterIndex.letter)
    }

    @Test
    internal fun getSquareForLetterIndex_should_return_itself() {
        val square = Square('A', 1)

        val squareForLetterIndex = square.getNeighboor(WordDirection.HORIZONTAL, 0)
        assertEquals('A', squareForLetterIndex.letter)
    }
}

