// https://www.codewars.com/kata/5635e7cb49adc7b54500001c/solutions/kotlin

fun count(number: Int): Int {
    val money = listOf(10, 20, 50, 100, 200, 500)
    var index = money.size - 1
    var currMoney = number
    var countMoney = 0

    while (currMoney > 0 && index >= 0) {
        val count = currMoney / money[index]

        if (count > 0) {
            countMoney += count
            currMoney -= (count * money[index])
        }

        index--
    }

    return if (currMoney == 0) countMoney else -1
}

fun main() {
    println(count(770))
    println(count(10))
}