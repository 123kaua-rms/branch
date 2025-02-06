import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

class Paciente {

    var nome: String? = ""
    var dataNascimento: LocalDate? = null
    var peso: Int = 0
    var altura: Double = 0.0

    private fun calcularIMC(): Double {
        return peso / altura.pow(2)
    }

    private fun classificarImc():String {
        val imc = calcularIMC()
        val classificacao : String
        if (imc < 18.5){
            classificacao = "Abaixo do peso"
        } else if (imc >= 18.5 && imc < 25.0){
            classificacao = "Peso medio"
        }else {
            classificacao = "Acima do peso"
        }
        return classificacao
    }


    fun calcularIdade(): Int{
            return Period.between(dataNascimento, LocalDate.now()).years
        }
    fun exibirDados(){
        println("____________________")
        println("RESULTADO")
        println("____________________")
        println("NOME: $nome")
        println("PESO: $peso")
        println("ALTURA: $altura")
        println("IMC: ${calcularIMC()}")
        println("Idade: ${calcularIdade()}")
        println("Classificação: ${classificarImc()}")
        println("____________________")
    }


}