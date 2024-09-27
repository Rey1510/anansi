fun main() {
    val secretNumber = 7
    val guesses = arrayOf(5, 3, 7, 0)
    var index = 0

    while (index < guesses.size) {
        val guess = guesses[index]
        index++
        if (guess == 0) {
            println("Game berhenti, guess 0.")
            break
        } else if (guess == secretNumber) {
            println("Selamat! Angka benar: $secretNumber")
            break
        } else {
            println("Guess $guess salah. Coba lagi!")
        }
    }
}
