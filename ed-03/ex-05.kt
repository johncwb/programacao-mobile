interface Boleto 
{
    fun imprimirBoleto(valor:Float){}
}   

open class ContaBancaria(
    val cliente:String,
    var saldo:Float, 
    val numero:Int, 
    val agencia:Int):
    
    Comparable<ContaBancaria>,Boleto
{
   
    override fun compareTo(other: ContaBancaria): Int = this.cliente.compareTo(other.cliente) 
   
    override fun toString(): String = "$cliente $$saldo"

    var valorT: Float = 0f
    
    fun Depositar(valorDeposito:Float)
    {
        saldo = saldo + valorDeposito
    }
    
    fun Sacar(valorRetirar:Float)
    {
       saldo =  saldo - valorRetirar        
    }
    
    fun Transferir(ValorTransferencia:Float)
    {       
        saldo = saldo - ValorTransferencia
        valorT  = ValorTransferencia       
    }
    
    fun imprimirExtrato() {
        println("Cliente: $cliente,\nSaldo: R$ $saldo \n")
    }
    
      override fun imprimirBoleto(valor:Float){
        println("Boleto: R$ $valor")
    }
    
    
}


fun main() 
{
  val c = ContaBancaria("Joao",10000000f,8567,9493)
  c.imprimirBoleto(7543f)
   
}