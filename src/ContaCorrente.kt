class ContaCorrente(
    titular: String,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.5
        if (this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}