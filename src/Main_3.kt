fun main()
{
    val number = readln().toInt()
    val digit1 = number / 1000
    val digit2 = (number / 100) % 10
    val digit3 = (number / 10) % 10
    val digit4 = number % 10

    if (digit4 == digit1 && digit3 == digit2)
    {
        println("YES")
    }
    else
    {
        println("NO")
    }
}


