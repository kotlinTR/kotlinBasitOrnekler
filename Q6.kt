/**
 * Created by dell on 5/25/2017.
 */

fun main(args: Array<String>) {

    val number : Int = readLine()!!.toInt()

        for ( a in 2..number-1) {
            var total:Int =0
            for (x in 1..a -1){
                if (a%x ==0)
                    total+=x
            }

            if(total == a)
                print("$a"+" ")
        }


}