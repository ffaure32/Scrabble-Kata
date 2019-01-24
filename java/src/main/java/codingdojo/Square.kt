package codingdojo

class Square(val letter: Char, val number: Int) {

    fun right(): Square {
        return Square(letter + 1, number)
    }

    fun down(): Square {
        return Square(letter, number + 1)
    }

    private fun getDirectNeighboor(direction: WordDirection): Square {
        return direction.next(this)
    }

    fun toCoordinates(): String {
        return "$letter,$number"
    }

    fun getNeighboor(direction: WordDirection, distance: Int): Square {
        if (distance == 0) return this
        else return getDirectNeighboor(direction).getNeighboor(direction, distance - 1)
    }
}