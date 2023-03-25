import java.util.Scanner

fun main() 
{
    val input = Scanner(System.`in`)

    print("Digite o valor monetário: ")
    val valor = input.nextDouble()

    var resto = valor.toInt()
    var moedas = 0

    val valoresMoedas = listOf(100, 50, 25, 10, 5, 1)
    val qtdMoedas = mutableListOf(0, 0, 0, 0, 0, 0)

    for (i in 0..5)
    {
        moedas = resto / valoresMoedas[i]
        qtdMoedas[i] = moedas
        resto %= valoresMoedas[i]
    }

    println("Valor: $valor")
    println("Número mínimo de moedas:")
    println("1.00 * ${qtdMoedas[0]}")
    println("0.50 * ${qtdMoedas[1]}")
    println("0.25 * ${qtdMoedas[2]}")
    println("0.10 * ${qtdMoedas[3]}")
    println("0.05 * ${qtdMoedas[4]}")
    println("0.01 * ${qtdMoedas[5]}")
}