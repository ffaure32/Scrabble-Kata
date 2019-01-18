package codingdojo;

public class Square {
    public final char letter;
    public final int number;

    public Square(char letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    public Square right() {
        return new Square((char) (letter + 1), number);
    }

    public Square down() {
        return new Square(letter, number + 1);
    }

    public Square move(WordDirection direction) {
        return direction.move(this);
    }

    public String toCoordinates() {
        return String.valueOf(letter) + ',' + number;
    }

    Square getSquareForLetterIndex(int nbMoves, WordDirection direction) {
        if (nbMoves == 0) return this;
        return move(direction).getSquareForLetterIndex(nbMoves - 1, direction);
    }
}
