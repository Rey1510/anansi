fun main() {
    var grade: Int
    grade = 101
    println("Your grade is ")
    if (grade > 100) {
        println("Masukkin yang bener WOI!")
    }else if (grade in 90..100) {
        println("A")
    }else if (grade in 80..89){
        println("B")
    }else if (grade in 70..79) {
        println("C")
    }else if (grade in 60..69) {
        println("D")
    }else {
        println("F")
    }
}