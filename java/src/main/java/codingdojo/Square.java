package codingdojo;

public class Square {
    public final char letter;
    public final int number;

    public Square(char letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    public Square left() {
        return new Square((char)(letter+1), number);
    }

    public Square down() {
        return new Square(letter, number+1);
    }

    public String toModifier() {
        return new StringBuilder().append(letter).append(',').append(number).toString();
    }
}
