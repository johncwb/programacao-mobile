import java.time.LocalDate

class ContaPoupanca(numero: String, titular: String, saldo: Double, dataAbertura: LocalDate) : Conta(numero, titular, saldo, dataAbertura) 
{
    fun aplicarJuros()
    {
        val juros = saldo * 0.003 
        depositar(juros)
    }
}