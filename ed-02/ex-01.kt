import java.util.Scanner

fun main() 
{
    val input = Scanner(System.`in`)

    print("Digite um número inteiro: ")
    val num = input.nextInt()

    var fatorial = 1
    for (i in 2..num) 
    {
        fatorial *= i
    }

    println("O fatorial de $num é $fatorial.")
}