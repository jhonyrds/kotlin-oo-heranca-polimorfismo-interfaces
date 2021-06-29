fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Jhony",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Jhony",
        numero = 1001
    )

    val contaSalario = ContaSalario(
        titular = "Gui",
        numero = 1002
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta corrente: ${contaPoupanca.saldo}")
    println("saldo salário: ${contaSalario.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("saldo conta poupança após saque: ${contaPoupanca.saldo}")
    println("saldo após saque salário: ${contaSalario.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo conta corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo conta poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("saldo conta corrente após receber transferÊncia: ${contaCorrente.saldo}")
    println("saldo conta poupança após fazer transferência: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaSalario)

    println("saldo corrente após transferir para salário: ${contaCorrente.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")

    contaPoupanca.transfere(200.0, contaSalario)

    println("saldo poupança após transferir para salário: ${contaPoupanca.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")
}