fun main() {
    val number = readln().toInt()
    val digit1 = number / 100
    val digit2 = (number / 10) % 10
    val digit3 = number % 10
    if (digit1 < digit2 && digit2 < digit3) {
        println("YES")
    }
    else

    {
        println("NO")
    }

}