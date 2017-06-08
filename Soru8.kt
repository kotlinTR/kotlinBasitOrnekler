
import java.util.Scanner

fun main(args: Array<String>) {
    val girdi = Scanner(System.`in`)  // kullanican girdi alabilmek icin gerekli

    val n = girdi.nextInt()
    var yıldızSayısı: Int // yildizSayisini var olarak belirledik, yeniden deger atayabilmek adina
    yıldızSayısı = 2 * n - 1
    var boşluk: Int    // benzer sekilde bosluk degiskeninide var olarak belirledik yeniden deger atayabilmek icin
    boşluk = 0

    for (i in 1..n)  // 1 den n ye kadar i yi 1 artirarak olusturulan for dongusu
    {
        for (j in 1..boşluk)   // 1 den bosluk degiskeninin degerine kadar
            print(" ")
        for (k in 1..yıldızSayısı)  // 1 den yildizSayisinin degerine kadar

            print("*")

        println("")
        yıldızSayısı -= 2
        boşluk++
    }
    boşluk = n - 1
    for (i in 1..n + 1) {
        for (j in 1..boşluk + 1)

            print(" ")

        for (k in 1..yıldızSayısı)

            print("*")

        println("")
        yıldızSayısı += 2
        boşluk--
    }
}
