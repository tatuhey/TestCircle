
/*
    Name        : Raihan Khalil Abdillah
    ID          : 30065695
    AT2 - Practical, Activity 2
    Test Circle
*/

fun main(args: Array<String>) {
    val a : Array<Circle> = arrayOf(
        Circle(2.0),
        Circle(),
        Circle(4.9),
        Circle(3.5),
        Circle(3.0)
    )
    for (i in a){
        i.displayInfoCircle()
    }


}