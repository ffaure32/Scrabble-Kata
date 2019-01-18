package codingdojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void getSquareForLetterIndex_should_return_good_square() {
        Square square = new Square('A', 1);

        Square squareForLetterIndex = square.getSquareForLetterIndex(2, WordDirection.HORIZONTAL);
        assertEquals('C', squareForLetterIndex.letter);
    }

    @Test
    void getSquareForLetterIndex_should_return_itself() {
        Square square = new Square('A', 1);

        Square squareForLetterIndex = square.getSquareForLetterIndex(0, WordDirection.HORIZONTAL);
        assertEquals('A', squareForLetterIndex.letter);
    }
}