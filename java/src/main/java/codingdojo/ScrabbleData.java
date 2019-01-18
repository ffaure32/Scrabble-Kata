package codingdojo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScrabbleData {

    public static Map<Character, Integer> Tiles = new HashMap<Character, Integer>() {
        {
            put(' ', 0);
            put('A', 1);
            put('B', 3);
            put('C', 3);
            put('D', 2);
            put('E', 1);
            put('F', 4);
            put('G', 2);
            put('H', 4);
            put('I', 1);
            put('J', 8);
            put('K', 5);
            put('L', 1);
            put('M', 3);
            put('N', 1);
            put('O', 1);
            put('P', 3);
            put('Q', 10);
            put('R', 1);
            put('S', 1);
            put('T', 1);
            put('U', 1);
            put('V', 4);
            put('W', 4);
            put('X', 8);
            put('Y', 4);
            put('Z', 10);
        }
    };

    public static final String BLANK = "    ";
    public static final String TRIPLE_WORD = "3xWS";
    public static final String DOUBLE_LETTER = "2xLS";
    public static final String DOUBLE_WORD = "2xWS";
    public static final String TRIPLE_LETTER = "3xLS";
    public static final String STAR = "star";

    public static List<List<String>> Board = Arrays.asList(
            Arrays.asList(TRIPLE_WORD, BLANK, BLANK, DOUBLE_LETTER, BLANK, BLANK, BLANK, TRIPLE_WORD, BLANK, BLANK, BLANK, DOUBLE_LETTER, BLANK, BLANK, TRIPLE_WORD),
            Arrays.asList(BLANK, DOUBLE_WORD, BLANK, BLANK, BLANK, TRIPLE_LETTER, BLANK, BLANK, BLANK, TRIPLE_LETTER, BLANK, BLANK, BLANK, DOUBLE_WORD, BLANK),
            Arrays.asList(BLANK, BLANK, DOUBLE_WORD, BLANK, BLANK, BLANK, DOUBLE_LETTER, BLANK, DOUBLE_LETTER, BLANK, BLANK, BLANK, DOUBLE_WORD, BLANK, BLANK),
            Arrays.asList(BLANK, BLANK, BLANK, DOUBLE_WORD, BLANK, BLANK, BLANK, DOUBLE_LETTER, BLANK, BLANK, BLANK, DOUBLE_WORD, BLANK, BLANK, BLANK),
            Arrays.asList(DOUBLE_LETTER, BLANK, BLANK, BLANK, DOUBLE_WORD, BLANK, BLANK, BLANK, BLANK, BLANK, DOUBLE_WORD, BLANK, BLANK, BLANK, DOUBLE_LETTER),
            Arrays.asList(BLANK, TRIPLE_LETTER, BLANK, BLANK, BLANK, TRIPLE_LETTER, BLANK, BLANK, BLANK, TRIPLE_LETTER, BLANK, BLANK, BLANK, TRIPLE_LETTER, BLANK),
            Arrays.asList(BLANK, BLANK, DOUBLE_LETTER, BLANK, BLANK, BLANK, DOUBLE_LETTER, BLANK, DOUBLE_LETTER, BLANK, BLANK, BLANK, DOUBLE_LETTER, BLANK, BLANK),
            Arrays.asList(TRIPLE_WORD, BLANK, BLANK, DOUBLE_LETTER, BLANK, BLANK, BLANK, STAR, BLANK, BLANK, BLANK, DOUBLE_LETTER, BLANK, BLANK, TRIPLE_WORD),
            Arrays.asList(BLANK, BLANK, DOUBLE_LETTER, BLANK, BLANK, BLANK, DOUBLE_LETTER, BLANK, DOUBLE_LETTER, BLANK, BLANK, BLANK, DOUBLE_LETTER, BLANK, BLANK),
            Arrays.asList(BLANK, TRIPLE_LETTER, BLANK, BLANK, BLANK, TRIPLE_LETTER, BLANK, BLANK, BLANK, TRIPLE_LETTER, BLANK, BLANK, BLANK, TRIPLE_LETTER, BLANK),
            Arrays.asList(DOUBLE_LETTER, BLANK, BLANK, BLANK, DOUBLE_WORD, BLANK, BLANK, BLANK, BLANK, BLANK, DOUBLE_WORD, BLANK, BLANK, BLANK, DOUBLE_LETTER),
            Arrays.asList(BLANK, BLANK, BLANK, DOUBLE_WORD, BLANK, BLANK, BLANK, DOUBLE_LETTER, BLANK, BLANK, BLANK, DOUBLE_WORD, BLANK, BLANK, BLANK),
            Arrays.asList(BLANK, BLANK, DOUBLE_WORD, BLANK, BLANK, BLANK, DOUBLE_LETTER, BLANK, DOUBLE_LETTER, BLANK, BLANK, BLANK, DOUBLE_WORD, BLANK, BLANK),
            Arrays.asList(BLANK, DOUBLE_WORD, BLANK, BLANK, BLANK, TRIPLE_LETTER, BLANK, BLANK, BLANK, TRIPLE_LETTER, BLANK, BLANK, BLANK, DOUBLE_WORD, BLANK),
            Arrays.asList(TRIPLE_WORD, BLANK, BLANK, DOUBLE_LETTER, BLANK, BLANK, BLANK, TRIPLE_WORD, BLANK, BLANK, BLANK, DOUBLE_LETTER, BLANK, BLANK, TRIPLE_WORD)
    );

    public static Map<String, String> PremiumSquares = new HashMap<String, String>() {
        {
            put("A,1", TRIPLE_WORD);
            put("D,1", DOUBLE_LETTER);
            put("H,1", TRIPLE_WORD);
            put("L,1", DOUBLE_LETTER);
            put("O,1", TRIPLE_WORD);

            put("B,2", DOUBLE_WORD);
            put("F,2", TRIPLE_LETTER);
            put("J,2", TRIPLE_LETTER);
            put("N,2", DOUBLE_WORD);

            put("C,3", DOUBLE_WORD);
            put("G,3", DOUBLE_LETTER);
            put("I,3", DOUBLE_LETTER);
            put("M,3", DOUBLE_WORD);

            put("A,4", DOUBLE_LETTER);
            put("D,4", DOUBLE_WORD);
            put("H,4", DOUBLE_LETTER);
            put("L,4", DOUBLE_WORD);
            put("O,4", DOUBLE_LETTER);

            put("E,5", DOUBLE_WORD);
            put("K,5", DOUBLE_WORD);

            put("B,6", TRIPLE_LETTER);
            put("F,6", TRIPLE_LETTER);
            put("J,6", TRIPLE_LETTER);
            put("N,6", TRIPLE_LETTER);

            put("C,7", DOUBLE_LETTER);
            put("G,7", DOUBLE_LETTER);
            put("I,7", DOUBLE_LETTER);
            put("M,7", DOUBLE_LETTER);

            put("A,8", TRIPLE_WORD);
            put("D,8", DOUBLE_LETTER);
            put("H,8", "star");
            put("L,8", DOUBLE_LETTER);
            put("O,8", TRIPLE_WORD);

            put("C,9", DOUBLE_LETTER);
            put("G,9", DOUBLE_LETTER);
            put("I,9", DOUBLE_LETTER);
            put("M,9", DOUBLE_LETTER);

            put("B,10", TRIPLE_LETTER);
            put("F,10", TRIPLE_LETTER);
            put("J,10", TRIPLE_LETTER);
            put("N,10", TRIPLE_LETTER);

            put("E,11", DOUBLE_WORD);
            put("K,11", DOUBLE_WORD);

            put("A,12", DOUBLE_LETTER);
            put("D,12", DOUBLE_WORD);
            put("H,12", DOUBLE_LETTER);
            put("L,12", DOUBLE_WORD);
            put("O,12", DOUBLE_LETTER);

            put("C,13", DOUBLE_WORD);
            put("G,13", DOUBLE_LETTER);
            put("I,13", DOUBLE_LETTER);
            put("M,13", DOUBLE_WORD);

            put("B,14", DOUBLE_WORD);
            put("F,14", TRIPLE_LETTER);
            put("J,14", TRIPLE_LETTER);
            put("N,14", DOUBLE_WORD);

            put("A,15", TRIPLE_WORD);
            put("D,15", DOUBLE_LETTER);
            put("H,15", TRIPLE_WORD);
            put("L,15", DOUBLE_LETTER);
            put("O,15", TRIPLE_WORD);
        }
    };

}
