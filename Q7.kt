/**
 * Created by dell on 5/25/2017.
 */


fun main(args: Array<String>) {

    var number : Int = readLine()!!.toInt()
    var digit : Int
    var total :Int=0
    while (number != 0){
     digit = (number % 10)
     total =(total + Math.pow(2.0,digit.toDouble())).toInt()
        number = (number-digit)/10
    }
    println("$total")

}
