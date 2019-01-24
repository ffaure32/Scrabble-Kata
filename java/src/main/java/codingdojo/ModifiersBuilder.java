package codingdojo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ModifiersBuilder {
    private final Square firstLetterSquare;
    private final WordDirection direction;
    private final int wordLength;

    public ModifiersBuilder(Square firstLetterSquare, WordDirection direction, int wordLength) {
        this.firstLetterSquare = firstLetterSquare;
        this.direction = direction;
        this.wordLength = wordLength;
    }


    public List<String> getModifiers() {
        List<Square> collect = IntStream
                .range(0, wordLength)
                .mapToObj(i -> firstLetterSquare.getNeighboor(direction, i))
                .collect(Collectors.toList());

        return collect.stream().map(Square::toCoordinates)
                .map(s -> ScrabbleData.PremiumSquares.getOrDefault(s, ScrabbleData.BLANK))
                .collect(Collectors.toList());
    }

}
