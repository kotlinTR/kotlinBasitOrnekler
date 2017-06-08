import java.util.*



fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val girilen = input.next()
    var tekrarMiktari: Int
    var ilkIndex: Int = 0
    var sonIndex: Int

    if (girilen.length % 2 == 0) {
        tekrarMiktari = girilen.length / 2
        sonIndex = girilen.length - 1
        while (tekrarMiktari != 0) {
            if (girilen.get(ilkIndex) == girilen.get(sonIndex)) {
                ilkIndex++
                sonIndex--
                tekrarMiktari--
            } else {
                println("kelime tersten aynı değil")
                break
            }
        }
    } else { //kelimenin harf sayısı tek ise amaç harfleri simetrik olarak kıyaslamak
        tekrarMiktari = (girilen.length - 1) / 2
        sonIndex = girilen.length - 1
        while (tekrarMiktari != 0) {
            if (girilen.get(ilkIndex) == girilen.get(sonIndex)) {
                ilkIndex++
                sonIndex--
                tekrarMiktari--
            } else {
                println("kelime tersten aynı değil")
                break
            }
        }
    }
    if (tekrarMiktari == 0) {
        println("kelime tersten aynı")
    }
}