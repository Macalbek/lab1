fun main(args: Array<String>) {
    print("Введите число: ")
    val number = readln().toInt()
    val last = (number % 10).toInt()
    var lastPr = "" //print
    if (last == 1) {
        lastPr = "человеку"
    }
    else {
        lastPr = "людям"
    }
        println("Понравилось $number $lastPr")
}

