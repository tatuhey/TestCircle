import kotlin.math.*

class Circle {
    var radius: Double = 1.0

    constructor(){
        radius = 1.0
    }

    constructor(radiusCircle: Double){
        this.radius = radiusCircle
    }

    fun area(radiusCircle: Double): Double{
        var area = PI * sqrt(radiusCircle)

        return area
    }

    fun circumference(circumferenceCircle: Double): Double{
        var circumference = PI * 2 * radius

        return circumference
    }

    fun displayInfoCircle(){
        if (radius!=1.0){
            println("A circle with radius of $radius will have an area of ${area(radius)} and circumference of ${circumference(radius)}")
        }
        else
            println("A circle with radius of $radius will have an area of ${area(radius)} and circumference of ${circumference(radius)}. This is a unit circle")

    }
}