fun main() 
{
    
    var fatorial:Int = 0
    var acum: Int = 1
    
    while(fatorial <= 10)
    {
        
        if(fatorial != 0)
        acum = acum * fatorial

        println(acum)

        fatorial++
    }
     
}