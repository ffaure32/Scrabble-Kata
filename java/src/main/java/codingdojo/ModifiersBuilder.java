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
        final Square[] currentSquare = {firstLetterSquare};
        return IntStream.range(0, wordLength).mapToObj(i -> {
            final Square toReturn = currentSquare[0];
            currentSquare[0] = direction.move(currentSquare[0]);
            return toReturn;
        }).map(s -> s.toModifier())
                .map(s -> ScrabbleData.PremiumSquares.getOrDefault(s, ScrabbleData.BLANK))
        .collect(Collectors.toList());
    }
}
