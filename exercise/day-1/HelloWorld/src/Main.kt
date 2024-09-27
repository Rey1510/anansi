fun main() {
    var usage = 201.0
    var total: Double = 0.0

    if (usage <= 100 && usage >= 0){
        total = usage
    } else if (usage > 100 && usage <=200){
        total = 100 + ((usage-100)*1.5)
    } else if(usage > 200) {
        total = 250 + ((usage-200)*2)
    }

    println("Total $total")
}