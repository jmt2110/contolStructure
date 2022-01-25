fun main(args: Array<String>) {
    var temp = 75.5
    println("Please enter your temperature:")
    temp = readLine()!!.toDouble()
    if (temp > 99.5)
        println("Your temperature is high")
    else if (temp < 97.5)
        println("Your temperature is low")
    else
        println("Your temperature is normal")

}