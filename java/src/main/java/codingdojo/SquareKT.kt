package codingdojo

class SquareKT(val letter: Char, val number: Int) {

    fun right(): SquareKT {
        return SquareKT(letter + 1, number)
    }

    fun down(): SquareKT {
        return SquareKT(letter, number + 1)
    }




}