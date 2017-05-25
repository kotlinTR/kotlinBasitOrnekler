import com.sun.deploy.resources.Deployment_pt_BR

/**
 * Created by dell on 5/25/2017.
 */

fun main(args: Array<String>) {

    val character : Char = readLine()!![0]
    val PI  = 3.14
    var area:Double=0.0
    var a : Double
    var b : Double
    if(character.equals('k') || character.equals('K')) {
        println("Write the side of the Square")
        a = readLine()!!.toDouble()
        area = a*a
    }
    else if (character.equals('d')|| character.equals('D')){
        println("Write the sides of rectangle")
         a = readLine()!!.toDouble()
        b = readLine()!!.toDouble()
        area= a*b
    }else if(character.equals('A')|| character.equals('a'))
    {
        println("Write the radius of ")
        val radius : Double = readLine()!!.toDouble()
        area = radius*radius*PI
    }

    println("Area is $area")
}