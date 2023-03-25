fun main() 
{
    val conta1 = ContaBancaria("João", 1000.0, 1234, "001")
    val conta2 = ContaBancaria("Maria", 500.0, 5678, "002")

    println("Extrato da conta 1:")
    conta1.imprimirExtrato()
    println("\nExtrato da conta 2:")
    conta2.imprimirExtrato()

    conta1.depositar(500.0)
    conta1.retirar(200.0)

    conta2.depositar(1000.0)
    conta2.transferir(300.0, conta1)

    println("\nExtrato da conta 1 após as operações:")
    conta1.imprimirExtrato()
    println("\nExtrato da conta 2 após as operações:")
    conta2.imprimirExtrato()
}