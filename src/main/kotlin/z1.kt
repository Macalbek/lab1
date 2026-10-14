fun main(args: Array<String>) {

    print("Введите сумму перевода: ")
    val amount = readln().toDouble()
    val comm = amount * 0.0075

    if (amount < 35.00)
    {
        println("Минимальная сумма перевода - 35 рублей!")
        return
    }

    println("Сумма перевода: $amount")
    println("Комиссия: $comm")
}

