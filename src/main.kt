fun main() {
    println("Bem vindo ao Bytebank")

    val jhony = Funcionario(
        nome = "Jhony",
        cpf = "111.111.111-11",
        salario = 1000.00
    )

    val stephanie = Gerente(
        nome = "Stephanie",
        cpf = "222.222.222-22",
        salario = 2000.00,
        senha = 1234
    )

    println("nome ${jhony.nome}")
    println("cpf ${jhony.cpf}")
    println("salario ${jhony.salario}")
    println("bonificação ${jhony.bonificacao}")

    println("------------------")

    println("nome ${stephanie.nome}")
    println("cpf ${stephanie.cpf}")
    println("salario ${stephanie.salario}")
    println("bonificação ${stephanie.bonificacao}")

    if (stephanie.autentica(1234)){
        println("autenticou com sucesso")
    }else{
        println("falha na autenticação")
    }

    println("------------------")

    val ze = Diretor(
        nome="Zé",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 1234,
        plr = 200.0
    )

    println("nome ${ze.nome}")
    println("cpf ${ze.cpf}")
    println("salario ${ze.salario}")
    println("bonificação ${ze.bonificacao}")
    println("plr ${ze.plr}")

    if (ze.autentica(1234)){
        println("autenticou com sucesso")
    }else{
        println("falha na autenticação")
    }
}