/**
 * Created by dell on 5/25/2017.
 */



fun main(args: Array<String>) {

    println("Write down the UPPERCASE letter")
    val letter = readLine()!!.toCharArray()


    val sequenceOfLetter = letter[0]!!.toInt()-64

    print("Sequence of ${letter[0]} is $sequenceOfLetter")

}