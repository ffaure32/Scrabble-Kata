package codingdojo

class Square(val letter: Char, val number: Int) {

    fun right(): Square {
        return Square(letter + 1, number)
    }

    fun down(): Square {
        return Square(letter, number + 1)
    }

    private fun move(direction: WordDirection): Square {
        return direction.move(this)
    }

    fun toCoordinates(): String {
        return """$letter,$number"""
    }

    fun getSquareForLetterIndex(nbMoves: Int, direction: WordDirection): Square {
        return if (nbMoves == 0) this else move(direction).getSquareForLetterIndex(nbMoves - 1, direction)
    }
}