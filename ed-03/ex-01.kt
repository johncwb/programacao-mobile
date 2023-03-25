class ContaBancaria
(
    val cliente: String,
    var saldo: Double,
    val numero: Int,
    val agencia: String
) 
{
    fun depositar(valor: Double)
    {
        saldo += valor
    }

    fun retirar(valor: Double) 
    {
        if (saldo >= valor) 
        {
            saldo -= valor
        } else {
            println("Saldo insuficiente para realizar a operação.")
        }
    }

    fun transferir(valor: Double, contaDestino: ContaBancaria) 
    {
        if (saldo >= valor) 
        {
            saldo -= valor
            contaDestino.depositar(valor)
        } else {
            println("Saldo insuficiente para realizar a operação.")
        }
    }

    fun imprimirExtrato()
    {
        println("Cliente: $cliente")
        println("Agência: $agencia")
        println("Número da conta: $numero")
        println("Saldo atual: R$ $saldo")
    }
}