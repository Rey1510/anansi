fun main() {
    var tank : Int = 0

    while(tank <= 50) {
        println("Isi tangki sekarang $tank Liter")
        tank += 5
        if(tank > 40){
            print("Isi di tangki sudah melebihi 40L")
            break
        }
    }
}
