import java.util.Scanner

fun main()
{
    val input = Scanner(System.`in`)

    print("Digite a primeira nota: ")
    val nota1 = input.nextDouble()

    print("Digite a segunda nota: ")
    val nota2 = input.nextDouble()

    print("Digite a terceira nota: ")
    val nota3 = input.nextDouble()

    val media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10.0

    if (media >= 7.0)
    {
        println("Aluno aprovado com média $media.")

    } 
    else if (media < 5.0)
    {
        println("Aluno reprovado com média $media.")
    }
    else 
    {
        println("Aluno em exame com média $media.")

        print("Digite a nota do exame: ")
        val exame = input.nextDouble()

        val novaMedia = (media + exame) / 2.0

        if (novaMedia >= 5.0) 
        {
            println("Aluno aprovado com média final $novaMedia.")
        } 
        else 
        {
            println("Aluno reprovado com média final $novaMedia.")
        }
    }
}