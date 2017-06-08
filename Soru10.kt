


fun main(args: Array<String>) {
    var ustSinir = 0
    var toplamDeger :Int=0

    while (ustSinir<1000) {
        if (ustSinir % 2 != 0)
            toplamDeger += ustSinir
        ustSinir++
    }
    println("Toplam deger $toplamDeger")

}