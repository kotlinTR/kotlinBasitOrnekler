/**
 * Created by dell on 5/25/2017.
 */



fun main (args: Array<String>){

    println("Write voltage value ")
    val Voltage : Double = readLine()!!.toDouble()
    println("Write the resistances (R1, R2 , R3 ) in sequence ")
    val R1 : Double = readLine()!!.toDouble()
    val R2 : Double = readLine()!!.toDouble()
    val R3 : Double = readLine()!!.toDouble();

    println("I1 : ${Voltage/R1}")
    println("I2 : ${Voltage/R2}")
    println("I3 : ${Voltage/R3}")


}