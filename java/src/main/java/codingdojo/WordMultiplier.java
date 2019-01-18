package codingdojo;

import java.util.Arrays;

public enum WordMultiplier {
    STAR("star", 2),
    DOUBLE_WORD("2xWS", 2),
    TRIPLE_WORD("3xWS", 3),
    DEFAULT("", 1);


    public final String identifier;
    public final int multiplier;

    WordMultiplier(String identifier, int multiplier) {
        this.identifier = identifier;
        this.multiplier = multiplier;
    }

    static WordMultiplier fromIdentifier(String id) {
        return Arrays.stream(WordMultiplier.values())
                .filter(wm -> wm.identifier.equals(id))
                .findFirst().orElse(DEFAULT);
    }
}
