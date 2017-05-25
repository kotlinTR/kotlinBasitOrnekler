/**
 * Created by dell on 5/25/2017.
 */



fun main(args: Array<String>) {

        val seconds : Int = readLine()!!.toInt()

    val hour : Int = seconds/3600
    val minutes = (seconds-(3600*hour))/60
    val leftSecond = (seconds-(3600*hour))-(60*minutes)

    if (hour < 10)
       print("0$hour.")
     else
        print("$hour.")

    if (minutes< 10)
       print("0$minutes.")
    else
        print("$minutes.")

    if ( leftSecond < 10)
        println("0$leftSecond")
     else
        System.out.printf("$leftSecond")


}


