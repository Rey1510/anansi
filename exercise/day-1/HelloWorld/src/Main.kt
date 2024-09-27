fun main() {
    var price: Double = 100.0

    if (price < 0){
        println("Masukkin yang bener bang!")
    } else {
        val total = when {
            price in 50.0..100.0 -> price - (price * 0.1)
            price > 100 && price <= 200 -> price - (price * 0.2)
            price > 200.0 -> price - (price * 0.3)
            else -> price
        }
        println("Total: $total")
    }
}