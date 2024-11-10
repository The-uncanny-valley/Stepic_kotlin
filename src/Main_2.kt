fun main() {
    var number = readln().toInt()
    number += 1
    if (number % 2 == 0) {
        println(number)
    }
    else {
        number += 1
        println(number)
    }
}