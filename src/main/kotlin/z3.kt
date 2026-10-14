fun main(args: Array<String>) {
    print("Введите сумму покупки: ")
    val sum = readln().toInt()
    var sale = 1.00
    if (sum > 1000 && sum < 10000) {
        sale = 100.00
    }
    else if ( sum >  10000) {
        sale = sum * 0.05
    }
    else {
        sale = 0.00;
    }
    println("Сумма заказа: $sum")
    println("Сумма скидки: $sale")
}