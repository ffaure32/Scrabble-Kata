package codingdojo;

import java.util.Arrays;

public enum LetterMultiplier {
    DOUBLE_LETTER("2xLS", 2),
    TRIPLE_LETTER("3xLS", 3),
    DEFAULT("", 1);


    public final String identifier;
    public final int multiplier;

    LetterMultiplier(String identifier, int multiplier) {
        this.identifier = identifier;
        this.multiplier = multiplier;
    }

    static LetterMultiplier fromIdentifier(String id) {
        return Arrays.stream(LetterMultiplier.values())
                .filter(wm -> wm.identifier.equals(id))
                .findFirst().orElse(DEFAULT);
    }
}
