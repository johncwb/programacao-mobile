import java.util.Scanner

fun main()
{
    val input = Scanner(System.`in`)
    print("Digite o primeiro número: ")
    val num1 = input.nextDouble()
    print("Digite o segundo número: ")
    val num2 = input.nextDouble()
    print("Digite o terceiro número: ")
    val num3 = input.nextDouble()

    val sortedNumbers = listOf(num1, num2, num3).sorted()
    println(sortedNumbers.joinToString())
}