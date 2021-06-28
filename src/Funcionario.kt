open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    //property
    open val bonificacao: Double get() = salario * 0.1

    //função
//    open fun bonificacao(): Double = salario * 0.1
}
