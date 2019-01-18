package codingdojo

class SquareKT(val letter: Char, val number: Int) {

    fun right(): SquareKT {
        return SquareKT(letter + 1, number)
    }

    fun down(): SquareKT {
        return SquareKT(letter, number + 1)
    }

    fun move(direction: WordDirection): SquareKT {
        return direction.move(this)
    }

    fun toCoordinates(): String {
        return """$letter,$number"""
    }

    fun getSquareForLetterIndex(nbMoves: Int, direction: WordDirection): SquareKT {
        return if (nbMoves == 0) this else move(direction).getSquareForLetterIndex(nbMoves - 1, direction)
    }
}