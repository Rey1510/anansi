fun main() {
    var salary : Int;
    var timeWorked : Int;

    salary = 100000
    timeWorked = 3
    if (timeWorked < 0){
        println("Masukkin yang bener bang!")
    } else {
        val total = when {
            timeWorked in 2..5 -> salary * 0.1
            timeWorked > 5 -> salary * 0.2
            else -> 0
        }
        println("Bonus: $total")
    }
}