fun reserveSeat(name: String, seatNumber: Int, availableSeats: Array<Int>) {
    if (availableSeats.contains(seatNumber)) {
        availableSeats[seatNumber -1] = 0
        println("$name reserved seat $seatNumber.")
    } else {
        println("Seat $seatNumber is already reserved.")
    }
}

fun main() {
    val availableSeats = arrayOf(1, 2, 3, 4, 5)
    reserveSeat("John", 2, availableSeats)
    reserveSeat("Sarah", 2, availableSeats)
}
