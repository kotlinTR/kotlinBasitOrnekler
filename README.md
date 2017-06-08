# coderArea

// coderArea sitesindeki Java Sorularının  KOTLIN dilinde çözümü
// Solutions of Java Questions in coderArea website

SORULAR : https://coderarea.wordpress.com/tag/sorular/
Questions: https://coderarea.wordpress.com/tag/sorular/


<b>Soru 1</b>
 
Değerleri verilen dikdörtgen ve elips şekillerinin alanlarını hesaplayan Java programını yazınız.

Dikdortgenin kenarlarının değeri kullanıcıdan alınacaktır ve kenarlar a ve b şeklinde isimlendirilebilir.
Elips şeklinin büyük ve küçük eksen uzunluklarıda a ve b şeklinde tanımlanabilir.(a ve b değerleri kullanıcıdan alınacaktır)
Not: Dikdörtgenin kenarları a ve b ise  alanı: a * b olarak hesaplanır.

**Not: Elips şekli için alan = a*b*PI

**Not: PI sayısını 3.14 olarak alınız.

Örnek girdi ve çıktı : 

 Girdi :      7    5                                                        1      9

 Çıktı :     Dikdörtgenin alanı 35 .                                       Dikdörtgenin alanı  9 .

>           Elips alanı 109,9                                              Elips alanı 28.26

<b>Soru 2</b>
 Bu soruda elektrik devreleri için yapılan hesaplamayı yapan Java programı yazmalısınız.

<img src ="https://coderarea.files.wordpress.com/2017/03/11.png"/>

Sorunun Tanımı: Voltaj ve R1, R2, R3 değerleri kullanıcıdan double şeklinde alınarak. Elektrik şemasında görülen I1, I2, I3 akımlarını double şeklinde hesaplayarak konsola yazdırmanız gerekmektedir.

**Not: OHM kanunu : V= I * R

**Not: Paralel devrelerde Voltajın eşit olduğunu unutmayınız.

**Not: Bu soru için , kullanıcıdan alınan değerler pozitif olarak varsayılmaktadır.

Örnek girdi ve çıktı aşağıda verilmiştir.


Girdi                21 4 7 8                                        13 3 6 12                                           5 2 8 2

Çıktı

I1: 5.250000                                I1: 4.333333                                 I1: 2.500000

I2: 3.000000                                I2: 2.166667                               I2: 0.625000

I3: 2.625000                                I3: 1.083333                                 I3: 2.500000



<b>Soru 3</b>
Büyük harfleri okuyan ve İngiliz alfabesindeki sıralamasını gösteren bir program yazınız. (Örneğin C alfabedeki üçüncü harftir, H ise sekizinci harftir.

Örnek girdiler ve çıktılar aşağıda verilmiştir.

>Girdi:         C   H   N
>Çıktı:         3   8   12


<b>Soru 4</b>

Saniye olarak girilen değeri “sa.dk.sn” formatına çeviriniz.

Eğer saat, dakika ya da saniye 10’dan küçükse yanına değerin yanına 0 yazınız. (Örneğin 2.1.30 yerine 02.01.30 yazdırınız.)

Girdi:           121                   3710               8040

Çıktı:          00.02.01              01.01.50           02.14.00

<b>Soru 5</b>

Bu soruda, kullanıcı tarafından istenen kare, dikdörtgen veya daire geometrik şekillerinin alanlarını hesaplayan Java programı yazmanız istenmektedir. Program şu şekilde çalışmalıdır: ilk olarak kullanıcıdan harf almanız ve bu harfe göre alan hesaplama kısmına geçmelisiniz, burada alınan harf geometrik şekili temsil etmektedir. Bununla ilgili olarak harfler ve temsil ettikleri şekiller aşağıda verilmiştir.

**Kare şekli için ‘k’ veya ‘K’ harfi**
**Dikdörtgen şekli için ‘d’ veya ‘D’ harfi**
**Daire şekli için ‘a’ veya ‘A’ harfi ( Dikdörtgen ile aynı harfe sahip olduklarından dolayı “daire ” kelimesinin ikinci harfi bu şekil için seçilmiştir.)**
Kullanıcı alanını hesaplamak istediği şekilin harfini girdikten sonra o şekil için gerekli olan uzunluklar ve değerler istenerek alan hesaplanıp kullanıcıya aktarılmalıdır.

Alan formülleri:

**Kare  için : a*a      Dikdörtgen için : a*b   Daire  için : r*r*PI

**Not : PI sayısını 3.14 alınız.

Örnek girdi ve çıktı:

Girdi           k  7                                        d  2  9                                            A  6

Çıktı          49.000000                             18.000000                               113.040000

<b>Soru 6</b>

 Kullanıcıdan pozitif tam sayı alınız ve o sayıdan küçük olan mükemmel sayıları ekrana yazdırınız.

**Mükemmel Sayı : Kendisi hariç bütün pozitif bölenlerinin toplamı kendisine eşit olan sayılara mükemmel sayı denir

Örneğin : 6 ve 28 mükemmel sayılardır çünkü (6 = 1+2+3) ve 28 = (1+2+4+7+14 ).

Girdi           7                                      500                                               1000

Çıktı            6                                      6  28  496                                     6  28  496


<b>Soru 7</b>

Kullanıcıdan pozitif tam sayı alınız ve o sayının her bir rakamını iki üzeri o rakam olacak şekilde her rakamında uygulayarak bunların toplam değerini ekrana yazdırınız .

**Örneğin, eğer kullanıcı 123 sayısını girdi olarak girerse sonuç 2^1+2^2+23 = 13 olarak hesaplayacak olan Java programını yazınız.

Girdi           252                                 1452                                   1000

Çıktı            40                                  54                                     5


<b>Soru 8</b>

Bu soruda  sizlerden *  ve ‘  ’(boşluk) karakterleri ile aşağıda verilen şekli kullanıcıdan alınan uzunluğuna göre çizmelisiniz. Örneğin, kullanıcı uzunluğu 4 olarak verdiği takdirde aşağıda gösterilen model oluşmalıdır.

<img src = "https://coderarea.files.wordpress.com/2017/03/yc4b1ldc4b1z.png?w=440"/>

> Sonuc

<img src = "https://coderarea.files.wordpress.com/2017/03/cc4b1ktc4b1.png?w=440"/>


<b>Soru 9</b>
 Klavyeden okunan bir string ifadenin palindrome (tersten okununca da aynı) olup olmadığını kontrol eden bilgisayar programını Java dilinde yazınız.

Girdi:                    avva                                                  dell

Çıktı:                   kelime tersten ayni                       kelime tersten ayni değil

<b>Soru 10</b>

1’den 999’a kadar olan tüm tek tamsayıların toplamını bulunuz.
                                                             
