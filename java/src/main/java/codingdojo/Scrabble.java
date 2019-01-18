package codingdojo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Scrabble {
    public Integer calculateScore(SquareKT firstLetterSquare, WordDirection direction, String word) {
        ModifiersBuilder builder = new ModifiersBuilder(firstLetterSquare, direction, word.length());
        List<String> modifiers = builder.getModifiers();
        return calculateBaseScore(word, modifiers);
    }

    public Integer calculateBaseScore(String word, List<String> modifiers) {
        List<Integer> basicLetterScores = getBasicLetterScores(word).collect(Collectors.toList());
        List<Integer> letterScoresMultiplied = multiplyLetters(basicLetterScores, modifiers);
        int basicWordScore = sumLetters(letterScoresMultiplied.stream());
        return multiplyWords(basicWordScore, modifiers);
    }

    public Integer calculateBaseScore(String word) {
        return sumLetters(getBasicLetterScores(word));
    }

    private int sumLetters(Stream<Integer> stream) {
        return stream.mapToInt(i -> i).sum();
    }

    private List<Integer> multiplyLetters(List<Integer> collect, List<String> modifiers) {
        return IntStream.range(0, collect.size())
                .mapToObj(i -> collect.get(i) * getMultiplier(modifiers.get(i)))
                .collect(Collectors.toList());
    }

    private Integer multiplyWords(int sum, List<String> modifiers) {
        Integer multiply = getWordMultiplier(modifiers);
        return sum * multiply;
    }

    private Integer getWordMultiplier(List<String> modifiers) {
        return modifiers.stream().map(this::getWordMultiplier).reduce(1, (a, b) -> a * b);
    }

    private Integer getWordMultiplier(String input) {
        return WordMultiplier.fromIdentifier(input).multiplier;
    }

    private Integer getMultiplier(String input) {
        return LetterMultiplier.fromIdentifier(input).multiplier;
    }

    private Stream<Integer> getBasicLetterScores(String word) {
        return word.toUpperCase()
                .chars()
                .mapToObj(i -> (char) i)
                .map(c -> ScrabbleData.Tiles.get(c));
    }
}
