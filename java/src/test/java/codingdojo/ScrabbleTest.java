package codingdojo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static codingdojo.ScrabbleData.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScrabbleTest {
    @Test
    public void calculateBaseScore() {
        String word = "Cabbage";

        Scrabble scrabble = new Scrabble();
        Integer result = scrabble.calculateBaseScore(word);

        assertEquals(Integer.valueOf(14), result);
    }

    @Test
    public void calculateFirstSamplePart2() {
        String word = "Cabbage";
        List<String> modifiers = Arrays.asList(BLANK, TRIPLE_LETTER, BLANK, BLANK, BLANK, DOUBLE_WORD, BLANK);
        Scrabble scrabble = new Scrabble();

        Integer result = scrabble.calculateBaseScore(word, modifiers);

        assertEquals(Integer.valueOf(32), result);
    }

    @Test
    public void calculate2ndSamplePart2() {
        String word = "Cabbage";
        List<String> modifiers = Arrays.asList(DOUBLE_LETTER, BLANK, BLANK, BLANK, TRIPLE_WORD, BLANK, BLANK);
        Scrabble scrabble = new Scrabble();

        Integer result = scrabble.calculateBaseScore(word, modifiers);

        assertEquals(Integer.valueOf(51), result);
    }

    @Test
    public void calculateFirstSamplePart2IntegrationTest() {
        String word = "Cabbage";
        Scrabble scrabble = new Scrabble();
        SquareKT firstLetterSquare = new SquareKT('I', 2);
        WordDirection direction = WordDirection.HORIZONTAL;


        Integer result = scrabble.calculateScore(firstLetterSquare, direction, word);

        assertEquals(Integer.valueOf(32), result);
    }

    @Test
    public void calculate2ndSamplePart2IntegrationTest() {
        String word = "Cabbage";
        Scrabble scrabble = new Scrabble();
        SquareKT firstLetterSquare = new SquareKT('A', 4);
        WordDirection direction = WordDirection.VERTICAL;


        Integer result = scrabble.calculateScore(firstLetterSquare, direction, word);

        assertEquals(Integer.valueOf(51), result);
    }

}