import java.time.LocalDate
import java.time.LocalTime
import java.time.Period

fun main() {

    var paciente1 = Paciente()
    paciente1.nome = "João"
    paciente1.peso = 89
    paciente1.altura = 1.80
    paciente1.dataNascimento=LocalDate.of(2000,7,2)
    paciente1.exibirDados()

    var paciente2 = Paciente()
    paciente2.nome = "Kauã Ramos"
    paciente2.peso = 80
    paciente2.altura = 1.77
    paciente2.dataNascimento=LocalDate.of(2007,7,25)
    paciente2.exibirDados()

}

