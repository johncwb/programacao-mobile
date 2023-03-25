fun main() 
{
    val contas = listOf(
        ContaBancaria("João Vitor", 1000.0, 1234, "001"),
        ContaBancaria("Paulo", 500.0, 5678, "002"),
        ContaBancaria("Julia", 1500.0, 2345, "001"),
        ContaBancaria("Ana", 2000.0, 7890, "003"),
        ContaBancaria("Pedro", 750.0, 3456, "002")
    )

    println("Contas em ordem crescente do saldo:")
    contas.sortedBy { it.saldo }.forEach { it.imprimirExtrato() }

    println("Contas em ordem alfabética pelo nome do cliente:")
    contas.sortedBy { it.cliente }.forEach { it.imprimirExtrato() }
}