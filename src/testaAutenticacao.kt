fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Jhony",
        cpf = "333.333.333-33",
        salario = 1000.00,
        senha = 1000
    )
    val diretora = Diretor(
        nome = "Stephanie",
        cpf = "222.222.222-22",
        salario = 2000.00,
        senha = 2000,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Zé",
        cpf = "555.555.555-55",
        senha = 1234
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 1000)
    sistemaInterno.entra(diretora, 2000)
    sistemaInterno.entra(cliente, 1234)
}